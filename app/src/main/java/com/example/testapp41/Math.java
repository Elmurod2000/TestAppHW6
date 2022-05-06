package com.example.testapp41;


import java.util.regex.Pattern;

public class Math {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public String add(String a, String b) {
        String result = "";
        if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        if (isNumeric(a) && isNumeric(b)) {
            int num1 = 0;
            try {
                num1 = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                double d = Double.parseDouble(a);
                num1 = (int) d;
            }
            int num2 = 0;
            try {
                num2 = Integer.parseInt(b);
            } catch (NumberFormatException e) {
                double d = Double.parseDouble(b);
                num2 = (int) d;
            }

            result = String.valueOf(num1 + num2);
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }

    public String divide(String a, String b) {
        String result = "";
        if (b.equals("0") || a.equals("0")) {
            result = "на ноль нельзя";
        } else if (Integer.parseInt(b) % 2 != 0 || Integer.parseInt(a) % 2 != 0) {
            result = "на не четно нельзя";
        } else {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            return String.valueOf(num1 / num2);
        }
        return result;
    }


    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
