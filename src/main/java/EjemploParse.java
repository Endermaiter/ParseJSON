import org.json.JSONArray;
import org.json.JSONObject;

public class EjemploParse {

    public static void main(String[] args) {
/*
        String cadenaJSON = "{ " +
                "   \"data\": {" +
                "   \"id\": 2," +
                "   \"email\": \"janet.weaver@reqres.in\"," +
                "   \"first_name\": [\"Janet\",\"Brown\"]," +
                "   \"vivo\": \"false\"," +
                "   \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"" +
                "   }," +
                "   \"support\": {" +
                "   \"url\": \"https://reqres.in/#support-heading\"," +
                "   \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"" +
                "   }" +
                "}";

 */

        String cadenaJSON = "{"+
            "       \"pageInfo\": {"+
            "       \"pageName\": \"Homepage\","+
            "       \"logo\": \"https://www.example.com/logo.jpg\""+
            " },"+
                "\"posts\": ["+
            "{"+
                "    \"post_id\": \"0123456789\","+
                "    \"actor_id\": \"1001\","+
                "    \"author_name\": \"Jane Doe\","+
                "    \"post_title\": \"How to parse JSON in Java\","+
                "    \"comments\": [],"+
                "    \"time_of_post\": \"1234567890\""+
                "},"+
                "{"+
                "    \"post_id\": \"444\","+
                "    \"actor_id\": \"1001\","+
                "    \"author_name\": \"Jane Doe\","+
                "    \"post_title\": \"How to parse JSON in Java\","+
                "    \"comments\": [\"Damián me pondrá\",\" un 10 en la evaluación\"],"+
                "    \"time_of_post\": \"1234567890\""+
                "}"+
            "]"+
        "}";

        JSONObject je = new JSONObject(cadenaJSON);
        //String correo = je.getJSONObject("data").getString("email");
        //Boolean vivo = je.getJSONObject("data").getBoolean("vivo");
        //System.out.println(je.toString()+"\n"+correo);
        String pageName = je.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);

        JSONArray arr = je.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);
        }
        JSONArray arrayPrueba = je.getJSONArray("posts");
        for (int i = 0; i < arrayPrueba.length(); i++) {
            for (int j = 0; j < je.getJSONArray("comments").length(); j++) {
                JSONArray comments = arrayPrueba.getJSONObject(j).getJSONArray("comments");
                System.out.println(comments);
            }
        }
    }

}




