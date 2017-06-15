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
			String Line;
			int numofLines=0;
			while((Line=bf.readLine())!=null){
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
	public static void writefil(String file_path,String data)throws IOException{
		byte[] d=data.getBytes();
		FileWriter fr=new FileWriter(file_path);
		BufferedWriter bf=new BufferedWriter(fr);
		for(int i=0;i<d.length;i++){
		bf.write(d[i]);
		}
		bf.close();
		}

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		String file_name="./raw/input.txt";
		String file_nam="./raw/in.dat";
		String data="this data is for input"; 
		try{
			task newtask=new task();
			ReadFile file=newtask.new ReadFile(file_nam);
			String[] aryLines=file.OpenFile();
			int i;
			for(i=0;i<aryLines.length;i++){
				System.out.println(aryLines[i]);
			}
			writefile(file_nam,data);
		    writefil(file_nam,data);
			
		}
		catch( IOException e){
			System.out.println(e.getMessage());
		}
	}
}

	

