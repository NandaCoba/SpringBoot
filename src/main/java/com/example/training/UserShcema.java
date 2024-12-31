package com.example.training;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UserShcema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    private String nama;
    private int usia;


    public String getNama(){
        return this.nama;
    }

    public int getUsia(){
        return this.usia;
    }

    public UUID getId(){
        return id;
    }


    public String setNama(String nama){
       return this.nama = nama;
    }

    public int setUsia(int usia){
        return this.usia = usia;
    }
}
