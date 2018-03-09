package com.roae.taeitf.taeitf.common.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * Created by edu on 3/3/18.
 */

public class NavigationData implements Navigation {

  private final Class<?> whereToNavigate;
  private Intent intent;

  public NavigationData(Class<?> whereToNavigate) {
    this.whereToNavigate = whereToNavigate;
  }

  @Override
  public NavigationData init(Context context) {
    this.intent = new Intent(context, whereToNavigate);
    return this;
  }

  @Override
  public NavigationData putExtras(Bundle extras) {
    this.intent.putExtras(extras);
    return this;
  }

  @Override
  public void navigate(Activity activity) {
    ActivityCompat.startActivity(activity, intent, null);
  }
}
