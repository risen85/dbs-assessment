package com.dbs.bean;

public abstract class MediaPrototype {
    private String name;
    private String type;

    public MediaPrototype(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public abstract MediaPrototype clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
