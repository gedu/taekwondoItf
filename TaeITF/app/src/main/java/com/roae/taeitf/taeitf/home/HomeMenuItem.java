package com.roae.taeitf.taeitf.home;

public class HomeMenuItem {

  private int id;
  private int iconRes;
  private int textRes;

  public HomeMenuItem(int id, int iconRes, int textRes) {
    this.id = id;
    this.iconRes = iconRes;
    this.textRes = textRes;
  }

  public int getId() {
    return id;
  }

  public int getIconRes() {
    return iconRes;
  }

  public int getTextRes() {
    return textRes;
  }
}
