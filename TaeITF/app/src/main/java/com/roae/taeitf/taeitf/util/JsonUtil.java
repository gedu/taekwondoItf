package com.roae.taeitf.taeitf.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * Created by eduardo.graciano on 1/18/18.
 * Util class to load a JSON from the resources folder
 */
public class JsonUtil<T> {

  //Inject this
  private Gson gson = new Gson();
  private Type marvelList = new TypeToken<List<T>>() {
  }.getType();
  private String jsonName;
  private ClassLoader classLoader;

  public JsonUtil(String jsonName) {
    this.jsonName = jsonName + ".json";
    this.classLoader = this.getClass().getClassLoader();
  }

  public Observable<List<T>> convertCharacters() {
    return loadJsonFromResources(classLoader, jsonName).flatMap(
        new Function<String, ObservableSource<List<T>>>() {
          @SuppressWarnings("unchecked")
          @Override
          public ObservableSource<List<T>> apply(String json) throws Exception {
            return Observable.just((List<T>) gson.fromJson(json, marvelList));
          }
        });
  }

  private Observable<String> loadJsonFromResources(ClassLoader loader, String jsonName) {
    try {
      InputStream inputStream = loader.getResourceAsStream(jsonName);
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      return Observable.just(readFrom(reader));
    } catch (IOException | NullPointerException e) {
      return Observable.error(e);
    }
  }

  private String readFrom(BufferedReader reader) throws IOException {
    String json;
    StringBuilder builder = new StringBuilder();
    while ((json = reader.readLine()) != null) builder.append(json);
    return builder.toString();
  }
}
