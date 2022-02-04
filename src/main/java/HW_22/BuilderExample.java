package HW_22;

public class BuilderExample {
    private String coffeeSort;
    private String countryOrigin;
    private int cropYear;
    private String roastingType;
    private String dispatchCountry;
    private int bagsAmount;
    private String coffeePrice;

    private CoffeeMachineType coffeeMachineType;

    private BuilderExample() {}

    public String getCoffeeSort() {
        return coffeeSort;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public int getCropYear() {
        return cropYear;
    }

    public String getRoastingType() {
        return roastingType;
    }

    public String getDispatchCountry() {
        return dispatchCountry;
    }

    public int getBagsAmount() {
        return bagsAmount;
    }

    public String getCoffeePrice() {
        return coffeePrice;
    }

    public CoffeeMachineType getCoffeeMachineType() {
        return coffeeMachineType;
    }

    public static Builder getBuilder () {
        return new BuilderExample().new Builder();
    }

    public class Builder {

        private Builder(){}

        public Builder setCoffeeSort (String coffeeSorT) {
            coffeeSort = coffeeSorT;
            return this;
        }

        public Builder setCountryOrigin  (String coffeeSorT) {
            countryOrigin = coffeeSorT;
            return this;
        }

        public Builder setCropYear (int cropYeaR) {
            cropYear = cropYeaR;
            return this;
        }

        public Builder setRoastingType (String roastingTypE) {
            roastingType = roastingTypE;
            return this;
        }

       public Builder setDispatchCountry (String dispatchCountrY) {
            dispatchCountry = dispatchCountrY;
            return this;
        }

        public Builder setBagsAmount (int bagsAmounT) {
            bagsAmount = bagsAmounT;
            return this;
        }

        public Builder setCoffeePrice (String coffeePricE) {
            coffeePrice = coffeePricE;
            return this;
        }

        public Builder setCoffeeMachineType (String name, String type, String price) {
            coffeeMachineType = new CoffeeMachineType(name,type, price);
        return this;
        }

        public BuilderExample build () {
            return BuilderExample.this;
        }
    }
}
