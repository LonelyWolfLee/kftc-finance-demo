package pro.lonelywolf.demo.kftc.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthorizeRes {

    private String code;
    private String scope;
    @JsonProperty("client_info")
    private String clientInfo;
}
