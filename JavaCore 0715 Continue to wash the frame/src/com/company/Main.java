package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

0715 Continue to wash the frame

1. Create a list of the words “mother”, “soap”, “frame”.
2. After each word, insert in the list a line containing the word "exactly."
3. Display the result on the screen, each element of the list with a new line.

Requirements:
1. The program should not read data from the keyboard.
2. Declare a variable like list of strings and immediately initialize ee.
3. Add the words “mother”, “soap”, “frame” to the list.
4. After each word, add to the list a line containing the word "exactly".
5. Display the list items on the screen, each with a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "mother", "soap", "frame");
        for(int i=0;i<list.size(); i+=2) {
            list.add(i+1, "especially");
        }
        for (String word : list) {
            System.out.println(word);
        }
    }
}









