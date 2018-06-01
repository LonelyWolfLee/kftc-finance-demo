package pro.lonelywolf.demo.kftc.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeCallbackRes;

@Slf4j
@Controller
@RequestMapping("callback")
public class CallbackController {

    @RequestMapping
    public String auth(AuthorizeCallbackRes res) {
        log.info(res.toString());
        return "ok";
    }
}
