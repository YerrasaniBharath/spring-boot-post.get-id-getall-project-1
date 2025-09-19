package com.store.bharath_book_store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    private int id;
    private  String Name;
    private  String Gmail;

    public Author( int id , String Name,String Gmail){
        this.id=id;
        this.Name=Name;
        this.Gmail=Gmail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
