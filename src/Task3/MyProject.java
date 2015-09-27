package Task3;
//Create by Azhari Hj Salleh 2014461166
//Title - Read file content from task 2
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyProject {

	public static void main(String[] args) {
	BufferedReader br = null;
	try{
		br = new BufferedReader(new FileReader("mybiodata.txt"));
		String line;
		while((line=br.readLine()) !=null)
		{
			System.out.println(line);
		}
		
	}
	catch(IOException e){
		e.printStackTrace();
		}
	finally{
		try {
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	}	
	
}


