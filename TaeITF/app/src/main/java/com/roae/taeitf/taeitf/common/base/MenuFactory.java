package com.roae.taeitf.taeitf.common.base;

import com.roae.taeitf.taeitf.R;
import com.roae.taeitf.taeitf.home.HomeMenuItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by eduardo.graciano on 1/31/18.
 *
 * Create the home menu icons
 */
public class MenuFactory {

  private static final int HISTORY_MENU_ID = 0;
  private static final int THEORY_MENU_ID = 1;
  private static final int BELT_MENU_ID = 2;

  private static List<HomeMenuItem> menus;
  static {
    HomeMenuItem historyMenu = new HomeMenuItem(HISTORY_MENU_ID,
        R.drawable.ic_color_history, R.string.history_title);

    HomeMenuItem theoryMenu = new HomeMenuItem(THEORY_MENU_ID,
        R.drawable.ic_color_theory, R.string.theory_title);

    HomeMenuItem beltMenu = new HomeMenuItem(BELT_MENU_ID,
        R.drawable.ic_color_belts, R.string.belt_title);

    menus = new ArrayList<>(3);
    menus.add(historyMenu);
    menus.add(theoryMenu);
    menus.add(beltMenu);
  }

  public static List<HomeMenuItem> getMenus() {
    return Collections.unmodifiableList(menus);
  }
}
