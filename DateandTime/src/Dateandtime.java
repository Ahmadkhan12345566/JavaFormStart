
import java.util.*;
import java.text.*;
public class Dateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Date date = new Date();

	      
	      System.out.println(date.toString());
	
	
	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));
	
	     // int year = gcalendar.get(Calendar.YEAR);
	      //GregorianCalendar gcalendar = new GregorianCalendar();
	      //gcalendar.isLeapYear(year);
	      
	      
	      
	      
	}
	
	   public static int minFunction(int n1, int n2) {
		      int min;
		      if (n1 > n2)
		         min = n2;
		      else
		         min = n1;

		      return min; 
		   }
		   
		   // for double
		   public static double minFunction(double n1, double n2) {
		     double min;
		      if (n1 > n2)
		         min = n2;
		      else
		         min = n1;

		      return min; 
		   }

}
