package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        sentence = sentence.replaceAll("[.,;:]", "");
        Map<String, Integer> wordCountMap = new HashMap<>();
        if (sentence.isEmpty()){ return wordCountMap; }

        List<String> wordList = List.of(sentence.split(" "));
        wordList.forEach(word -> {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)){
                wordCountMap.replace(word, wordCountMap.get(word) + 1);

            } else {
                wordCountMap.put(word, 1);
            }
        });
        return new HashMap<>(wordCountMap);
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator wrmc = new WordRepetitionMapCreator();
        wrmc.createWordRepetitionMap("Java Map can store pairs of keys and values.");
    }
}
