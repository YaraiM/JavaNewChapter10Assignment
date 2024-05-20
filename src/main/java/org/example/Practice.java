package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
  private static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

  public static void main(String[] args) {
    Map<String, String> addressMap = new HashMap<>();
    addressMap.put("大川", "okawa@gmail.com");
    addressMap.put("中山", "nakayama@gmail.com");
    addressMap.put("小谷", "kotani@gmail.com");
    addressMap.put("広井", "hiroi＠gmail.com"); //@が全角になっている
    addressMap.put("狭山", "sayama@yahoo.co.jp");

    List<String> addressList = addressMap.values().stream()
        .filter(value -> value.matches(EMAIL_ADDRESS_PATTERN))
        .sorted() //アルファベット順に並び替え
        .collect(Collectors.toList());
    System.out.println(addressList);
  }
}
