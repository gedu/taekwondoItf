package com.roae.taeitf.taeitf.home;

class HomePresenter implements HomeContract.Presenter {

  private HomeContract.View view;

  HomePresenter(HomeContract.View view) {
    this.view = view;
  }

}
