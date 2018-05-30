package pro.lonelywolf.demo.kftc.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pro.lonelywolf.demo.kftc.api.ApiConfig;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
@Accessors(chain = true)
public class AuthorizeReq {

    private String responseType = "code";
    private String clientId = ApiConfig.CLIENT_ID;
    private String redirectUri = ApiConfig.AUTHORIZE_REDIRECT_URI;
    private String scope = "login inquiry transfer";
    private String clientInfo = "test";
    private String authType = AuthType.FIRST.code;
    private String lang = "kor";

    private enum AuthType {
        FIRST("0"), REFRESH("1"), OMIT("2");

        public final String code;

        AuthType(String code) {
            this.code = code;
        }
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();

        map.put("response_type", this.responseType);
        map.put("client_id", this.clientId);
        map.put("redirect_uri", this.redirectUri);
        map.put("scope", this.scope);
        map.put("client_info", this.clientInfo);
        map.put("auth_type", this.authType);

        return map;
    }
}
