package com.roae.taeitf.taeitf.common.di;

import android.app.Application;

import com.roae.taeitf.taeitf.TaeApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
    AndroidInjectionModule.class,
    AppModule.class,
    ActivityBuilder.class
})
public interface AppComponent {

  void inject(TaeApplication application);

  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder application(Application application);
    AppComponent build();
  }
}
