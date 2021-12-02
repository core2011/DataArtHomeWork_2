package com.dataart.homework.fishs;

import com.dataart.homework.parentClases.Fishes;

import static com.dataart.homework.listenum.KindAnimal.MEATEATING;
import static com.dataart.homework.listenum.KindFamily.RAM;

//тарань
public class Ram extends Fishes {

    {
        maxWeight = 2;
        needForLife = 5;
        kindAnimal = MEATEATING;
        kindFamily = RAM;
    }

    public Ram(String name, String dateBorn) {
        super(name, dateBorn);
    }



}
