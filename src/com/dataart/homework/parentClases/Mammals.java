package com.dataart.homework.parentClases;

import com.dataart.homework.listenum.KindLive;

public abstract class Mammals extends Animal{

    {
        whereLive = KindLive.LAND;
    }

    public Mammals(String name, String dateBorn) {
        super(name, dateBorn);
    }


}
