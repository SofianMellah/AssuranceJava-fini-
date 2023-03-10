package com.afpa.www.main;

import com.afpa.www.bean.Assurance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.println("Renseignez votre âge");
        age = sc.nextInt();
        System.out.println(age);

        int anneePermis = 0;
        System.out.println("Renseignez depuis combien de temps vous avez le permis");
        anneePermis = sc.nextInt();
        System.out.println(anneePermis);

        int nombreAccidents = 0;
        System.out.println("Renseignez votre nombre d'accidents");
        nombreAccidents = sc.nextInt();
        System.out.println(nombreAccidents);

        int ancienneAssurance = 0;
        System.out.println("Renseignez votre ancienneté dans notre assurance");
        ancienneAssurance = sc.nextInt();
        System.out.println(ancienneAssurance);

        Assurance maVar = new Assurance (age, anneePermis, nombreAccidents, ancienneAssurance);
        maVar.calcul();
    }
}