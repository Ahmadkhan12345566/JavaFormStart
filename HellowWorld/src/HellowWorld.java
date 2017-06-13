public class HellowWorld {

	int rolnum;
	public void setrolnum(int rol){
		rolnum=rol;
	}
	public int getrolnum(){
	return rolnum;	
	}
	
	public void P_hellow(){
		 System.out.println("HellowWorld");		
	}
	public String P_return(){
		 		return "me";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  enumtest abc=new enumtest(); 
  abc.size=enumtest.enumtes.small;
  System.out.println(abc.size);
  
  
  HellowWorld ab=new HellowWorld();
  ab.P_hellow();
  
  
  String who=  ab.P_return();
  System.out.println(who);
  ab.setrolnum(1014);
  int roln= ab.getrolnum();
     System.out.println(roln);
	
	
	
	
	
	
	
     /* Create two objects using constructor */
     Employee empOne = new Employee("James Smith");
     Employee empTwo = new Employee("Mary Anne");

     // Invoking methods for each object created
     empOne.empAge(26);
     empOne.empDesignation("Senior Software Engineer");
     empOne.empSalary(1000);
     empOne.printEmployee();

     empTwo.empAge(21);
     empTwo.empDesignation("Software Engineer");
     empTwo.empSalary(500);
     empTwo.setrank('a');
     empTwo.printEmployee();
	 
	
	
	
	}

}
