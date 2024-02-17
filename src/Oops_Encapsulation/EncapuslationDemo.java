package Oops_Encapsulation;


class Employee
{
	//data
	private int id =101;
	private String name ="Meeta";
	
	//access - public method for data getter and setter
	//
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
}

public class EncapuslationDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.show();
		e1.setId(201);
		e1.setName("Arti");
		System.out.println(e1.getId() +" "+e1.getName());
		e1.show();

	}

}
