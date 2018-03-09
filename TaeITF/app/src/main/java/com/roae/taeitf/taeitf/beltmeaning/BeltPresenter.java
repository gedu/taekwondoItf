package com.roae.taeitf.taeitf.beltmeaning;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by edu on 3/8/18.
 */

public class BeltPresenter implements BeltContract.Presenter {

  private static final String TAG = "BeltPresenter";

  @Inject
  public BeltPresenter() {}

  @Override
  public void loadBelts() {
    Log.d(TAG, "loadBelts... ");
  }
}
