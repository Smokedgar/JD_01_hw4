package by.htp.hw4.task2;
public class AutoLogic {

    public static void fillTank(Automobile Automobile, double amountFuel) {
	Automobile.setFuelLevel(Automobile.getFuelLevel() + amountFuel);
    }
}

