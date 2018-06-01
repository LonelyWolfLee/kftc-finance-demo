package pro.lonelywolf.demo.kftc.util;

import lombok.experimental.UtilityClass;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@UtilityClass
public class UrlTools {
    public static String encode(String plain) throws UnsupportedEncodingException {
        return URLEncoder.encode(plain, "UTF-8").replace("+", "%20");
    }

    public static String redirect(String url) {
        return "redirect:" + url;
    }
}
