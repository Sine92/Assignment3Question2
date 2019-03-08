package za.ac.cput.projectK;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChefTest {
    Chef chef;
    @Before
    public void setUp() throws Exception {

        chef = new Chef
                .Builder()
                .chefName("Lorraine")
                .level(6)
                .build();
    }
    @Ignore
    @Test
    public void getChefName() {

        Assert.assertEquals("Lorraine",chef.getChefName());
    }

    @Test
    public void getLevel() {
        Assert.assertEquals(6,chef.getLevel());
    }

    @Test
    public void equals() {

        Chef  chefs = new Chef
                .Builder()
                .chefName("Lorraine")
                .level(6)
                .build();
        Assert.assertEquals(chefs,chef);

    }


}