package Assignment4;

public class KingFisher implements Airfare{
 
	private int hours;
	private double costperhour=270;
	
	 // Parameterized constructor
    public KingFisher(int hours, double costperhour) {
        this.hours = hours;
        this.costperhour = costperhour;
    }
    // Getters
    public int getHours() {
        return hours;
    }
    public double getCostPerHour() {
        return costperhour;
    }
    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setCostPerHour(double costperhour) {
        this.costperhour = costperhour;
    }
    // Implementation of methods
    @Override
    public double CalculateAmount() {
        return hours * costperhour * 4;
    }
    @Override
    public void display() {
        System.out.printf("%.2f\n", CalculateAmount());
    }

}
