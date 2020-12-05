package com.example.simplekchat.Fragments;

import com.example.simplekchat.Notifications.MyResponse;
import com.example.simplekchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAQh0P4TE:APA91bGDI8qCRIan_vE5VTLOP2TVscaWuqybBG5EnmDp-PYQbZshZvD53XAbjMCJTZF3fusg82FEhBlDMgVVH4Gg1KTJ3kfRJPhgISLAK89TRZYphGsqyAZoHSOLhHewiJzb8CvYL6XM"
            }
    )
    @POST("fcm/send")
    Call<MyResponse>sendNotification(@Body Sender body);
}
