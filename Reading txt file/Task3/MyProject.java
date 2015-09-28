package Task3;
/*
 * This program for:
 * Reading content from text file - mybiodata
*/

/*
 * author : Azhari Hj Salleh
 * matrix no : 201461166
 * email : azhari.salleh@gmail.com
 * github acct : https://github.com/azharisalleh
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyProject {

	public static void main(String[] args) {
		/*
		 * Start reading from text file azhari.txt
		 */
		System.out.println("------------------------");
		System.out.println("Reading process start");
		System.out.println("------------------------");
		
	BufferedReader br = null;
	try{
		br = new BufferedReader(new FileReader("azhari.txt"));
		String line;
		while((line=br.readLine()) !=null)
		{
			System.out.println(line);
		}
		System.out.println("------------------------");
		System.out.println("Reading process finish");
		System.out.println("------------------------");
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


