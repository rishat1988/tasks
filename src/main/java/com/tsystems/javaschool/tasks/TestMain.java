package com.tsystems.javaschool.tasks;

import com.tsystems.javaschool.tasks.calculator.Calculator;
import com.tsystems.javaschool.tasks.calculator.CalculatorImpl;
import com.tsystems.javaschool.tasks.pyramid.PyramidBuilder;
import com.tsystems.javaschool.tasks.pyramid.PyramidBuilderImpl;

import com.tsystems.javaschool.tasks.subsequence.Subsequence;
import com.tsystems.javaschool.tasks.subsequence.SubsequenceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        String check = "(2/1*1)/(3+2)";
        String checkSecond = "(1+2/3)";
        String checkTripple = "((1+2)/3)";
        Calculator calc = new CalculatorImpl();
        System.out.println("Calculation: " + calc.evaluate(check));
        System.out.println("Calculation2: " + calc.evaluate(checkSecond));
        System.out.println("Calculation3: " + calc.evaluate(checkTripple));
//----------------------------------------------------------------
        Subsequence sub = new SubsequenceImpl();
        Integer[] checka = new Integer[]{1, 2, 3, 4, 25, 9, 1, 2, 3};
        List<Integer> a = Arrays.asList(checka);
        Integer[] checkb = new Integer[]{1, 25, 3, 4, 25, 0, 1, 8, 3};
        List<Integer> b = Arrays.asList(checkb);
        System.out.println("TestEquals: " + sub.find(a, b));

        Integer[] checkaa = new Integer[]{1, 2, 3, 9};
        List<Integer> aa = Arrays.asList(checkaa);
        Integer[] checkbb = new Integer[]{1, 25, 2, 4, 25, 3, 1, 8, 9};
        List<Integer> bb = Arrays.asList(checkbb);
        System.out.println("TestEquals2: " + sub.find(aa, bb));
        //------------------------------------------------------------------

    }

    }
