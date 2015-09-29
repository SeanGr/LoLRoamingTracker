import java.io.IOException;
import java.util.ArrayList;

import com.squareup.okhttp.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUIwindow win = new GUIwindow();
	
		//win.makeTestFrame();
		String apiKey = win.receiveTextInput();
		FileHandler test = new FileHandler();
		test.getFile();
		ArrayList<String> gameIDs = test.readFileToList();
		
		
		System.out.print(gameIDs.get(0));
		
		/*
		OkHttpClient client = new OkHttpClient();
		httpRequester requester = new httpRequester();
	
		try {
			System.out.print(requester.run("http://www.google.com", client));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		*/
	}

	
}
