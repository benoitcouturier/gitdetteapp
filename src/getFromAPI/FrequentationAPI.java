package getFromAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import Entities.Frequentation;

public class FrequentationAPI {
	
	public FrequentationAPI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frequentation[] get(int moi, int annee){
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(
                "http://localhost:8080/dettepdsapi/serviceRest/Frequentation/get/"+moi+"/"+annee);
        getRequest.addHeader("accept", "application/json");

        
        HttpResponse response;
		try {
			response = httpClient.execute(getRequest);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatusLine().getStatusCode());
        }
        //Lit l'affichage
        BufferedReader br = new BufferedReader(
                new InputStreamReader((response.getEntity().getContent())));
        // Affichage console
        String output;
        String resp = new String();
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
            resp = resp+output;
        }
        //parse JSON -> Java
        ObjectMapper mapper = new ObjectMapper();
        Frequentation[] p = mapper.readValue(resp, Frequentation[].class);
        //close
        httpClient.getConnectionManager().shutdown();
        return p;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    return null;
}
}

