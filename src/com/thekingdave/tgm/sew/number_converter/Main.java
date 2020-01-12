package com.thekingdave.tgm.sew.number_converter;

import com.thekingdave.tgm.sew.number_converter.converters.BinConverter;
import com.thekingdave.tgm.sew.number_converter.converters.HexConverter;
import com.thekingdave.tgm.sew.number_converter.converters.OctConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Subject s = new Subject();

	    s.attach(new HexConverter());
        s.attach(new OctConverter());
        s.attach(new BinConverter());

        Scanner scanner = new Scanner(System.in);

        String in;
        int num;
        System.out.print("Enter a number: ");
        while((in = scanner.next()) != null) {
            try {
                num = Integer.parseInt(in);
            } catch (Exception e) {
                System.out.println("Invalid input, exiting gracefully …");
                System.exit(0);
                return;
            }
            System.out.println("\t\t" + s.convertAll(num));

            System.out.print("Enter a number: ");
        }
    }
}
