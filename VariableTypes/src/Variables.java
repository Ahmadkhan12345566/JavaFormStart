
public class Variables {
/*
 * Local variables
   Instance variables
   Class/Static variables
 * */
	 String typ;//Instance variables

	 
 	 public void settyp(String tp){
		 typ=tp;
	 }
	 public String gettype(){
		 return typ;
	 }
	 
	 
	 private int price;	 //only access in class 

	 public static final String Color = "black ";
	 public void setprice(int pric){
		 price=pric;
	 }
	 public int getprice(){
		 return price;
	 }

	 public void pupAge() {
	      int age = 0; //local variables
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Variables test = new Variables();
	      test.pupAge();
		test.settyp("jamrn");
		System.out.println(test.typ);
		test.setprice(10000);
		int prc=test.getprice();
		System.out.println(prc);
        System.out.println(Color);
	}

}
