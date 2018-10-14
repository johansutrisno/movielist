package org.d3ifcool.movielist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("movie")
    Call<List<RetroMovie>> getAllMovies();
}
