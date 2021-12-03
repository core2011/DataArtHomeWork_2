package com.dataart.homework;

import com.dataart.homework.fishs.Carp;
import com.dataart.homework.fishs.Ram;
import com.dataart.homework.mammals.*;
import com.dataart.homework.parentClases.Animal;

import java.util.ArrayList;

import static com.dataart.homework.logic.BusinessLogic.*;

public class HomeWork2 {
    public static void main(String[] args) {

        ArrayList<Animal> listAnimal = new ArrayList<Animal>(){{
                add(new Lynx("Ris", "28-09-2020"));
                add(new Raccoon("Enot", "30-01-2018"));
                add(new Kangaroo("Kengury", "15-03-2015"));
                add(new Eagle("Orel", "01-12-2017"));
                add(new Ostrich("Straus", "23-02-2019"));
                add(new Carp("Carp", "12-08-2021"));
                add(new Ram("Taran", "18-06-2020"));
            }};

        printAllProperty(listAnimal);
        callEat(listAnimal);
        countSquareForZoo(listAnimal);
        countWeightByWhereLive(listAnimal);

    }
}
