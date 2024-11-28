/*public class Main {
    public static void main (String args[]) {
        System.out.println("----Hello World...----");
        System.out.println("Hello World...");
        System.out.println("----Sum of two numbers----");
        System.out.println(3 + 5);
        System.out.println("----Sum of two numbers----");
        int num1 = 4;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
    }
}*/

/*
* Data Types:
* 1. primitive:                       2. Derived:
*   a. Integer      (4 bytes)            a. Byte, Short, Int, Long
*                                                   |
*                                               (2 bytes)
*   b. Float        (8 bytes)            b. double, float
*                                              |       |
*                                           8 bytes     4 bytes
*   c. Character    (2 bytes)
*   d. Boolean      true or false
* */

/*public class Main {
    public static void main(String[] args) {

        // literals
        int num = 0b101; // binary format
        System.out.println(num);
        int hex = 0x7E;
        System.out.println(hex);

        double fnum = 12e10;
        System.out.println(fnum);

        char ch = 'a';
        ch++;
        System.out.println(ch);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);
        int a = b;
        System.out.println(a);
        int c = 257;
        byte k = (byte) c;
        System.out.println(k);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
//        int result = num1 + num2;
//        int result = num1 - num2;
//        int result = num1 * num2;
//        int result = num1 / num2;
        int result = num1 % num2;
        System.out.println(result);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int x = 8;
        if (x > 10) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        int y= 7;
        if (x > y) {
            System.out.println("x: "+ x);
        } else {
            System.out.println("y: " + y);
        }

        int z = 6;
        if (x > y && x > z) {
            System.out.println("x: " + x);
        } else if (y > x && y < z) {
            System.out.println("y: " + y);
        } else {
            System.out.println("z: " + z);
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;
//        if (n%2==0) {
//            result = 10;
//        } else {
//            result = 20;
//        }
        result = (n % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int n = 4;
        switch(n) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid number");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            System.out.println(i + " Hii..");
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }
            i++;
        }
        System.out.println(i + " Bye..");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println("Hi..");
            i--;
        } while (i >= 1);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int n = 5;
//        syntax:
//        for (initialization; condition; increment/decrement) {}
        for (int i = 1; i <= 5; i++) {
            System.out.println("Grinding java...");
        }
    }
}*/












