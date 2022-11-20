package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        ArrayList<Cat> CatHouse = new ArrayList<>();
        CatHouse.add(cat);

        Assert.assertTrue(CatHouse.contains(cat));
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        Cat cat = AnimalFactory.createCat("Zula", new Date());

        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {

        Cat cat = AnimalFactory.createCat("Zula", new Date());
        CatHouse.add(cat);

        CatHouse.remove(1);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        String expected = "Zula";
        String actual = CatHouse.getCatById(0).getName();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
