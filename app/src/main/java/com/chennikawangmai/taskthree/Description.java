package com.chennikawangmai.taskthree;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Description {
    @GET("forces/{id}")
    Call<Force> getForces(@Path("id") String Id);
}
