package main.java.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import main.java.entity.Medidor;

public class HttpConnectionMethods {
	
	private static final String GET_URL = "http://localhost:8080/api/medidores";

	private static final String POST_URL = "http://localhost:8080/api/medidor";
	
	private static final String REST_GET = "GET";
	
	public List<Medidor> sendGET() throws IOException {
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod(REST_GET);
		int responseCode = con.getResponseCode();
		
		System.out.println("GET Response Code :: " + responseCode);
		
		List<Medidor> medidorData = null;
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			StringBuilder builder = new StringBuilder();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				builder.append(inputLine + "\n");
			}
			in.close();

			Type listType = new TypeToken<ArrayList<Medidor>>(){}.getType();
			List<Medidor> medidorData2 = new Gson().fromJson(builder.toString(), listType);

			return medidorData2;
	
		} else {
			System.out.println("GET request not worked");
			return medidorData;
		}

	}
	
}
