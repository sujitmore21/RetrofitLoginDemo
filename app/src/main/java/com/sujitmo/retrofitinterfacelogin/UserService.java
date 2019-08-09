package com.sujitmo.retrofitinterfacelogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("GetLoginDetails/{user_id}/{psw}")
    Call login(@Path("username") String username, @Path("password") String password);
}
