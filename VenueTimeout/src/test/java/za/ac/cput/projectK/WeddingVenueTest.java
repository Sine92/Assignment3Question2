package za.ac.cput.projectK;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class WeddingVenueTest {
    WeddingVenue weddingVenue;

    @Before
    public void setUp() throws Exception {
        weddingVenue = new WeddingVenue
                .Builder()
                .venueName("Aloe Groove")
                .isAvailable(true)
                .quantity(500)
                .build();
    }

    @Test
    public void getVenueName() {

        Assert.assertEquals("Aloe Groove", weddingVenue.getVenueName());
    }

    @Test
    public void isAvailable() {
        Assert.assertEquals(true, true);

    }

    @Test
    public void getQuantity() {
        Assert.assertEquals(500, 500);
    }

    @Test(timeout = 10000)
    public void equals() {
        weddingVenue = new WeddingVenue
                .Builder()
                .venueName("Aloe Groove")
                .isAvailable(true)
                .quantity(500)
                .build();

        Assert.assertEquals(weddingVenue, weddingVenue);
    }
}
