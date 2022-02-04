package HW_22;

public class CoffeeMachineType {
    private String coffeeMachineName;
    private String coffeeMachineType;
    private String coffeeMachinePrice;

    public CoffeeMachineType(String coffeeMachineName, String coffeeMachineType, String coffeeMachinePrice) {
        this.coffeeMachineName = coffeeMachineName;
        this.coffeeMachineType = coffeeMachineType;
        this.coffeeMachinePrice = coffeeMachinePrice;
    }

    public void printCoffeeMachine () {
        System.out.println(coffeeMachineName + coffeeMachineType + coffeeMachinePrice);
    }
}
