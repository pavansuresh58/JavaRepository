package week1;

public class StudentData {

	//data 
	int id;
	String name;
	
	//function
	public void show()
	{
		System.out.println("Student Id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	
	
	public static void main(String[] args) 
	{
		StudentData S1=new StudentData();
		//initialize data 
		S1.id=101;
		S1.name="Seema";
		S1.show();
		//System.out.println("S1");
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Amit";
		s2.show(); 
		StudentData s3=new StudentData();
		s3.id=103;
		s3.name="Suresh";
		s3.show(); 
		StudentData s4=new StudentData();
		s4.id=104;
		s4.name="Ramesh";
		s4.show(); 
		StudentData s5=new StudentData();
		s5.id=105;
		s5.name="Naresh";
		s5.show();
		 */
	}
}
