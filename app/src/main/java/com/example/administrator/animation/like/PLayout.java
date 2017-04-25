package com.example.administrator.animation.like;

import android.content.Context;
import android.util.AttributeSet;

import com.example.administrator.animation.R;
import com.example.animationlib.like.PeriscopeLayout;

import java.util.ArrayList;

/**
 *
 * create by xuchen at  2017/4/25 0025 14:42
 */
public class PLayout extends PeriscopeLayout {


    public PLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public ArrayList<Integer> initDrawable() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.pl_red);
        list.add(R.drawable.pl_yellow);
        list.add(R.drawable.pl_blue);
        list.add(R.mipmap.ic_launcher);

        return list;
    }
}
