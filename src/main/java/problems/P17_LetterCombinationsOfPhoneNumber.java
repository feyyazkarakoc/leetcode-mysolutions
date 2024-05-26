package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P17_LetterCombinationsOfPhoneNumber {

    public static void main(String[] args) {

        System.out.println(letterCombinations(""));

    }


    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        HashMap<Integer, String> numToLet = new HashMap<>();
        numToLet.put(2, "abc");
        numToLet.put(3, "def");
        numToLet.put(4, "ghi");
        numToLet.put(5, "jkl");
        numToLet.put(6, "mno");
        numToLet.put(7, "pqrs");
        numToLet.put(8, "tuv");
        numToLet.put(9, "wxyz");

        if (digits.isEmpty()){
            return list;


        }else if (digits.length() == 1) {
            for (int i = 2; i < 10; i++) {

                int x = Integer.valueOf(digits);

                if (x == i) {
                    for (String s1 : numToLet.get(x).split("")){
                        list.add(s1);
                    }
                }
            }


        }else  if (digits.length() == 2) {

            int x = Integer.valueOf(digits.split("")[0]);
            int y = Integer.valueOf(digits.split("")[1]);

            for (int i = 2; i < 10; i++) {
                if (x == i) {
                    for (String s1 : numToLet.get(x).split("")){

                        for (String s2 : numToLet.get(y).split("")){

                            list.add(s1+s2);
                        }
                    }
                }
            }




        }else if (digits.length() == 3) {

            int x = Integer.valueOf(digits.split("")[0]);
            int y = Integer.valueOf(digits.split("")[1]);
            int z = Integer.valueOf(digits.split("")[2]);

            for (int i = 2; i < 10; i++) {
                if (x == i) {
                    for (String s1 : numToLet.get(x).split("")){

                        for (String s2 : numToLet.get(y).split("")){

                            for (String s3 : numToLet.get(z).split("")){

                                list.add(s1+s2+s3);
                            }
                        }
                    }
                }
            }



        }else if (digits.length() == 4) {

            int x = Integer.valueOf(digits.split("")[0]);
            int y = Integer.valueOf(digits.split("")[1]);
            int z = Integer.valueOf(digits.split("")[2]);
            int t = Integer.valueOf(digits.split("")[3]);

            for (int i = 2; i < 10; i++) {
                if (x == i) {
                    for (String s1 : numToLet.get(x).split("")){

                        for (String s2 : numToLet.get(y).split("")){

                            for (String s3 : numToLet.get(z).split("")){

                                for (String s4 : numToLet.get(t).split("")){

                                    list.add(s1+s2+s3+s4);
                                }
                            }
                        }
                    }
                }
            }
        }


        return list;
    }
}




