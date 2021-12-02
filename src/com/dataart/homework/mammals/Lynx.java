package com.dataart.homework.mammals;

import com.dataart.homework.listenum.KindAnimal;
import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.parentClases.Mammals;

public class Lynx extends Mammals {

    {
        maxWeight = 30;
        needForLife = 200;
        kindAnimal = KindAnimal.MEATEATING;
        kindFamily = KindFamily.LYNX;

    }

    public Lynx(String name, String dateBorn) {
        super(name, dateBorn);
    }

    @Override
    public void eat(String giveFood) {
        super.likeFood(giveFood,kindAnimal);
    }


}
