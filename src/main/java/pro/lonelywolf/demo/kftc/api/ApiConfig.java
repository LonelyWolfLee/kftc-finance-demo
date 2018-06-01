package pro.lonelywolf.demo.kftc.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiConfig {
    public static final ObjectMapper MAPPER = new ObjectMapper();
    public static final String CLIENT_ID="l7xxd90e32359c3449578f19a739739eba7d";
    public static final String CLIENT_SECRET_KEY="client-secret-key";

    public static final String HOST = "https://testapi.open-platform.or.kr/";
    public static final String AUTHORIZE_REDIRECT_URI = "http://localhost:8080/callback";
}
