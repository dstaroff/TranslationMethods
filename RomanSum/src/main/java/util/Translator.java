package util;

import java.util.HashMap;

class Translator {
    static int RomanToDecimal(String roman) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int intNum = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int temp = hashMap.get(roman.charAt(i));
            if (temp < prev)
                intNum -= temp;
            else
                intNum += temp;
            prev = temp;
        }

        return intNum;
    }

    static String DecimalToRoman(int arabic) {
        String[] rnChars = {"M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I"};
        int[] romanValues = {1000, 900, 500, 100, 90, 50, 10, 9, 5, 1};
        StringBuilder retVal = new StringBuilder();

        for (int i = 0; i < romanValues.length; i++) {
            int numberInPlace = arabic / romanValues[i];
            if (numberInPlace == 0) continue;
            retVal.append(numberInPlace == 4 && i > 0 ? rnChars[i] + rnChars[i - 1] :
                    new String(new char[numberInPlace]).replace("\0", rnChars[i]));
            arabic = arabic % romanValues[i];
        }

        return retVal.toString();
    }
}
