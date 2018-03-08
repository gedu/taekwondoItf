package com.roae.taeitf.taeitf.beltmeaning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roae.taeitf.taeitf.R;
import com.roae.taeitf.taeitf.common.base.ButterActivity;

import javax.inject.Inject;

public class BeltActivity extends ButterActivity {

  @Inject
  BeltContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_belt);

    setBackToolbar();
    presenter.loadBelts();
  }
}
