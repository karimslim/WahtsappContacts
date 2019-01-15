package com.example.asus.whatsappcontacts;

/**
 * Created by asus on 15/01/2019.
 */

public class Contact {
    private String id;
    private String number;
    private String name;

    public Contact() {
    }

    public Contact(String id, String number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
