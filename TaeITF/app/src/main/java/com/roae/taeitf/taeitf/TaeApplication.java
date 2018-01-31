package com.roae.taeitf.taeitf;

import android.app.Activity;
import android.app.Application;

import com.roae.taeitf.taeitf.common.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class TaeApplication extends Application implements HasActivityInjector {

  @Inject
  DispatchingAndroidInjector<Activity> activityDispatchingInjector;

  @Override
  public void onCreate() {
    super.onCreate();

    DaggerAppComponent.builder()
        .application(this)
        .build()
        .inject(this);
  }

  @Override
  public AndroidInjector<Activity> activityInjector() {
    return activityDispatchingInjector;
  }
}
