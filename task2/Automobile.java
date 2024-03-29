package by.htp.hw4.task2;
public class Automobile {
    private double fuelLevel;
    private String brand;
    private Wheel wheel;
    private Engine engine;

    public Automobile(String brand, Engine engine, Wheel wheel, double fuelLevel) {
	this.brand = brand;
	this.wheel = wheel;
	this.engine = engine;
	this.fuelLevel = fuelLevel;
    }

    public void ride() {
	// it's riding!
    }

    public double getFuelLevel() {
	return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
	this.fuelLevel = fuelLevel;
    }

    public String getBrand() {
	return brand;
    }

    public void setBrand(String brand) {
	this.brand = brand;
    }

    public Engine getEngine() {
	return engine;
    }

    public void setEngine(Engine engine) {
	this.engine = engine;
    }

    public Wheel getWheel() {
	return wheel;
    }

    public void setWheel(Wheel wheel) {
	this.wheel = wheel;
    }

    @Override
    public String toString() {
	return "Automobile [Brand=" + brand + ", Engine=" + engine + ", Wheel=" + wheel + ", FuelLevel=" + fuelLevel + "]";
    }
}
}
