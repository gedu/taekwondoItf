package com.roae.taeitf.taeitf.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = HomeModule.class)
public interface HomeSubComponent extends AndroidInjector<HomeActivity> {

  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
}
