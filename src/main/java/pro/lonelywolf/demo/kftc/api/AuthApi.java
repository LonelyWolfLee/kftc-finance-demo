package pro.lonelywolf.demo.kftc.api;

import pro.lonelywolf.demo.kftc.api.dto.AuthorizeReq;
import pro.lonelywolf.demo.kftc.api.dto.AuthorizeRes;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AuthApi {

    @GET("oauth/2.0/authorize2")
    Call<AuthorizeRes> authorize(AuthorizeReq req);
}
