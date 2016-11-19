package activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.janzen.janzenlife.R;
/**
 * Created by janzen on 2016/10/23.
 */

public class SplashActivity extends FragmentActivity{
    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
        final View view = View.inflate(this, R.layout.activity_splash, null);
        setContentView(view);
//        startAnimation(null);
        handler.sendEmptyMessageDelayed(1,4000);
    }


    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 1){
                MainActivity.activityShow(context);
                finish();
            }
        }
    };



    private void startAnimation(View view){
        //渐变展示启北京
        AlphaAnimation alpha = new AlphaAnimation(0.3f,1.0f);
        alpha.setDuration(2000);
        view.startAnimation(alpha);
    }
}
