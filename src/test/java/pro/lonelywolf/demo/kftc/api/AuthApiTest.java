package pro.lonelywolf.demo.kftc.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeReq;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeRes;
import retrofit2.Call;

import static org.junit.Assert.*;
import static pro.lonelywolf.demo.kftc.api.ApiSupplier.AUTH_API;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthApiTest {
    @Test
    public void authorize() throws Exception {
        AuthorizeReq req = new AuthorizeReq();


        Call<AuthorizeRes> res = ApiSupplier.AUTH_API.authorize(req);
    }

}