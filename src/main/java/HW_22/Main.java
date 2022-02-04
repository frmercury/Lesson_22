package HW_22;

public class Main {

    public static void main(String[] args) {

        BuilderExample coffeeEcuador = BuilderExample
            .getBuilder()
                .setCoffeeSort("Arabica ")
                .setCountryOrigin("Ecuador ")
                .setCoffeePrice("200$ ")
                .setBagsAmount(100)
                .setCropYear(2015)
                .setDispatchCountry("Ukraine ")
            .build();
        System.out.println(coffeeEcuador.getCountryOrigin() + coffeeEcuador.getCoffeePrice());

        BuilderExample coffeeColumbia = BuilderExample
            .getBuilder()
                .setCoffeeSort("Robusta ")
                .setCountryOrigin("Columbia ")
                .setCoffeePrice("300$ ")
                .setDispatchCountry("Poland ")
                .setRoastingType("Black ")
            .build();
        System.out.println(coffeeColumbia.getDispatchCountry() + coffeeColumbia.getRoastingType());

        BuilderExample coffeeBrazil = BuilderExample
            .getBuilder()
                .setCoffeeSort("Arabica ")
                .setCountryOrigin("Columbia ")
                .setCropYear(2017)
                .setCoffeePrice("300$ ")
                .setDispatchCountry("Poland ")
                .setRoastingType("Black ")
            .build();
        System.out.println(coffeeBrazil.getDispatchCountry() + coffeeBrazil.getCropYear());

        BuilderExample automaticMachine = BuilderExample.getBuilder()
                .setCoffeeMachineType("Kitfort ", "automated ", "1000$")
                .build();
        automaticMachine.getCoffeeMachineType().printCoffeeMachine();
    }
}
