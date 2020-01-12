package com.thekingdave.tgm.sew.number_converter.converters;

public class HexConverter implements NumberConverter {

    @Override
    public String convert(int number) {
        return Integer.toHexString(number);
    }
}
