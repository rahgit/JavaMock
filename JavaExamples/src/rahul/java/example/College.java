package rahul.java.example;

public class College {
	
	String name;
	 String college = "MVJ";
	
	
	 public College(String name,String college) {
		super();
		this.name = name;
		this.college =  college;
	}

	void display() {
		System.out.println("Name : " + name + " College : " + college);
	}

	public static void main(String[] args) {
		College c1 = new College("Rahul","MVJC");
		c1.display();

	}

}
