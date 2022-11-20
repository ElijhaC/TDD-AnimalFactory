package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import javax.naming.CompositeName;
import javax.naming.Name;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String expected = "Zula";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Date catBirthday = new Date();

        String expected = catBirthday.toString();
        String actual = cat.getBirthDate().toString();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    // Given (cat data)
    @Test
    public void eat(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.eat(new Food());
        Integer expected = 1;
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer id = cat.getId();
        Assert.assertEquals(givenId, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritanceTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammalInheritanceTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
