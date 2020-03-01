package com.avalon.alphacentaury.di.modules;

import com.avalon.alphacentaury.data.networking.ApiInterface;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;




/**
 * Created by User on 3/1/2020.
 */
@Module
public class NetworkModule {

    @Singleton
    @Provides
    public ApiInterface provideApiInterface() {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return new Retrofit.Builder()
                .baseUrl("https://example.com")
                .build()
                .create(ApiInterface.class);
    }



    @Singleton
    @Provides
    public OkHttpClient getOkHttpClient(String apiToken) {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        Interceptor headerAuthorizationInterceptor = (Interceptor.Chain chain) -> {
            okhttp3.Request request = chain.request();

            Headers headers = request.headers().newBuilder()
                    .add("Connection", "close")
                    .add("Cache-Control", "no-cache")
                    .add("Cache-Control", "no-store")
                    .add("Authorization", "Bearer " + apiToken).build();
            request = request.newBuilder().headers(headers).build();
            return chain.proceed(request);
        };

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .addInterceptor(loggingInterceptor)
                .retryOnConnectionFailure(false)
                .addInterceptor(headerAuthorizationInterceptor)
                .build();
        return okHttpClient;
    }


//    @Provides
//    public String getApiToken(){
//
//    }



}
