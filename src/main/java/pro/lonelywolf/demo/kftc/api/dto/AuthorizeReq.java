package pro.lonelywolf.demo.kftc.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import pro.lonelywolf.demo.kftc.api.ApiConfig;
import pro.lonelywolf.demo.kftc.util.UrlTools;

import java.io.UnsupportedEncodingException;

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

    public MultiValueMap<String, String> toMultiValueMap() throws UnsupportedEncodingException {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        map.add("response_type", this.responseType);
        map.add("client_id", this.clientId);
        map.add("redirect_uri", UrlTools.encode(this.redirectUri));
        map.add("scope", UrlTools.encode(this.scope));
        map.add("client_info", this.clientInfo);
        map.add("auth_type", this.authType);
        map.add("lang", this.lang);

        return map;
    }
}
