package com.roae.taeitf.taeitf.home;

import dagger.Module;
import dagger.Provides;

@Module
class HomeModule {

  @Provides
  HomeContract.View provideHomeView(HomeActivity homeActivity) {
    return homeActivity;
  }

  @Provides
  HomePresenter provideHomePresenter(HomeContract.View homeView) {
    return new HomePresenter(homeView);
  }
}
