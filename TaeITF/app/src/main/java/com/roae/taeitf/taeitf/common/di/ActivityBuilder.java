package com.roae.taeitf.taeitf.common.di;

import android.app.Activity;

import com.roae.taeitf.taeitf.beltmeaning.BeltActivity;
import com.roae.taeitf.taeitf.beltmeaning.BeltModule;
import com.roae.taeitf.taeitf.home.HomeActivity;
import com.roae.taeitf.taeitf.home.HomeSubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityBuilder {

  @Binds
  @IntoMap
  @ActivityKey(HomeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity>
  bindHomeActivityInjectorFactory(HomeSubComponent.Builder builder);

  @ContributesAndroidInjector(modules = BeltModule.class)
  abstract BeltActivity beltActivity();
}
