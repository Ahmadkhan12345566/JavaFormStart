

class Calculation extends Abstraction{
	   int z;
	   String name;
	   public void Setname(String ame){
		   name=ame;
		   }
	   public void spr() {
		   System.out.println("Super Class");
		   }
	   public void addition(int x, int y) {
		   z = x + y;
		   System.out.println("The sum of the given numbers:"+z);
		   }
		
	   public void Subtraction(int x, int y) {
		   z = x - y;
		   System.out.println("The difference between the given numbers:"+z);
		   }
	   public double method(){
		   return 0.0;
	   }
   }
	
	public class Inheritance extends Calculation {
	   public void multiplication(int x, int y) {
		   z = x * y;
		   System.out.println("The product of the given numbers:"+z);
	       }
	   public void Subtraction(int x, int y) {
		   z = x - y;
		   System.out.println("Overrided between the given numbers:"+z);
		   }
	   public void Subtraction(float x, float y) {
		   System.out.println("Overrided between the given numbers:"+z);
		   super.spr();
		   }
	   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		Inheritance demo = new Inheritance();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);

		
		
		}

}

