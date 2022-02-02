package com.pedroperez.springboot.factory;

import com.pedroperez.springboot.model.Cat;
import com.pedroperez.springboot.model.Dog;
import com.pedroperez.springboot.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetFactory {
    public Pet createPet(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new UnsupportedOperationException("unknown animal type");
        }
    }
}
