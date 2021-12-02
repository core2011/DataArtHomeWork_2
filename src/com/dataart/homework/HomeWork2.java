package com.dataart.homework;

import com.dataart.homework.logic.BusinessLogic;
import com.dataart.homework.parentClases.Animal;
import com.dataart.homework.fishs.*;
import com.dataart.homework.mammals.*;
import java.util.ArrayList;

public class HomeWork2 {
    public static void main(String[] args) {

        ArrayList<Animal> listAnimal = new ArrayList<>();

        listAnimal.add(new Lynx("Ris", "28-09-2020"));
        listAnimal.add(new Raccoon("Enot", "30-01-2018"));
        listAnimal.add(new Kangaroo("Kengury", "15-03-2015"));
        listAnimal.add(new Eagle("Orel", "01-12-2017"));
        listAnimal.add(new Ostrich("Straus", "23-02-2019"));
        listAnimal.add(new Carp("Carp", "12-08-2021"));
        listAnimal.add(new Ram("Taran", "18-06-2020"));

        BusinessLogic.printAllProperty(listAnimal);
        BusinessLogic.callEat(listAnimal);
        BusinessLogic.countSquareForZoo(listAnimal);
        BusinessLogic.countWeightByWhereLive(listAnimal);

    }
}
