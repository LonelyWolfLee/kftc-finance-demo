package pro.lonelywolf.demo.kftc.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeReq;
import pro.lonelywolf.demo.kftc.util.UrlTools;

import java.io.UnsupportedEncodingException;

@Slf4j
@Controller
@RequestMapping("auth")
public class AuthController {

    @RequestMapping("authorize")
    public String authorize() throws UnsupportedEncodingException {
        return UrlTools.redirect(UriComponentsBuilder.fromHttpUrl(ApiConfig.HOST)
                .path("oauth/2.0/authorize2")
                .queryParams(new AuthorizeReq().toMultiValueMap())
                .buildAndExpand()
                .toString());
    }
}
