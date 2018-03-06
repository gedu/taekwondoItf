package com.roae.taeitf.taeitf.home;

import com.roae.taeitf.taeitf.common.navigation.Navigable;
import com.roae.taeitf.taeitf.common.navigation.Navigation;
import com.roae.taeitf.taeitf.common.navigation.NavigationData;

public class HomeMenuItem implements Navigable {

  private final int id;
  private final int iconRes;
  private final int textRes;
  private final Class<?> activityToGo;

  public HomeMenuItem(int id, int iconRes, int textRes, Class<?> activityToGo) {
    this.id = id;
    this.iconRes = iconRes;
    this.textRes = textRes;
    this.activityToGo = activityToGo;
  }

  public int getId() {
    return id;
  }

  int getIconRes() {
    return iconRes;
  }

  int getTextRes() {
    return textRes;
  }

  @Override
  public Navigation newNavigationInstance() {
    return new NavigationData(activityToGo);
  }
}
