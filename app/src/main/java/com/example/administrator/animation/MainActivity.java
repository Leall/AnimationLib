package com.example.administrator.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.administrator.animation.like.PLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ibtn_like;
    private ImageButton ibtn_gift;
//    private PeriscopeLayout periscopeLayout;
    private PLayout periscopeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
    }

    private void initListener() {
        ibtn_like.setOnClickListener(this);
        ibtn_gift.setOnClickListener(this);
    }

    private void initView() {
        //点赞
        ibtn_like = (ImageButton) findViewById(R.id.ibtn_like);
        periscopeLayout = (PLayout) findViewById(R.id.periscope);//初始化点赞布局
        ibtn_gift = (ImageButton) findViewById(R.id.ibtn_gift);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.ibtn_like:
                periscopeLayout.addHeart();//发送爱心
                //sendLike是控制im发送的频率  观众端显示无影响，主播只会接收固定数量
                //sendLike();
                break;
            case R.id.ibtn_gift:

                break;
        }
    }





    //    // 发送点赞爱心
//    private void sendLike() {
//        if (!isFastClick()) {
//            LikeAttachment attachment = new LikeAttachment();
//            ChatRoomMessage message = ChatRoomMessageBuilder.createChatRoomCustomMessage(roomId, attachment);
//            setMemberType(message);
//            NIMClient.getService(ChatRoomService.class).sendMessage(message, false);
//        }
//    }
//
//    // 发送爱心频率控制
//    private boolean isFastClick() {
//        long currentTime = System.currentTimeMillis();
//        long time = currentTime - lastClickTime;
//        if (time > 0 && time < 1000) {
//            return true;
//        }
//        lastClickTime = currentTime;
//        return false;
//    }
}
