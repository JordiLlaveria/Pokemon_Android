package dsa.services;
import java.util.List;

import dsa.models.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

import java.util.List;


public interface MapService {
        @GET("/maps")
        Call<Map> getMaps(@Body List<Map> mapList);
}

