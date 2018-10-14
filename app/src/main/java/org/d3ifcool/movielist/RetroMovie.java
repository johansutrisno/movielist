package org.d3ifcool.movielist;

import com.google.gson.annotations.SerializedName;

public class RetroMovie {
    @SerializedName("movieId")
    private Integer movieId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("genre")
    private String genre;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    public RetroMovie(Integer movieId, Integer id, String title, String genre, String url, String thumbnailUrl) {
        this.movieId = movieId;
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
}
