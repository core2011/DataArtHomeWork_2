package com.dataart.homework.parentClases;

import com.dataart.homework.listenum.KindLive;

public abstract class Fishes extends Animal {


    {
        whereLive = KindLive.SWIMMING;
    }

    public Fishes(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
