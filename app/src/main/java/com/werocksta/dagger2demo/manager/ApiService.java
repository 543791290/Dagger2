package com.werocksta.dagger2demo.manager;

import com.werocksta.dagger2demo.model.GithubUserInfoCollection;
import com.werocksta.dagger2demo.model.RepoCollection;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface ApiService {

    @GET("users/{user}")
    Observable<GithubUserInfoCollection> getUserInfo(@Path("user") String user);

    @GET("users/{user}/repos")
    Observable<List<RepoCollection>> getRepo(@Path("user") String user);
}
