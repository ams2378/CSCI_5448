import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL; 
import java.util.*;

public final class Rank
{

	private Rank() { 
		// can't be instantiated 
	}
	
	
	public static JSONArray getSortedList(JSONArray array) throws JSONException {
		System.out.println("SORTING");
        List<JSONObject> list = new ArrayList<JSONObject>();
        for (int i = 0; i < array.length(); i++) {
                list.add(array.getJSONObject(i));
        }
        Collections.sort(list, new SortedByItem());

        JSONArray resultArray = new JSONArray(list);

        return resultArray;
	}	
}