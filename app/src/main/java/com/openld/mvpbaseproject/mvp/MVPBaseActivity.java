package com.openld.mvpbaseproject.mvp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;

/**
 * author: lllddd
 * created on: 2020/6/5 9:21
 * description:
 */
public abstract class MVPBaseActivity<V extends IBaseView, T extends IBasePresenter<V>> extends AppCompatActivity implements IBaseView {
    private static final String TAG = "MVPBaseActivity";

    public T mPresenter;

    private static LogUtils mLogUtils;

    static {
        mLogUtils = LogUtils.getInstance();
    }

    /**
     * 绑定presenter
     *
     * @return
     */
    public abstract T bindPresenter();

    /**
     * presenter绑定生命周期onCreate
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mLogUtils.logDebug(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        mPresenter = bindPresenter();
        if (mPresenter != null) {
            mPresenter.onCreate();
            mLogUtils.logDebug(TAG, "onCreate presenter");
        }
    }

    /**
     * presenter绑定生命周期onStart
     */
    @Override
    protected void onStart() {
        mLogUtils.logDebug(TAG, "onStart");
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        if (mPresenter != null) {
            mPresenter.onStart();
            mLogUtils.logDebug(TAG, "onStart presenter");
        }
    }

    /**
     * presenter绑定生命周期onRestart
     */
    @Override
    protected void onRestart() {
        mLogUtils.logDebug(TAG, "onRestart");
        super.onRestart();
        if (mPresenter != null) {
            mPresenter.onRestart();
            mLogUtils.logDebug(TAG, "onRestart presenter");
        }
    }

    /**
     * presenter绑定生命周期onResume
     */
    @Override
    protected void onResume() {
        mLogUtils.logDebug(TAG, "onResume");
        super.onResume();
        if (mPresenter != null) {
            mPresenter.onResume();
            mLogUtils.logDebug(TAG, "onResume presenter");
        }
    }

    /**
     * presenter绑定生命周期onPause
     */
    @Override
    protected void onPause() {
        mLogUtils.logDebug(TAG, "onPause");
        super.onPause();
        if (mPresenter != null) {
            mPresenter.onPause();
            mLogUtils.logDebug(TAG, "onPause presenter");
        }
    }

    /**
     * presenter绑定生命周期onStop
     */
    @Override
    protected void onStop() {
        mLogUtils.logDebug(TAG, "onStop");
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        if (mPresenter != null) {
            mPresenter.onStop();
            mLogUtils.logDebug(TAG, "onStop presenter");
        }
    }

    /**
     * presenter绑定生命周期onDestroy
     */
    @Override
    protected void onDestroy() {
        mLogUtils.logDebug(TAG, "onDestroy");
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onDestroy();
            mLogUtils.logDebug(TAG, "onDestroy presenter");
        }
    }

    /**
     * presenter绑定回调onActivityResult
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        mLogUtils.logDebug(TAG, "onActivityResult");
        super.onActivityResult(requestCode, resultCode, data);
        if (mPresenter != null) {
            mPresenter.onActivityResult();
            mLogUtils.logDebug(TAG, "onActivityResult presenter");
        }
    }

    /**
     * 获取上下文
     *
     * @return
     */
    @Override
    public Context obtainContext() {
        return this;
    }
}
