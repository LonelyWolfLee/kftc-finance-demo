package pro.lonelywolf.demo.kftc.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import pro.lonelywolf.demo.kftc.api.ApiConfig;

@Getter @Setter
@Accessors(chain = true)
public class AuthorizeReq {

    @JsonProperty("response_type")
    private String responseType = "code";

    @JsonProperty("client_id")
    private String clientId = ApiConfig.CLIENT_ID;

    @JsonProperty("redirect_uri")
    private String redirectUri = ApiConfig.AUTHORIZE_REDIRECT_URI;

    private String scope = "login inquiry transfer";

    @JsonProperty("client_info")
    private String clientInfo = "test";

    @JsonProperty("auth_type")
    private String authType = AuthType.FIRST.code;

    private String lang = "kor";

    private enum AuthType {
        FIRST("0"), REFRESH("1"), OMIT("2");

        public final String code;

        AuthType(String code) {
            this.code = code;
        }
    }
}
