package com.roae.taeitf.taeitf.common.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.roae.taeitf.taeitf.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

@SuppressLint("Registered")
public class ButterActivity extends AppCompatActivity {

  @Nullable
  @BindView(R.id.toolbar)
  protected Toolbar toolbar;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);

    if (toolbar != null) {
      setSupportActionBar(toolbar);
    }
  }

  @Override
  public void setContentView(int layoutResID) {
    super.setContentView(layoutResID);
    ButterKnife.bind(this);
  }

  protected void setBackToolbar() {
    if (getSupportActionBar() != null) {
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
  }
}
