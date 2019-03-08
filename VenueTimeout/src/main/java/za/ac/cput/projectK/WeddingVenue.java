package za.ac.cput.projectK;

import java.util.Objects;

public class WeddingVenue {


    private String venueName;
    private boolean isAvailable;
    private int quantity;

    private WeddingVenue() {

    }

    public String getVenueName() {
        return venueName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    public WeddingVenue(Builder builder)
    {
        this.venueName = builder.venueName;
        this.isAvailable = builder.isAvailable;
        this.quantity = builder.quantity;
    }

    public static class Builder {
        private String venueName;
        private boolean isAvailable;
        private int quantity;

        public Builder venueName(String value) {
            this.venueName = value;
            return this;
        }

        public Builder isAvailable(boolean value) {
            this.isAvailable = value;
            return this;
        }

        public Builder quantity(int value) {
            this.quantity = value;
            return this;
        }
        public WeddingVenue build()
        {
            return new WeddingVenue(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeddingVenue that = (WeddingVenue) o;
        return isAvailable == that.isAvailable &&
                quantity == that.quantity &&
                venueName.equals(that.venueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueName, isAvailable, quantity);
    }
}

