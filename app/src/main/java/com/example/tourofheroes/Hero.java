package com.example.tourofheroes;


import android.icu.util.ULocale;

public class Hero {
    private String name, city;
    private double powerLvl;
    private Employer employer;
    private long id;

    public enum Employer {
        MARVEL, DC, TOEI, NINTENDO, SONY
    }

    public Hero(String name, double powerLvl, Employer employer, String city) {
        this.name = name;
        this.powerLvl = powerLvl;
        this.employer = employer;
        this.city = city;
    }

    public Hero(String name, double powerLvl, Employer employer, String city, long id) {
        this.name = name;
        this.powerLvl = powerLvl;
        this.employer = employer;
        this.city = city;
        this.id = id;
    }

    // Getters and Setters

    public String getName() { return name; }

    public String getCity() { return city; }

    public double getPowerLvl() { return powerLvl; }

    public Employer getEmployer(){ return employer; }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " City: " + city + " Power Level: " + powerLvl +
                " Employer: " + employer.name();
    }

    public int getAssociatedDrawable() {
        return employerToDrawable(employer);
    }

    public static int employerToDrawable(Employer employer) {
        switch (employer) {
            case MARVEL:
                return R.drawable.marvel;
            case DC:
                return R.drawable.dc;
            case TOEI:
                return R.drawable.toei;
            case NINTENDO:
                return R.drawable.nintendo;
            case SONY:
                return R.drawable.sony;
        }
        return R.drawable.sample;
    }

}
