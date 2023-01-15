package com.projectintegration.projectanimal;

import org.springframework.stereotype.Component;

@Component
public class SelectAnimal {
    public Animal selectAnimal(Animal animal){
        Animal newAnimal = new Animal();
        newAnimal.setId(animal.getId());
        newAnimal.setName(animal.getName());
        newAnimal.setType(animal.getType());
        newAnimal.setAge(animal.getAge());
        newAnimal.setGender(animal.getGender());
        newAnimal.setWeight(animal.getWeight());
        newAnimal.setVaccinated(animal.getIsVaccinated());
        return newAnimal;
    }
}
