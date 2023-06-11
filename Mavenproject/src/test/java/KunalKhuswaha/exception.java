package KunalKhuswaha;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10/0;
		}
		catch(Exception e) {
		  e.printStackTrace();
		}
		finally {
			System.out.println("Hello");
		}

	}

}
