package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> petName = new ArrayList<>();

        System.out.println("Welcome to Pet Simulator!\n" + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" + "Please fill out this questionnaire below!\n");
        System.out.println("1. How many pets do you own?\nEnter Number: ");
        int numPets = userInput.nextInt();

            for (int i = 0; i < numPets; i++){
                System.out.println("2a. What is kind of animal is your pet?\nEnter Animal: ");
                String kindOfPets = userInput.next();
                animals.add(kindOfPets);
                System.out.println("2b. What is your pet(s) name?\nEnter Name: ");
                String namesOfPets = userInput.next();
                petName.add(namesOfPets);

            }

            int typeOfPetLength = animals.size();
            int namesOfPetsLength = petName.size();
            String[] kindOfPetArray = new String[typeOfPetLength];
            String[] nameOfPetArray = new String[namesOfPetsLength];

            for (int i = 0; i < typeOfPetLength; i++) {
                kindOfPetArray[i] = animals.get(i);
                nameOfPetArray[i] = petName.get(i);

            }
        System.out.println("\nYou have " + typeOfPetLength + " Pets!\n");
        for (int i = 0; i < namesOfPetsLength; i++){
            System.out.println("A " + kindOfPetArray[i] + " with the name " + nameOfPetArray[i]);
        }
    }
}
