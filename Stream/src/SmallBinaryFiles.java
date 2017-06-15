import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class SmallBinaryFiles {
	  final static String FILE_NAME = "C:\\Temp\\cottage.jpg";
	  final static String OUTPUT_FILE_NAME = "C:\\Temp\\cottage_output.jpg";
	  
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
