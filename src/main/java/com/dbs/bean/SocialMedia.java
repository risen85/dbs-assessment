package com.dbs.bean;

public class SocialMedia extends MediaPrototype {

    public SocialMedia(String name, String type) {
        super(name, type);
    }

    public SocialMedia clone() {
        return new SocialMedia(this.getName(), this.getType());
    }

    public void publish() {
        System.out.println(PetProjectSingleton.getInstance().getName()
                + " has been published to " + this.getType()
                + ":" + this.getName());
    }
}
