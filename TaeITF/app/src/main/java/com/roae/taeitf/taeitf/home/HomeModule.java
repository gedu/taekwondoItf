package com.roae.taeitf.taeitf.home;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

  @Provides
  HomeContract.View provideHomeView(HomeActivity homeActivity) {
    return homeActivity;
  }

  @Provides
  HomePresenter provideHomePresenter(HomeContract.View homeView) {
    return new HomePresenter(homeView);
  }

  @Provides
  HomeMenuAdapter provideMenuAdapter() {
    return new HomeMenuAdapter();
  }

  @Provides GridLayoutManager provideGridMenuManager(Context context) {
    return new GridLayoutManager(context, 3);
  }
}
