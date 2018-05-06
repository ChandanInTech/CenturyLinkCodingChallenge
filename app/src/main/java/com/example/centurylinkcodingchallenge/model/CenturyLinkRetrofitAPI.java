package com.example.centurylinkcodingchallenge.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CenturyLinkRetrofitAPI {

    // http://asset-api-master.centurylink.digital/asset/stocks

    String BASE_URL = "http://asset-api-master.centurylink.digital/";

    @GET("asset/stocks")
    Call<List<BasePojo>> getItemData();
}
