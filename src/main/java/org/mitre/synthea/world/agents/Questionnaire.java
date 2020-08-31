//FIT PROJECT CHANGES
package org.mitre.synthea.world.agents;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class Questionnaire implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public String id;
    public String category;
    public String subCategory;
    public String items;
    public String scales;

    public String getJSONData() {
        
        JSONObject json = new JSONObject();
        try {
            
            json.put("category", category);
            json.put("subCategory", subCategory);
            json.put("items", items);
            json.put("scales", scales);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return json.toString();
    }
}