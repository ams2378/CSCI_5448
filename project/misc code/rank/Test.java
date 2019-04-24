import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;

public class Test {

    public static void main( String[] args )
    {
        
    	StringBuffer response;
        String jsonStr = null;
    	
    	jsonStr = "{\"database\":["
    			+ "{\"name\":\"Vernice\",\"score\":4},"
    			+ "{\"name\":\"Marylou\",\"score\":1},"
    			+ "{\"name\":\"Renate\",\"score\":13},"
    			+ "{\"name\":\"Gayle\",\"score\":3},"
    			+ "{\"name\":\"Kim\",\"score\":7}]}";
    	
        if (jsonStr != null) {
        	System.out.println("Started Sorting process");
            try {
            	JSONObject jsonObj = new JSONObject(jsonStr);
            	JSONArray database = jsonObj.getJSONArray("database");
            	JSONArray sortedArray = Rank.getSortedList(database);
            	
                for (int i = 0; i < sortedArray.length(); i++) {
                	JSONObject c = sortedArray.getJSONObject(i);
                	Integer id = c.getInt("score");
                	System.out.println("score : " + id);
                }
            	
            } catch (final JSONException e) {
            	System.out.println("Json parsing error: " + e.getMessage());
            	// FIXME
            }
        }
    }	
}
