package rahul.java.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a ;
			for(int i = 0;i < 6 ;i ++){
				a = 10/i;
				System.out.println(a);
			}
		} finally{
			System.out.println("Inside finally");
		}
		
			
		
	}

}
