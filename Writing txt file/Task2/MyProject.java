package Task2;
/*
 * This program for:
 * Writing content to text file - mybiodata.txt
*/

/*
 * author : Azhari Hj Salleh
 * matrix no : 201461166
 * email : azhari.salleh@gmail.com
 * github acct : https://github.com/azharisalleh
 * 
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyProject {
	
	 /*
	  	Name:  
		Matrix No:
		Gender:
		Age:
		E-mails: 
		Mobile Phone:
	*/
	
	public static void main(String[] args) {
		/*
		 * Start writing to text file azhari.txt
		 */
		File file = new File("azhari.txt");
		if(!file.exists()){
			try {
				
				System.out.println("Writing process initial");
				System.out.println("------------------------");
				file.createNewFile();
				PrintWriter pw = new PrintWriter(file);
				pw.println("Name 		 : Azhari Hj Salleh");
				pw.println("Matrix No 	 : 2014461166");
				pw.println("Gender 		 : Male");
				pw.println("Age		 : 40");
				pw.println("Email 		 : azhari.salleh@gmail.com");
				pw.println("Mobile Phone 	 : 0136661700");
				pw.close();
				System.out.println("------------------------");
				System.out.println("Writing process done");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
