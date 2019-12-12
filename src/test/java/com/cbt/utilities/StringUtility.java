package com.cbt.utilities;

public class StringUtility {


    public static void verifyEquals(String expected, String actual){
//
//        if(expected.equals(actual)){
//            System.out.println("PASS:\n" +
//                    "Expected result: " + expected +"\n"+
//                    "Actual result: " + actual);
//        }else {
//            System.out.println("FAIL:\n" +
//                    "Expected result: " + expected +"\n"+
//                    "Actual result: " + actual);
//        }
        System.out.println( (expected.equals(actual)?"PASS:": "FAIL")
                +   "\nExpected result: " + expected +"\n"+ "Actual result: " + actual );

    }



    public static void verifyEquals(int expected, int actual){

      //method overloading change the parameters to the int

        System.out.println( (expected ==(actual)?"PASS:": "FAIL")
                +   "\nExpected result: " + expected +"\n"+ "Actual result: " + actual );

    }
}
















