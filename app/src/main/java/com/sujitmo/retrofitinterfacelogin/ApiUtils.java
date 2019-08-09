package com.sujitmo.retrofitinterfacelogin;

public class ApiUtils {

    public static final String BASE_URL = "http://10.1.1.98:98//api/Dashboard/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
