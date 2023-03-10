package com.afpa.www.bean;

public class Assurance {
    private int age;
    private int anneePermis;
    private int nombreAccidents;
    private int ancienneteAssurance;
    public Assurance(int age, int anneePermis, int nombreAccidents, int ancienneteAssurance){
        this.age = age;
        this.anneePermis = anneePermis;
        this.nombreAccidents = nombreAccidents;
        this.ancienneteAssurance = ancienneteAssurance;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnneePermis() {
        return anneePermis;
    }

    public void setAnneePermis(int anneePermis) {
        this.anneePermis = anneePermis;
    }

    public int getNombreAccidents() {
        return nombreAccidents;
    }

    public void setNombreAccidents(int nombreAccidents) {
        this.nombreAccidents = nombreAccidents;
    }

    public int getAncienneteAssurance() {
        return ancienneteAssurance;
    }

    public void setAncienneteAssurance(int ancienneteAssurance) {
        this.ancienneteAssurance = ancienneteAssurance;
    }

    public void calcul(){


        // Début tarif rouge
        if ((age < 25 && anneePermis < 2 && nombreAccidents < 1) || (age < 25 && anneePermis >= 2 && nombreAccidents > 0) || (age >= 25 && anneePermis >= 2 && nombreAccidents == 2)) {
            System.out.println("Tarif rouge");
        }
        // Fin tarif rouge


        // Début tarif orange
        if ((age < 25 && anneePermis >= 2 && nombreAccidents < 1) || (age >= 25 && anneePermis >= 2 && nombreAccidents < 2 && nombreAccidents >= 1) || (age >= 25 && anneePermis < 2 && nombreAccidents < 1) || (age < 25 && anneePermis < 2 && nombreAccidents < 1 && ancienneteAssurance >= 1) || (age < 25 && anneePermis >= 2 && nombreAccidents > 0 && ancienneteAssurance >= 1) || (age >= 25 && anneePermis >= 2 && nombreAccidents == 2 && ancienneteAssurance >= 1)) {
            System.out.println("Tarif orange");
        }
        // Fin tarif orange


        // Début tarif vert
        if ((age >= 25 && anneePermis >= 2 && nombreAccidents < 1 && ancienneteAssurance < 1) || (age < 25 && anneePermis >= 2 && nombreAccidents < 1 && ancienneteAssurance >= 1) || (age >= 25 && anneePermis >= 2 && nombreAccidents < 2 && nombreAccidents >= 1 && ancienneteAssurance >= 1) || (age >= 25 && anneePermis < 2 && nombreAccidents < 1 && ancienneteAssurance >= 1)) {
            System.out.println("Tarif vert");

        }
        // Fin tarif vert


        // Début tarif bleu
        if ((age >= 25 && anneePermis >= 2 && nombreAccidents < 1 && ancienneteAssurance >= 1)) {
            System.out.println("Tarif bleu");
        }
        // Fin tarif bleu
    }
}
