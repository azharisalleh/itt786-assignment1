package Task2;
//Create by Azhari Hj Salleh 2014461166
//Title - Create file and write to file
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyProject {

	public static void main(String[] args) {
		File file = new File("mybiodata.txt");
		if(!file.exists()){
			try {
				
				file.createNewFile();
				PrintWriter pw = new PrintWriter(file);
				pw.println("Azhari Hj Salleh");
				pw.println("Pegawai Latihan Vokasional");
				pw.println("Phone No : 0351612622");
				pw.println("No 42 Jalan Sg Long 32/154 Bkt Naga");
				pw.println("Seksyen 32 Shah Alam");
				pw.close();
				System.out.println("Done");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
