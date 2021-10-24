package demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.auties.reified.annotation.Reified;

class JsonUtils {
    private static final ObjectMapper JACKSON = new ObjectMapper();

    public static <@Reified T> T fromJson(String json) {
        try {
            return JACKSON.readValue(json, T);
        } catch (Exception ex) {
            return null;
        }
    }
}

