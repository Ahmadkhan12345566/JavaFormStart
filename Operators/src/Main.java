
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperators op=new ArithmeticOperators();
	 int	sum= op.add(1000, 1);
	 System.out.println(sum);
	 int	remn= op.sub(1000, 1);
	 System.out.println(remn);
	 
	 int ans= op.sub(1000, 1);
	 System.out.println(ans);
	 
	 RelationalOperators desmk=new RelationalOperators();
	 
	 if(desmk.equal(1, 4)){
		 System.out.println("Numbers are Equal");
	 }
	 else{
		 System.out.println("Numbers are not Equal");
	 }
	
	
	 instanceofOperator typr=new instanceofOperator();
	 
	 System.out.println(typr.isstring("anc"));
	 
	}

}
