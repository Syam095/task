package com.torryharris.practice;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainVerticle {
  public static void method() {
    JsonObject job = new JsonObject();
// Adding data using the created object
    job.put("fullName", "Syam");


// LinkedHashMap is created for address data
    Map m1 = new LinkedHashMap(4);
    m1.put("streetAdd", "4, Ibbani Street");
    m1.put("city1", "Bangalore");
    m1.put("state1", "Karnataka");
    m1.put("pinCode", 560064);
// adding address to the created JSON object
    job.put("address1", m1);
// JSONArray is created to add the phone numbers
    JsonArray jab = new JsonArray();
    Map m2 = new LinkedHashMap(2);
    m2.put("PAN", "BTDPC7785D");
    m2.put("adhaarno", "9738128018");
    job.put("id", m2);
// adding map to list
    jab.add(job);
    for (int i = 0; i < jab.size(); i++) {
      System.out.println(jab.encodePrettily());
    }
  }


  public static void main(String[] args) throws FileNotFoundException {
    method();
  }
}

