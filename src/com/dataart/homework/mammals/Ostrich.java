package com.dataart.homework.mammals;

import com.dataart.homework.listenum.KindAnimal;
import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.parentClases.Mammals;

// straus
public class Ostrich extends Mammals  {

    {
        maxWeight = 140;
        needForLife = 150;
        kindAnimal = KindAnimal.HERBIVORE;
        kindFamily = KindFamily.OSTRICH;
    }

    public Ostrich(String name, String dateBorn) {
        super(name, dateBorn);
    }

    @Override
    public void eat(String giveFood) {
        super.likeFood(giveFood,kindAnimal);
    }



}
