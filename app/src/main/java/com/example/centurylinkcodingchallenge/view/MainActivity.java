package com.example.centurylinkcodingchallenge.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.centurylinkcodingchallenge.R;
import com.example.centurylinkcodingchallenge.contractor.Contractor;
import com.example.centurylinkcodingchallenge.model.EventbusDataClass;
import com.example.centurylinkcodingchallenge.model.RvItemPOJO;
import com.example.centurylinkcodingchallenge.presenter.Presenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Contractor.View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView rv;

    List<RvItemPOJO> rvData=new ArrayList<>();
    Contractor.Presenter presenter;
    RecyclerView.Adapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        presenter = new Presenter(this);

        presenter.getRvItems();

    }

    @Subscribe
    public void onItemReceived(EventbusDataClass eventbusDataClass){
        rvData=eventbusDataClass.getRvItems();
        Log.e("...",rvData.size()+"");
        //rvAdapter.notifyDataSetChanged();
        rv.setHasFixedSize(false);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rvAdapter = new MyAdapter(rvData, this);
        rv.setAdapter(rvAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
