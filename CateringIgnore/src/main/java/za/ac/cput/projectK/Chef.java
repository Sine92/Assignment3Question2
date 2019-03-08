package za.ac.cput.projectK;

import java.util.Objects;

public class Chef {


    private String chefName;
    private int level;

    private Chef()
    {

    }

    public String getChefName() {
        return chefName;
    }

    public int getLevel() {
        return level;
    }

    public Chef(Builder builder) {
        this.chefName = builder.chefName;
        this.level = builder.level;

    }

    public static class Builder {

        private String chefName;
        private int level;

        public Builder chefName(String value) {
            this.chefName = value;
            return this;
        }
        public Builder level(int value) {
            this.level = value;
            return this;
        }
        public Chef build()
        {
            return new Chef(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chef chef = (Chef) o;
        return level == chef.level &&
                chefName.equals(chef.chefName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chefName, level);
    }
}
