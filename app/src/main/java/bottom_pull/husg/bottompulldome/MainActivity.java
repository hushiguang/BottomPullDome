package bottom_pull.husg.bottompulldome;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Context context;

    @OnClick(R.id.main_botton)
    void getBottom(){
        selectDialog();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        context = this;
    }


    /**
     * 分享dialog
     */
    private void selectDialog() {
        // TODO Auto-generated method stub
        final Dialog dialog = new Dialog(context, R.style.dialogWindowStyle);

        View DialogView = LayoutInflater.from(context).inflate(
                R.layout.activity_circle_share, null);

        dialog.setContentView(DialogView, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = dialog.getWindow();
        // 设置显示动画
        window.setWindowAnimations(R.style.mystyle);
        WindowManager.LayoutParams wl = window.getAttributes();
        wl.x = 0;
        wl.y = ((Activity) context).getWindowManager().getDefaultDisplay()
                .getHeight();
        // 以下这两句是为了保证按钮可以水平满屏
        wl.width = ViewGroup.LayoutParams.MATCH_PARENT;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;

        // // 设置显示位置
        dialog.onWindowAttributesChanged(wl);
        // 设置点击外围解散
        dialog.setCanceledOnTouchOutside(true);

        LinearLayout ll_circle_share_chat = (LinearLayout) DialogView
                .findViewById(R.id.ll_circle_share_chat);
        LinearLayout ll_circle_share_weixin = (LinearLayout) DialogView
                .findViewById(R.id.ll_circle_share_weixin);
        LinearLayout ll_circle_share_baidu = (LinearLayout) DialogView
                .findViewById(R.id.ll_circle_share_baidu);
        LinearLayout ll_circle_share_kongjian = (LinearLayout) DialogView
                .findViewById(R.id.ll_circle_share_kongjian);
        LinearLayout ll_circle_share_renren = (LinearLayout) DialogView
                .findViewById(R.id.ll_circle_share_renren);
        LinearLayout ll_circle_share_weibo = (LinearLayout) DialogView
                .findViewById(R.id.ll_circle_share_weibo);

        Button btn_circle_share_concle = (Button) DialogView
                .findViewById(R.id.btn_circle_share_concle);

        // 先不支持
        ll_circle_share_chat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "该功能正在开发", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        // 没有shareSDK 不支持
        ll_circle_share_baidu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "该功能正在开发", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        // 可以分享
        ll_circle_share_kongjian.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(context, "该功能正在开发", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        // 可以分享
        ll_circle_share_renren.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(context, "该功能正在开发", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        /**
         * 分享到新浪微博 不能分享文件，图片只能是一张，不能分享文件
         *
         * */
        ll_circle_share_weibo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(context, "该功能正在开发", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        // 微信朋友圈不能分享表情、文件和应用
        ll_circle_share_weixin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(context, "该功能正在开发", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        btn_circle_share_concle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                // 取消
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
