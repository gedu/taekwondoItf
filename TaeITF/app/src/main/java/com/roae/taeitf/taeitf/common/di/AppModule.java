package com.roae.taeitf.taeitf.common.di;

import android.app.Application;
import android.content.Context;

import com.roae.taeitf.taeitf.home.HomeSubComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module(subcomponents = { HomeSubComponent.class })
class AppModule {

  @Provides
  Context provideContext(Application application) {
    return application;
  }
}
