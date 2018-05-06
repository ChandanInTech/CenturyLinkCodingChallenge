package com.example.centurylinkcodingchallenge.presenter;

import com.example.centurylinkcodingchallenge.contractor.Contractor;
import com.example.centurylinkcodingchallenge.model.Model;
import com.example.centurylinkcodingchallenge.model.RvItemPOJO;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

public class Presenter implements Contractor.Presenter {
    Contractor.View view;
    Contractor.Model model;

    public Presenter(Contractor.View view) {
        this.view = view;
        model = new Model();
    }

    @Override
    public void getRvItems() {
        model.getData();
    }

}
