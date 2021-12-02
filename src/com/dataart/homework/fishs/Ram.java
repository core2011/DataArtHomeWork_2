package com.dataart.homework.fishs;

import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.parentClases.Fishes;
import com.dataart.homework.listenum.KindAnimal;

//тарань
public class Ram extends Fishes {

    {
        maxWeight = 2;
        needForLife = 5;
        kindAnimal = KindAnimal.MEATEATING;
        kindFamily = KindFamily.RAM;
    }

    public Ram(String name, String dateBorn) {
        super(name, dateBorn);
    }


    @Override
    public void eat(String giveFood) {
        super.likeFood(giveFood,kindAnimal);
    }


}
