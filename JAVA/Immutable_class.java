
public class Immutable_class {

		 public static void main(String args[])
		 { 
			 Immutable_Method  me = new Immutable_Method (912, "nidhisharma@gmail.com",24 , "Nidhi Sharma");
		      
		      System.out.println("Email: " + me.getEmail());
		      System.out.println(" Name " + me.getName());
		      System.out.println(" ID: " + me.getId());
		      System.out.println(" Age: " + me.getAge());
		      
		      //It shows the immutable class as there is no change in values once they are defined  
		      
		      @SuppressWarnings("unused")
		      Immutable_Method  me1 = new Immutable_Method (1111, "prakharvats12345678@gmail.com",19, "prakhar vats");
		      
		      System.out.println("Email: " + me.getEmail());
		      System.out.println(" Name " + me.getName());
		      System.out.println(" ID: " + me.getId());
		      System.out.println(" Age: " + me.getAge());
		      
		  }
	}


