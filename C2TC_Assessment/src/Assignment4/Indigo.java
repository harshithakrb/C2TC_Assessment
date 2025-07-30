package Assignment4;

public class Indigo implements Airfare{

	int hours;
	double costperhour=150;
	
	//Default Constructor
	public Indigo() {	
	}
	
	//Parameterized Constructor
	public Indigo(int hours, double costperhour){
		this.hours=hours;
		this.costperhour=costperhour;
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostperhour() {
		return costperhour;
	}
	public void setCostperhour(double costperhour) {
		this.costperhour = costperhour;
	}
	
	@Override
	public double CalculateAmount() {
        return hours * costperhour * 8;
    }
	
	@Override
	public void display() {
		System.out.printf("%.2f\n", CalculateAmount());
	}
}
