/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tran Xuan Hao
 */
public class Check {

    public Check() {
    }

    public static boolean checkName(String str) {
        if (str == null || str.length() == 0) {
            return false;
        } else {
            String strForm = "[^a-z]";
            Pattern p;
            Matcher m;
            int f = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(str, f);
            m = p.matcher(str);
            return !m.find();
        }
    }

    public static boolean checkPhone(String numberPhone) {
        if (numberPhone == null || numberPhone.length() < 8 || numberPhone.length() > 11) {
            return false;
        } else {
            String numberForm = "[^0-9]";
            Pattern p;
            Matcher m;
            int f = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(numberPhone, f);
            m = p.matcher(numberPhone);
            return !m.find();
        }
    }

    public static boolean checkMark(String mark) {
        if (mark == null || mark.length() > 2 || mark.length() < 1) {
            return false;
        } else {
            String markForm = "[^0-10]";
            Pattern p;
            Matcher m;
            int f = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(mark, f);
            m = p.matcher(mark);
            return !m.find();
        }
    }

    public static boolean checkSpace(String n) {
        String strPattern = "[^ ]";
        Pattern p;
        Matcher m;
        int flag = Pattern.CASE_INSENSITIVE;
        p = Pattern.compile(strPattern, flag);
        m = p.matcher(n);
        return m.find();
    }

    public static boolean checjkMail(String str) {
        if (str == null) {
            return false;
        } else {
            String strPattern = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(str);
            return m.find();
        }
    }

    public static boolean checkDate(String n) {
        if (n == null || n.length() > 10 || n.length() < 2) {
            return false;
        } else {
            String strPattern = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }

    public static boolean checkNumber(String number) {
        if (number == null || number.length() > 10 || number.length() < 1) {
            return false;
        } else {
            String strPattern = "[^0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(number);
            return !m.find();
        }
    }

    public static boolean check(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean checkID(String ID) {
        if (ID == null || ID.length() > 10 || ID.length() < 2) {
            return false;
        } else {
            String strPattern = "[^a-z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(ID);
            return !m.find();

        }
    }
    
}
