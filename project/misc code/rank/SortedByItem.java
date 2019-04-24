
import java.util.Comparator;

import org.json.JSONException;
import org.json.JSONObject;

public class SortedByItem implements Comparator<JSONObject> {
	    /*
	    * (non-Javadoc)
	    * 
	    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	    * lhs- 1st message in the form of json object. rhs- 2nd message in the form
	    * of json object.
	    */
	    @Override
	    public int compare(JSONObject lhs, JSONObject rhs) {
	        try {
	            return lhs.getInt("rank") > rhs.getInt("rank") ? 1 : (lhs
	                .getInt("rank") < rhs.getInt("rank") ? -1 : 0);
	        } catch (JSONException e) {
	            e.printStackTrace();
	        }
	        return 0;

	    }
	}