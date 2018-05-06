package com.example.centurylinkcodingchallenge.model;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.centurylinkcodingchallenge.contractor.Contractor;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Model implements Contractor.Model {

    private static final String TAG = "Model";
    private List<RvItemPOJO> rvItems = new ArrayList<>();

    @Override
    public void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CenturyLinkRetrofitAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CenturyLinkRetrofitAPI api = retrofit.create(CenturyLinkRetrofitAPI.class);

        Call<List<BasePojo>> call = api.getItemData();
        call.enqueue(new Callback<List<BasePojo>>() {
            @Override
            public void onResponse(Call<List<BasePojo>> call, Response<List<BasePojo>> response) {
                //Log.e(TAG, "onResponse: " + response.body().toString());
                List<BasePojo> mylist=response.body();
                if (mylist != null){
                    for (BasePojo bp : mylist){
                        //int imageID, String title, String id, String availability, int availabilityIcon)
                        rvItems.add(new RvItemPOJO(bp.getId(), bp.getAssetStatus()));
                    }
                }

                EventbusDataClass event = new EventbusDataClass();
                event.setRvItems(rvItems);
                EventBus.getDefault().post(event);
            }

            @Override
            public void onFailure(@NonNull Call<List<BasePojo>> call, Throwable t) {
                Log.e("...","failed");

            }
        });
    }
}
