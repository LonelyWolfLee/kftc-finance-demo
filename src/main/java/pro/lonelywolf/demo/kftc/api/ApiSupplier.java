package pro.lonelywolf.demo.kftc.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiSupplier {

    private static String HOST = "https://testapi.open-platform.or.kr/";

    public static final Retrofit RETROFIT;
    public static final AuthApi AUTH_API;

    static {
        RETROFIT = new Retrofit.Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        AUTH_API = RETROFIT.create(AuthApi.class);
    }
}