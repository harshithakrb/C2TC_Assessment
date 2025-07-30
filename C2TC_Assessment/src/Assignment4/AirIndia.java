package Assignment4;

public class AirIndia implements Airfare {
    int hours;
    public double costPerHour;

    // Default constructor
    public AirIndia() {
    	
    }
    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    // Getters
    public int getHours() {
        return hours;
    }
    public double getCostPerHour() {
        return costPerHour;
    }
    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }
    // Implementation of methods
    @Override
    public double CalculateAmount() {
        return hours * costPerHour;
    }
    @Override
    public void display() {
        System.out.printf("%.2f\n", CalculateAmount());
    }

}
