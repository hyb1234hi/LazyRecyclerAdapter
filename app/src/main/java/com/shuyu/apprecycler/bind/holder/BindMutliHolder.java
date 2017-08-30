package com.shuyu.apprecycler.bind.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.shuyu.apprecycler.R;
import com.shuyu.apprecycler.bind.model.BindMutliModel;
import com.shuyu.bind.NormalBindRecyclerBaseHolder;

/**
 * Created by guoshuyu on 2017/8/29.
 */

public class BindMutliHolder extends NormalBindRecyclerBaseHolder {

    public final static int ID = R.layout.mutil_item;

    ImageView itemImage1;

    ImageView itemImage2;

    public BindMutliHolder(View v) {
        super(v);
    }

    @Override
    public void createView(View v) {
        itemImage1 = (ImageView) v.findViewById(R.id.item_image_1);
        itemImage2 = (ImageView) v.findViewById(R.id.item_image_2);
    }


    @Override
    public void onBind(Object model, int position) {
        BindMutliModel mutliModel = (BindMutliModel) model;
        itemImage1.setImageResource(mutliModel.getResId());
        itemImage2.setImageResource(mutliModel.getRes2());
    }
}
