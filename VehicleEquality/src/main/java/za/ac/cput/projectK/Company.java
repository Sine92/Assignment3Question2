package za.ac.cput.projectK;

import java.util.Objects;

public class Company {

    private String compName;
    private String carType;


    private Company()
    {

    }

    public String getCompName() {
        return compName;
    }

    public String getCarType() {
        return carType;
    }

    public Company(Builder builder)
    {
        this.compName = builder.compName;
        this.carType = builder.carType;
    }

    public static class Builder{

        private String compName;
        private String carType;

        public Builder compName(String value)
        {
            this.compName = value;
            return this;
        }
        public Builder carType(String value)
        {
            this.carType = value;
            return this;
        }
        public Company build()
        {
            return new Company(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return compName.equals(company.compName) &&
                Objects.equals(carType, company.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compName, carType);
    }
}

