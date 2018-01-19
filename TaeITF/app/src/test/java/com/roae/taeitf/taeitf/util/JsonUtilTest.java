package com.roae.taeitf.taeitf.util;

import com.roae.taeitf.taeitf.model.Belt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class JsonUtilTest {

  private JsonUtil<Belt> mJsonUtil;

  @Before
  public void setUp() throws Exception {

  }

  @Test
  public void convertCharacters_valid_file_name() throws Exception {
    mJsonUtil = new JsonUtil<>("belt_meaning");
    mJsonUtil.convertCharacters().subscribeOn(Schedulers.trampoline())
        .subscribe(new Observer<List<Belt>>() {
          @Override
          public void onSubscribe(Disposable d) {}

          @Override
          public void onNext(List<Belt> belts) {
            assertEquals(belts.size(), 11);
          }

          @Override
          public void onError(Throwable e) {}

          @Override
          public void onComplete() {}
        });
  }

  @Test
  public void convertCharacters_invalid_file_name() throws Exception {
    mJsonUtil = new JsonUtil<>("not_found");
    mJsonUtil.convertCharacters().subscribeOn(Schedulers.trampoline())
        .subscribe(new Observer<List<Belt>>() {
          @Override
          public void onSubscribe(Disposable d) {}

          @Override
          public void onNext(List<Belt> belts) {}

          @Override
          public void onError(Throwable e) {
            assertNotNull(e);
          }

          @Override
          public void onComplete() {}
        });
  }

}