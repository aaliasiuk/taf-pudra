package pages;

import java.util.HashMap;

public class Objects {
    public String endPoint = "https://pudra.by/login";

    public HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("Cookie", "PHPSESSID=t3cpkiivccefomdu7os9n7bg35; _csrf=084ed5aaf46acfd6c6624b42a619a52b5f9a677f6b62f94b197d62c44a14e657a%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22%CA%BF%19p%24%F6J%A8%27%F5%EA0%7E%81%E9Q%83%CF%2BO%93%9E.%8DF%1FV7%DC%98%A4y%22%3B%7D; _ga=GA1.1.2002286781.1689263174; _fbp=fb.1.1689263174245.1254071896; _ym_uid=1689263179517808327; _ym_d=1689263179; cacheUid=2af0d70c2b543c2b4419cf3d99c4254334d753b9de9591cf3c09d6182b2fc515a%3A2%3A%7Bi%3A0%3Bs%3A8%3A%22cacheUid%22%3Bi%3A1%3Bs%3A40%3A%2206ebad12cc99e1dc9b4612abe61e77e686432992%22%3B%7D; _ym_isad=2; _ga_HM7JG6L03Q=GS1.1.1689375645.2.1.1689375701.4.0.0");
        return headers;
    }
    public HashMap<String, String> getFormParams() {
        HashMap<String, String> formParams = new HashMap<>();
        formParams.put("Client[email]", "test@test.com");
        formParams.put("Client[password]", "password123");
        formParams.put("_csrf","_Xd2ZLIqUpmKTOUP_bMQHiVHwm5uc1Cc6WEoRZJl8H03yG8UltwYMa25Dz-DMvlPpojpIf3tfhGvfn5yTv1UBA==");
        return formParams;
    }
}
