import java.io.*;
public class InPutStream {
	public static void main(String[] args)throws IOException {
		 FileInputStream in = null;
	     FileOutputStream out = null;
	     FileInputStream f = null;

	      try {
	         in = new FileInputStream("input.txt");
	         out = new FileOutputStream("output.txt");
	        // System.out.println((char)in.);
	        // java.util.List items=
	         //System.out.println());
	         
	       // File f = new File("C:/java/hello");
	        
	          f = new FileInputStream( new File("C:/Users/Ahmad khan/Desktop/JavaFormStart/input.txt")); 
	          f.close();
	         
	         int c;
	         //String a=in.read().
	        // for(char c:in.read() )
	         while ((c = in.read()) != -1) {
	        	 if(c=='i'){
	        		  out.write(c);
	        		  System.out.println((char)c);
	        	 }
	          
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	      
	      }
	   

	}

