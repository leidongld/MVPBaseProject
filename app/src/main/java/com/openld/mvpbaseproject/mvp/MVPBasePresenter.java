package com.openld.mvpbaseproject.mvp;

import android.view.View;

/**
 * author: lllddd
 * created on: 2020/6/5 10:09
 * description:
 */
public class MVPBasePresenter<V extends IBaseView> implements IBasePresenter<V> {
    public V mView;

    /**
     * 构造器
     *
     * @param view
     */
    public MVPBasePresenter(V view) {
        mView = view;
    }

    /**
     * 绑定Activity生命周期onCreate
     */
    @Override
    public void onCreate() {

    }

    /**
     * 绑定Activity生命周期方法onStart
     */
    public void onStart() {

    }

    /**
     * 绑定Activity生命周期方法onRestart
     */
    @Override
    public void onRestart() {

    }

    /**
     * 绑定Activity生命周期方法onResume
     */
    @Override
    public void onResume() {

    }

    /**
     * 绑定Activity生命周期方法onPause
     */
    @Override
    public void onPause() {

    }

    /**
     * 绑定Activity生命周期方法onStop
     */
    @Override
    public void onStop() {

    }

    /**
     * 绑定Activity生命周期方法onDestroy
     */
    @Override
    public void onDestroy() {

    }

    /**
     * 绑定Activity回调方法onActivityResult
     */
    @Override
    public void onActivityResult() {

    }
}
