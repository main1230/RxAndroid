package com.zzl.cn.api;

import com.zzl.cn.bean.UserBean;
import com.zzl.cn.net.RetrofitManager;
import com.zzl.cn.net.service.UserApiService;

import retrofit2.adapter.rxjava.Result;
import rx.Observable;

/**
 * Created by: zzl.
 * describe:
 * date: 2016/6/30.
 */
public class UserApi {
    UserApiService userApiService;
    public Observable<Result<UserBean>> registerUser() {
        userApiService = RetrofitManager.builder().create(UserApiService.class);
        return userApiService.registerUser();
    }
}
