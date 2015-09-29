import java.io.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;


public class FileHandler {

	String fileName;
	String line;
	File currentFile;
	FileHandler(){
		
		
	}
	
	File getFile(){
		// Allow user to search for desired file
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(fc);
		
		File file = fc.getSelectedFile();
		
		fileName = file.getName();
		currentFile = file;
		return file;
	}
	
	void readFile(){
	  try {
          // FileReader reads text files in the default encoding.
          FileReader fileReader = 
              new FileReader(currentFile);

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
	
	ArrayList<String> readFileToList(){
		
		ArrayList<String> theArray =  new ArrayList<String>();
		
		try {
	          // FileReader reads text files in the default encoding.
	          FileReader fileReader = 
	              new FileReader(currentFile);
	          

	          // Always wrap FileReader in BufferedReader.
	          BufferedReader bufferedReader = 
	              new BufferedReader(fileReader);

	          while((line = bufferedReader.readLine()) != null) {
	        	  if (line.length()<3){
	        		  
	        	  }
	        	  else{
	        		  theArray.add(line.substring(0, line.length()-2));
	        	  }
	           //   System.out.println(line);
	          }   

	          // Always close files.
	          bufferedReader.close();         
	      }catch(Exception e){
	    	  System.out.print("FILE INVALID");
	      }
		
		return theArray;
	      
	}
	
	String getCurrentFileName(){
		
		return fileName;
	}
}
