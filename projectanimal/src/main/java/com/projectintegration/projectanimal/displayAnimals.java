package com.projectintegration.projectanimal;

public class displayAnimals {

    public void printAnimal(Animal animal) {
        System.out.println(animal.getIsVaccinated());
        if (animal.getIsVaccinated()){
            switch (animal.getGender()) {
                case "male" -> {
                    System.out.println("------------------ It is a male --------------------");
                    printAllAnimals(animal);
                }
                case "female" -> {
                    System.out.println("------------------ It is a female --------------------");
                    printAllAnimals(animal);
                }
                case "" -> {
                    System.out.println("------------------ No Gender is mentionned for this animal --------------------");
                    printAllAnimals(animal);
                }
            }
        }
        else{
            System.out.println("------------------ This animal is not vaccinate you can't adopt it --------------------");
            printAllAnimals(animal);
        }
    }

    public void printAllAnimals (Animal animal){
        System.out.println("Registration number : " + animal.getId());
        System.out.println("Name : " + animal.getName());
        System.out.println("Type : " + animal.getType());
        System.out.println("Age : " + animal.getAge());
        System.out.println("Gender : " + animal.getGender());
        System.out.println("Weight : " + animal.getWeight());
        System.out.println("Is Vaccinated ? : " + animal.getIsVaccinated());

    }
}
