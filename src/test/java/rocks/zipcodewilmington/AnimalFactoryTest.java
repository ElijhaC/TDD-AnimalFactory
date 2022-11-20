package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
       String name = "Scooby";
       Date birthDate = new Date();
       Dog dog = AnimalFactory.createDog(name, birthDate);

       String expected = "Scooby";
       String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        String name = "Tom";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);

        String expected = "Tom";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }
}
