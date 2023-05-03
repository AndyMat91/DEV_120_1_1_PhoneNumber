package org.example;

public class PhoneNumber {
    private int regionCode;
    private int localNumber;

    public PhoneNumber(int regionCode, int localNumber) {
        setRegionCode(regionCode);
        setLocalNumber(localNumber);
    }

    public PhoneNumber(String s) {
        if (s != null && s.matches("\\d+\\|\\d+")) {
                String[] words = s.split("\\|");
                setRegionCode(Integer.parseInt(words[0]));
                setLocalNumber(Integer.parseInt(words[1]));
        }
    }

    public int getRegionCode() {
        return regionCode;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }

    public void setLocalNumber(int localNumber) {
        this.localNumber = localNumber;
    }

    private String printPhone() {
        StringBuilder number = new StringBuilder(String.valueOf(getLocalNumber()));
        StringBuilder newNumber = new StringBuilder(number.length());
        char[] chars = number.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars.length) % 2 != 0) {
                if (i == 3) {
                    newNumber.append("-");
                }
                if (i % 2 != 0 && i != 1 && i != 3) {
                    newNumber.append("-");
                }
                newNumber.append(chars[i]);
            } else {
                if (i % 2 == 0 && i != 0) {
                    newNumber.append("-");
                }
                newNumber.append(chars[i]);
            }
        }
        return newNumber.toString();
    }

    @Override
    public String toString() {
        return ((getRegionCode() != 0)?"(" +  getRegionCode() + ")":"Входные данные не соответствуют требуемому формату!")  + ((printPhone().equals("0"))?"":printPhone());
    }
}
