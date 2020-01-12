package com.thekingdave.tgm.sew.number_converter;

import com.thekingdave.tgm.sew.number_converter.converters.NumberConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subject {

    private List<NumberConverter> converters = new ArrayList<>();

    String convertAll(int number) {
        List<String> results = converters.stream().map(con -> con.convert(number)).collect(Collectors.toList());
        return String.join(" ", results);
    }

    void attach(NumberConverter converter) {
        converters.add(converter);
    }

    void detach(NumberConverter converter) {
        converters.remove(converter);
    }

}
