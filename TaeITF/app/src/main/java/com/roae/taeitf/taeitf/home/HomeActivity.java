package com.roae.taeitf.taeitf.home;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.roae.taeitf.taeitf.R;
import com.roae.taeitf.taeitf.common.base.ButterActivity;

import javax.inject.Inject;

import butterknife.BindView;

public class HomeActivity extends ButterActivity implements HomeContract.View {

  @Inject GridLayoutManager layoutManager;
  @Inject HomeMenuAdapter menuAdapter;

  @BindView(R.id.home_menu) RecyclerView menuRecycler;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    setupView();
  }

  private void setupView() {
    menuRecycler.setLayoutManager(layoutManager);
    menuRecycler.setAdapter(menuAdapter);
  }

}
