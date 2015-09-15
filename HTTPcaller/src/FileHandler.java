import java.io.*;

import javax.swing.JFileChooser;


public class FileHandler {

	String fileName;
	String line;
	
	FileHandler(){
		
		
	}
	
	String getFile(){
		// Allow user to search for desired file
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(fc);
		
		File file = fc.getSelectedFile();
		
		System.out.print(file.getName());
		return file.getName();
	}
	
	void readFile(){
	  try {
          // FileReader reads text files in the default encoding.
          FileReader fileReader = 
              new FileReader(fileName);

          // Always wrap FileReader in BufferedReader.
          BufferedReader bufferedReader = 
              new BufferedReader(fileReader);

          while((line = bufferedReader.readLine()) != null) {
              System.out.println(line);
          }   

          // Always close files.
          bufferedReader.close();         
      }catch(Exception e){
    	  System.out.print("FILE INVALID");
      }
      
	  
	}
}
