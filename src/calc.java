import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String num1 = sc.next();
        String op = sc.next();
        String num2 = sc.next();
        String[] rome = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
        int numb1 = 0;
        int numb2 = 0;
        char first = num1.charAt(0);
        String firs = String.valueOf(first);

        char second = num2.charAt(0);
        String secon = String.valueOf(second);

        int index1 = 0;
        int index2 = 0;

        for (int k = 0; k < rome.length; k++)
        {
            if (rome[k].equals(num1))
            {
                index1 = k+1;

            }
            if (rome[k].equals(num2))
            {
                index2 = k+1;

            }
        }

        if ((index1 != 0 && index2 == 0)||(index1 == 0 && index2 != 0))
            System.out.println(rome[1000]);
        else if ((firs.equals("I")||firs.equals("V")||firs.equals("X")) && (index1 == 0 || index2 == 0))
            System.out.println(rome[1000]);
        else if (index1 > 10 || index2 > 10)
            System.out.println(rome[1000]);
        else if (firs.equals("I")||firs.equals("V")||firs.equals("X"))
        {
            for (int i = 0; i < rome.length; i++)
            {
                if (rome[i].equals(num1))
                {
                    numb1 = i+1;
                    break;
                }
            }
            for (int j = 0; j < rome.length; j++)
            {
                if (rome[j].equals(num2))
                {
                    numb2 = j+1;
                    break;
                }
            }
            char oper = op.charAt(0);
            if (oper == '-' && numb1 - numb2 < 1)
                System.out.println(rome[1000]);
            if (oper == '+')
                System.out.println(rome[numb1 + numb2 - 1]);
            else if (oper == '-')
                System.out.println(rome[numb1 - numb2 - 1]);
            else if (oper == '/')
                System.out.println(rome[numb1 / numb2 - 1]);
            else if (oper == '*')
                System.out.println(rome[numb1 * numb2 - 1]);

        }
        else if (Integer.parseInt(num1) > 10 || Integer.parseInt(num2) > 10)
        {
            System.out.println(rome[1000]);
        }
        else {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            char oper = op.charAt(0);
            if (oper == '+')
                System.out.println(number1 + number2);
            else if (oper == '-')
                System.out.println(number1 - number2);
            else if (oper == '/')
                System.out.println(number1 / number2);
            else if (oper == '*')
                System.out.println(number1 * number2);
        }
    }
}
