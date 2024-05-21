package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {

  public static void main(String[] args) {
    //  英数字、記号、ひらがな、漢字、カタカナを含む10文字以内のランダムな文字列のリスト
    List<String> randomCharacterList = List.of("F7{んB火J", "r1ろらタE田jY", "しれR+e",
        "6Qん#山Oとl", "123", "ぽ3V火", "4", "@i田ア8O", "やFぺ&ぎw2", "みJ!Hガ",
        "R@9ホみ", "C日{uT}", "4KあトさA", "#H1ばナX", "Abcd", "$X日Cそ9", "%Lむ日+qE", "ひまYZ@",
        "H%ぉれ", "E日#3", "2ラもK火M", "@山ポzか", "ム!Qひ9B", "カキまれ火", "&川aマじK", "8V日サ7",
        "M金{と", "ZYX", "ぶ3火タQ", "にたホD");

    // 数字だけを抜き出すリスト
    List<String> numbersList = randomCharacterList.stream()
        .filter(value -> value.matches("\\d+"))
        .collect(Collectors.toList());
    System.out.println(numbersList);

    // 英字だけを抜き出すリスト
    List<String> alphabetList = randomCharacterList.stream()
        .filter(value -> value.matches("[A-Za-z]+"))
        .collect(Collectors.toList());
    System.out.println(alphabetList);

    // 大文字の英字だけを抜き出すリスト
    List<String> alphabetUpperCaseList = randomCharacterList.stream()
        .filter(value -> value.matches("[A-Z]+"))
        .collect(Collectors.toList());
    System.out.println(alphabetUpperCaseList);

    // 日本語だけを抜き出すリスト
    List<String> japaneseList = randomCharacterList.stream()
        .filter(value -> value.matches("[一-龯ぁ-んァ-ヶ]+"))
        .collect(Collectors.toList());
    System.out.println(japaneseList);

    // 英数字以外の文字列を抜き出すリスト
    List<String> notAlphanumericList = randomCharacterList.stream()
        .filter(value -> value.matches("[^a-zA-Z0-9]+"))
        .collect(Collectors.toList());
    System.out.println(notAlphanumericList);
  }
}
