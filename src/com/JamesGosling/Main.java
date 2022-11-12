package com.JamesGosling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        for (int i=0; i< 4; i++) {
            StringBuilder a = new StringBuilder();
            for (int j=0; j<4; j++) {
                if (i==0 || j==0 || i==3 || j==3) {
                    a.append("#");
                } else {
                    a.append(" ");
                }
            }
            System.out.println(a);
        }
    }
}
