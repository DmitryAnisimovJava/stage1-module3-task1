package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;


public class Generics<T extends Object> {

    //TODO: Refactor Method-1
    public List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public T genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List<T> consumer, List<T> producer) {
       		consumer.addAll(producer);
    }

}
