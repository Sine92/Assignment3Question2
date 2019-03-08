package za.ac.cput.projectK;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {
    Company company;
    @Before
    public void setUp() throws Exception {

        company = new Company
                .Builder()
                .compName("Royce Rolls")
                .carType("Convertable")
                .build();

    }

    @Test(expected = AssertionError.class) //Failling test case
    public void getCompName() {

        Assert.assertEquals("Mercedes Benz",company.getCompName());
    }

    @Test
    public void getCarType() {

        Assert.assertEquals("Convertable",company.getCarType());
    }

    @Test // Testing equality
    public void equals() {
        Company comz = new Company
                .Builder()
                .compName("Royce Rolls")
                .carType("Convertable")
                .build();
        Assert.assertEquals(comz,company);

    }
}
