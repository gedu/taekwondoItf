package com.roae.taeitf.taeitf.common.navigation;

import android.content.Context;
import android.os.Bundle;

/**
 * Created by edu on 3/3/18.
 */

public interface Navigation {

  NavigationData init(Context context);
  NavigationData putExtras(Bundle extras);
  void navigate(Context context);
}
