package entityclassassignment1;

public class StudentDemo {

	public static void main(String[] args) {
		System.out.println("Student Details:");
		System.out.println("");
		
		Student s1=new Student();
		s1.sid=1;
		s1.sname="Harshi";
		s1.state="Puducherry";
		System.out.println("Student id: "+s1.sid);
		System.out.println("Student name: "+s1.sname);
		System.out.println("Student state: "+s1.state);
		System.out.println("");
		
		Student s2=new Student();
		s2.sid=2;
		s2.sname="Swetha";
		s2.state="Chennai";
		System.out.println("Student id: "+s2.sid);
		System.out.println("Student name: "+s2.sname);
		System.out.println("Student state: "+s2.state);
		System.out.println("");
		
		Student s3=new Student();
		s3.sid=3;
		s3.sname="Bannu";
		s3.state="Hyderabad";
		System.out.println("Student id: "+s3.sid);
		System.out.println("Student name: "+s3.sname);
		System.out.println("Student state: "+s3.state);
		
	}

}
