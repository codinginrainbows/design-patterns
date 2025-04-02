package converter.negocio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.Map;

public class JsonConverter extends FileConverter {

    @Override
    protected String formatData(List<Map<String, String>> data) {
        Gson json = new GsonBuilder().create();
        return json.toJson(data);
    }
}