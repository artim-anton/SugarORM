package com.example.admin.sugarorm;

import com.orm.SugarRecord;

public class Contact extends SugarRecord{

    String name;
    String mail;

    //обязательно создайте пустой конструктор
    public Contact() {
    }

    public Contact(String mail, String name) {
        this.mail = mail;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}