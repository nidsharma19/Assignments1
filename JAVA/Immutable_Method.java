
final class Immutable_Method
{
		   final int id;
		   final String email;
		   final int age;
		   final String name;
		   
			   public  Immutable_Method(int id, String email,int age,String name)
			   {
			      this.id = id;
			      this.email = email;
			      this.age = age;
			      this.name =name;
			   }
		
				   public int getId()
				   {
				      return id;
				   }
				   public String getEmail()
				   { 
				      return email;
				   }
				   public int getAge()
				   {
				      return age;
				   }
				   public String getName()
				   { 
				      return name;
				   }
	}


