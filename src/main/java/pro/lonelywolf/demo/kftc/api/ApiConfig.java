package pro.lonelywolf.demo.kftc.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiConfig {
    public static ObjectMapper MAPPER = new ObjectMapper();
    public static String CLIENT_ID="client-id";
    public static String CLIENT_SECRET_KEY="client-secret-key";
    public static String AUTHORIZE_REDIRECT_URI = "http://localhost:8080/callback";
}
