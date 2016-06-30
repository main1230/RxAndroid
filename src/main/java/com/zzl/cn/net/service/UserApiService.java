package com.zzl.cn.net.service;

import com.zzl.cn.bean.ResultBean;
import com.zzl.cn.bean.UserBean;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by: zzl.
 * describe:
 * date: 2016/6/30.
 */
public interface UserApiService {
    @POST("registerUser")
    Observable<ResultBean<UserBean>> registerUser();

    @POST("editUser")
    Observable<ResultBean<UserBean>> editUser();
}
