import java.io.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 // InputStream input = new FileInputStream("input.txt");
			  System.out.println("File opened...");
			  //FileOutputStream output=new FileOutputStream("input.txt");
			  //PrintStream printOut = new PrintStream(output);
			  //System.setOut(printOut);
			  InputStreamReader isr = null;
			   FileInputStream fis = null;
			   fis=new FileInputStream("input.txt");
			   isr = new InputStreamReader(fis);
			   isr.close();
			  RandomAccessFile file = new RandomAccessFile("input.txt", "rw");
			  file.write("Hello".getBytes());
			  System.out.println("Dumped...");
			  file.close();
			  File fil = new File("C:/Users/Ahmad khan/Desktop/JavaFormStart");
			  boolean dec=fil.exists();
			  System.out.println(dec);
			  String[] fileNames = fil.list();
			  System.out.println(fileNames[4]);

			  
			} catch (IOException e){
			  System.err.println("File opening failed:");
			  e.printStackTrace();
			}
	}

}
