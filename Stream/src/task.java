import java.io.*;
public class task {
	
	public class ReadFile{
		private String path;
		public ReadFile(String file_path){
			path=file_path;
		}
		public String[] OpenFile()throws IOException {
			FileReader fr= new FileReader(path);
			BufferedReader textReader=new BufferedReader(fr);
			int numberofLines=readLines();
			String[] textData=new String[numberofLines];
			for(int i=0;i<numberofLines;i++){
				textData[i]=textReader.readLine();
			}
			textReader.close();
			return textData;
		}
		public int readLines()throws IOException {
			FileReader file_to_read= new FileReader(path);
			BufferedReader bf=new BufferedReader(file_to_read);
			int numofLines = 0;
			while((bf.readLine())!=null){
				numofLines++;
			}
			bf.close();
			return numofLines;
		}
	}
	public static void writefile(String file_path,String data)throws IOException{
		FileWriter fr=new FileWriter(file_path);
		BufferedWriter bf=new BufferedWriter(fr);
		bf.write(data);
		bf.close();
		}		
	public static void writeBinaryFile(String file_path,Double[] data) throws IOException{
		DataOutputStream os;
		os = new DataOutputStream(new FileOutputStream(file_path));
		for(Double elm:data){
		os.writeDouble(elm);
		}
		os.close();
	}
	
	public static int filelength(String file_path) throws IOException{
		int length=0;
		DataInputStream is;
		Double single_data;
		is = new  DataInputStream(new FileInputStream(file_path));
		try{
		 
		while((single_data=is.readDouble())==single_data.doubleValue()&&single_data!=null){
		    length++;
			}
		is.close();
	}
	catch(EOFException e){
		is.close();
		return length;
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	    return length;	
	}
	
	public static Double[] readBinaryfile(String file_path) throws IOException,EOFException{
		DataInputStream is;
		int counter=filelength(file_path);
		Double single_data;
		Double[] data_arry=new Double[counter];
		is = new  DataInputStream(new FileInputStream(file_path)); 
		try{
			int i=0;
			while((single_data=is.readDouble())==single_data.doubleValue()){
		        data_arry[i]=single_data;
			    i++;
			    }
		   	}
		catch(EOFException e){
			is.close();
			return data_arry;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return data_arry;
		
	}
	
	public static void main(String[] args)throws IOException,ClassNotFoundException {
		String file_name="./raw/input.txt";
		String binary_file="./raw/binTestingText.dat";
		Double[] double_data={1.11,0.11,1.00,-1.00,2.22440};
		String data="this is abc\n "
				+ "asdsadsd"
				+ "asdasda"; 
		try{
			task newtask=new task();
			ReadFile file=newtask.new ReadFile(file_name);
			String[] aryLines=file.OpenFile();
			int i;
			writefile(file_name,data);
			for(i=0;i<aryLines.length;i++){
				System.out.println(aryLines[i]);
				}
			Double arry[];
			writeBinaryFile(binary_file,double_data);
			arry=readBinaryfile(binary_file);
		    for(i=0;i<arry.length;i++){
				System.out.println(arry[i]);
				}
			}
		catch( IOException e){
			System.out.println(e.getMessage());
		}
		
	}
}

	

