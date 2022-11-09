package poe.model;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrainee {

    @Test
    void testDefaultConstructor(){
        Trainee trainee = new Trainee(); // Trainee trainee = new Trainee(); valable pour un constructeur sans paramètres (??)
        System.out.println(trainee);
        System.out.println(trainee.hashCode());
        System.out.println(trainee.getFirstname());
        trainee.setFirstname("Provençal");
        System.out.println(trainee.getFirstname().toLowerCase());
    }

    @Test
    void testAllArgsConstructors(){
        LocalDate birthdate = LocalDate.of(1100, 2, 29);
        Trainee trainee = new Trainee ("Provençal", "Le Gaulois", birthdate);
        assertEquals("Provençal", trainee.getFirstname(), "firstname");
        assertEquals("Le Gaulois", trainee.getLastname(), "lastname");
        assertEquals(birthdate, trainee.getBirthdate(), "birthdate");
    }

    @Test
    void severalInstances() {
        Trainee trainee1 = new Trainee();
        Trainee trainee2 = new Trainee();
        System.out.println(trainee1);
        System.out.println(trainee2);
    }
    @Test
    void testToString(){
        Trainee trainee = new Trainee("Hervé", "De Rinel", LocalDate.of(1094, 11, 25));
        System.out.println(trainee);
    }
}