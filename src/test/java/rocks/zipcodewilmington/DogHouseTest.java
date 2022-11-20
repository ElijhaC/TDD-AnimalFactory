package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addtest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);

        ArrayList<Dog> DogHouse = new ArrayList<>();
        DogHouse.add(dog);
        Assert.assertTrue(DogHouse.contains(dog));

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removetest() {
        Dog dog = AnimalFactory.createDog("Milo", new Date());

        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {

        Dog dog = AnimalFactory.createDog("Milo", new Date());
        DogHouse.add(dog);

        DogHouse.remove(1);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogIdTest() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        String expected = "Milo";
        String actual = DogHouse.getDogById(0).getName();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
