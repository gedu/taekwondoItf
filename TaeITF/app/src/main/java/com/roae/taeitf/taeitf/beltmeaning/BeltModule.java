package com.roae.taeitf.taeitf.beltmeaning;

import dagger.Binds;
import dagger.Module;

/**
 * Created by edu on 3/8/18.
 */
@Module
public abstract class BeltModule {

  @Binds
  abstract BeltContract.Presenter providesPresenter(BeltPresenter beltPresenter);
}
