package edu.upc.dsa.restclientandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TrackManager {

    @GET("tracks")
    Call<List<Track>> getTracks();

    @GET("tracks/{id}")
    Call<Track> getTrackByID(@Path("id") String trakid);

    @POST("tracks")
    Call<Track> addTrack(@Body Track track);
}
