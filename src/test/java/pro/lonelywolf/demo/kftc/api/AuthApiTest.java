package pro.lonelywolf.demo.kftc.api;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeReq;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeRes;
import retrofit2.Call;
import retrofit2.Response;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthApiTest {

    @Test
    public void authorize() throws Exception {
        AuthorizeReq req = new AuthorizeReq();

        Call<AuthorizeRes> authorizeCall = ApiSupplier.AUTH_API.authorize(req.toMap());
        Response<AuthorizeRes> res = authorizeCall.execute();

        log.info("code : {}", res.code());
        log.info("body : {}", ApiConfig.MAPPER.writeValueAsString(res.body()));
    }

}