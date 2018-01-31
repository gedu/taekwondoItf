package com.roae.taeitf.taeitf.common.di;

import android.app.Application;
import android.content.Context;

import com.roae.taeitf.taeitf.home.HomeSubComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = { HomeSubComponent.class })
public class AppModule {

  @Provides
  @Singleton
  Context provideContext(Application application) {
    return application;
  }
}
