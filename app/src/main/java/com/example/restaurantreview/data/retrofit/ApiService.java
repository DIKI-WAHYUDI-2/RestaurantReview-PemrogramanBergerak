package com.example.restaurantreview.data.retrofit;

import com.example.restaurantreview.data.response.PostReviewResponse;
import com.example.restaurantreview.data.response.RestaurantResponse;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {

    @GET("detail/{id}")
    Call<RestaurantResponse> getRestaurant(@Path("id") String id);

    @FormUrlEncoded
    @Headers({"Authorization: token 12345"})
    @POST("review")
    Call<PostReviewResponse> postReview(@Field("id")String id,@Field("name")String name,@Field("review")String review);

}
