package za.ac.cput.projectK;

import javafx.util.Builder;

import java.util.Objects;

public class PastorLedwaba {

    private String name;



    private PastorLedwaba()
    {

    }


    public String getName() {
        return name;
    }

    public PastorLedwaba(Builder builder) {
        this.name = builder.name;


    }


    public static class Builder{

        private String name;

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }
        public PastorLedwaba build()
        {
            return new PastorLedwaba(this);
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PastorLedwaba that = (PastorLedwaba) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
