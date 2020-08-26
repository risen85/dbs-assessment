package com.dbs.bean;

public class PetProjectSingleton {
    private static PetProjectSingleton instance;
    private String name;

    private PetProjectSingleton() {
    }

    public static PetProjectSingleton getInstance() {
        if (instance == null) {
            instance = new PetProjectSingleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
