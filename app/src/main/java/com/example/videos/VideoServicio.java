package com.example.videos;

import retrofit2.http.GET;

public interface VideoServicio {

    @GET("/api/peliculas")
    void getVideo(callback)
}
