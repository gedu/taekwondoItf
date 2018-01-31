package com.roae.taeitf.taeitf.home;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.roae.taeitf.taeitf.R;
import com.roae.taeitf.taeitf.common.baseactivity.ButterActivity;

import butterknife.BindView;

public class HomeActivity extends ButterActivity implements HomeContract.View {

  @BindView(R.id.home_menu) RecyclerView menuRecycler;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
  }
}
