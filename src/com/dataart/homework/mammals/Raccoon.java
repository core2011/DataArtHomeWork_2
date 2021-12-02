package com.dataart.homework.mammals;

import com.dataart.homework.listenum.KindAnimal;
import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.parentClases.Mammals;
//enot
public class Raccoon extends Mammals  {

    {
        maxWeight = 9;
        needForLife = 50;
        kindAnimal = KindAnimal.MEATEATING;
        kindFamily = KindFamily.RACCOON;

    }

    public Raccoon(String name, String dateBorn) {
        super(name, dateBorn);
    }


    @Override
    public void eat(String giveFood) {
        super.likeFood(giveFood,kindAnimal);
    }
}
