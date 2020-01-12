package com.thekingdave.tgm.sew.number_converter.converters;

public class OctConverter implements NumberConverter {

    @Override
    public String convert(int number) {
        return Integer.toOctalString(number);
    }
}
