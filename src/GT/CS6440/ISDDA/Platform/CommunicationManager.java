package GT.CS6440.ISDDA.Platform;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.fasterxml.jackson.databind.ObjectMapper;

//@ApplicationScoped
public class CommunicationManager 
{
	 private Client client;
	 private WebTarget target;
	    
	public CommunicationManager()
	{
		
	}
	
	//@PostConstruct
    /*protected void init() {
        client = ClientBuilder.newClient();
        //example query params: ?family=FRANKLIN
        target = client.target(
                "http://polaris.i3l.gatech.edu:8080/gt-fhir-webapp-ro/base/Patient");
    }*/
	
	public Bundle getPatients(String id, String familyName, String givenName, String name) {
        Bundle b = null;
		try {
			
			StringBuilder urlSb = new StringBuilder();
			urlSb.append("http://polaris.i3l.gatech.edu:8080/gt-fhir-webapp-ro/base/Patient");
			if((id != null && id != "") || (familyName != null && familyName != "") || (givenName != "" && givenName!= null) || (name != "" && name != null))
				urlSb.append("?");
			boolean endFlag = false;
			if(id != null && id != "")
			{
				endFlag = true;
				urlSb.append("_id="+id);
			}				
			if(familyName != null && familyName != "")
			{
				if(endFlag)
					urlSb.append("&");
				urlSb.append("family="+familyName);
				endFlag = true;
			}
			if(givenName != "" && givenName!= null)
			{
				if(endFlag)
					urlSb.append("&");
				urlSb.append("given="+givenName);
				endFlag = true;
			}
			if(name != "" && name != null)
			{
				if(endFlag)
					urlSb.append("&");
				urlSb.append("name="+name);
				endFlag = true;
			}				
			URL url = new URL(urlSb.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			StringBuilder jsonStr = new StringBuilder();			
			while ((output = br.readLine()) != null) {
				jsonStr.append(output);
			}
			conn.disconnect();
			
			b = new ObjectMapper().readValue(jsonStr.toString(), Bundle.class);
			//JSONObject json = new JSONObject(sb.toString());

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		return b;
    }
}
