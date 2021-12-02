package com.dataart.homework.logic;

import com.dataart.homework.interfaces.SkillEat;
import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.listenum.KindLive;
import com.dataart.homework.parentClases.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static com.dataart.homework.listenum.KindFamily.*;

public class BusinessLogic {

    public static void printAllProperty(ArrayList listAnimal) {
        listAnimal.forEach(System.out::println);
        System.out.println();
    }

    public static void callEat(ArrayList<Animal> listAnimal) {
        String[] arrFood = {"Grass", "Meat"};

        for (SkillEat la : listAnimal) {
            for (String food : arrFood) {
                la.eat(food);
            }
        }
        System.out.println();
    }

    public static void countSquareForZoo(ArrayList<Animal> listAnimal) {
        HashMap<KindFamily, Integer> mapNeedCount = new HashMap<>();
        mapNeedCount.put(LYNX, 5);
        mapNeedCount.put(RACCOON, 4);
        mapNeedCount.put(KANGAROO, 2);
        mapNeedCount.put(EAGLE, 7);
        mapNeedCount.put(OSTRICH, 3);
        mapNeedCount.put(CARP, 15);
        mapNeedCount.put(RAM, 7);

        int count = 0;
        for (Animal animal : listAnimal) {
            count = count + (animal.needForLife * mapNeedCount.get(animal.kindFamily));
        }
        System.out.println("For these animals " + mapNeedCount + " need " + count + " square meters in zoo");
        System.out.println();
    }

    public static void countWeightByWhereLive(ArrayList<Animal> listAnimal) {
        Map<KindLive, Integer> listGroupByWhereLive = listAnimal.stream()
                .collect(
                        Collectors.groupingBy(
                                Animal::getWhereLive,
                                Collectors.summingInt(
                                        Animal::getMaxWeight
                                ))
                );

        System.out.println("For animals from different habitats, transport is required with the following carrying capacity (kg): " + listGroupByWhereLive);

    }


}
