package com.roae.taeitf.taeitf.common.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.roae.taeitf.taeitf.home.HomeActivity;

import javax.inject.Inject;

/**
 * Created by edu on 3/3/18.
 * Has the responsibility to move between activities
 */
public class NavigationManager {

  private Activity context;

  @Inject
  public NavigationManager(Activity context) {
    this.context = context;
  }

  public void navigateWith(Navigation navigation, Bundle extras) {
    navigation.init(context)
        .putExtras(extras)
        .navigate(context);
  }

  public void navigateWith(Navigation navigation) {
    navigation.init(context)
        .navigate(context);
  }
}
