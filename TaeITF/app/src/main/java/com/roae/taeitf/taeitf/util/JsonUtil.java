package com.roae.taeitf.taeitf.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by eduardo.graciano on 1/18/18.
 */

public class JsonUtil<T> {

  private String jsonName;
  private ClassLoader classLoader;

  public JsonUtil(String jsonName) {
    this.jsonName = jsonName+".json";
    this.classLoader = this.getClass().getClassLoader();
  }

  public List<T> convertCharacters() {
    String json = loadJsonFromResources(classLoader, jsonName);
    Gson gson = new Gson();
    Type marvelList = new TypeToken<List<T>>(){}.getType();
    return gson.fromJson(json, marvelList);
  }

  private String loadJsonFromResources(ClassLoader loader, String jsonName ){
    InputStream inputStream = loader.getResourceAsStream(jsonName);
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    return readFrom(reader);
  }

  private String readFrom(BufferedReader reader) {
    String json;
    StringBuilder builder = new StringBuilder();
    try {
      while ((json = reader.readLine()) != null) builder.append(json);
      return builder.toString();
    } catch (IOException e) {
      e.printStackTrace();
      return "";
    }
  }
}
