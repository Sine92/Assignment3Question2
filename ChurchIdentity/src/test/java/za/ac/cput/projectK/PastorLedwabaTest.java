package za.ac.cput.projectK;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PastorLedwabaTest {

    PastorLedwaba pastorLedwaba;
    @Before
    public void setUp() throws Exception {

        pastorLedwaba = new PastorLedwaba
                .Builder()
                .name("Pastor Jerome")
                .build();
    }

    @Test
    public void getName() {

        Assert.assertEquals("Pastor Jerome",pastorLedwaba.getName());
    }

    @Test// Testing Identity
    public void equals() {
        pastorLedwaba = new PastorLedwaba
                .Builder()
                .name("Pastor Jerome")
                .build();
        Assert.assertSame(pastorLedwaba,pastorLedwaba);
    }


}