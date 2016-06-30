package com.zzl.cn.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zzl.cn.R;
import com.zzl.cn.base.BaseActivity;
import com.zzl.cn.bean.ResultBean;
import com.zzl.cn.bean.UserBean;
import com.zzl.cn.net.RetrofitManager;
import com.zzl.cn.net.service.UserApiService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by: zzl.
 * describe:
 * date: 2016/6/30.
 */
public class LoginActivity extends BaseActivity {
    UserApiService userApiService;

    @BindView(R.id.name_et)
    EditText nameEt;
    @BindView(R.id.pwd)
    EditText pwd;
    @BindView(R.id.login_btn)
    Button loginBtn;
    @OnClick(R.id.login_btn)
    void login() {
        userApiService = RetrofitManager.builder().create(UserApiService.class);
        userApiService.registerUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Action1<ResultBean<UserBean>>() {
            @Override
            public void call(ResultBean<UserBean> userBeanResult) {
                resultTv.setText(userBeanResult.toString());
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Toast.makeText(mContext, "错误："+throwable.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
    @BindView(R.id.result_tv)
    TextView resultTv;

    @Override
    protected int getLayoutId() {
        return R.layout.login_act;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
