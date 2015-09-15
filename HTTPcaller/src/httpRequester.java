import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public class httpRequester {

	
	String run(String url, OkHttpClient client) throws IOException {
		  Request request = new Request.Builder()
		      .url(url)
		      .build();

		  Response response = client.newCall(request).execute();
		  return response.body().string();
		}
	
}
