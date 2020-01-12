package com.thekingdave.tgm.sew.number_converter.converters;

public class BinConverter implements NumberConverter {

    @Override
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
