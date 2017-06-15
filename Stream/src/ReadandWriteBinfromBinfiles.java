import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ReadandWriteBinfromBinfiles {
	  
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		   String FIL = "C:\\Temp\\cottage.jpg";
		   String OUTPUT = "C:\\Temp\\cottage_output.jpg";
		ReadandWriteBinfromBinfiles binary = new ReadandWriteBinfromBinfiles();
	   // byte[] bytes = binary.readSmallBinaryFile(FIL);
	  //  log("Small - size of file read in:" + bytes.length);
	 //   binary.writeSmallBinaryFile(bytes, OUTPUT);
	}
	
	
	  
	  byte[] readSmallBinaryFile(String aFileName) throws IOException {
	    Path path = Paths.get(aFileName);
	    return Files.readAllBytes(path);
	  }
	  
	  void writeSmallBinaryFile(byte[] aBytes, String aFileName) throws IOException {
	    Path path = Paths.get(aFileName);
	    Files.write(path, aBytes); //creates, overwrites
	  }
	  
	  private static void log(Object aMsg){
	    System.out.println(String.valueOf(aMsg));
	
	  }
}
