import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int [] test = new int [3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        double [] test2 = {1.57, 7.654, 9.986};
        byte [] test3 = new byte [8];
        test3[0] = 0;
        test3[1] = 1;
        test3[2] = 8;
        System.out.println("Задача решена, см. код");

        System.out.println("Задача №2");
        for (int index = 0; index < test.length; index++) {
            System.out.print(test[index]);
            if (index != test.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index2 = 0; index2 < test2.length; index2++) {
            System.out.print(test2[index2]);
            if (index2 != test2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index3 = 0; index3 < test3.length; index3++) {
            System.out.print(test3[index3]);
            if (index3 != test3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int index4 = test.length - 1; index4 >= 0; index4--) {
            System.out.print(test[index4]);
            if (index4 != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index5 = test2.length - 1; index5 >= 0; index5--) {
            System.out.print(test2[index5]);
            if (index5 != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index6 = test3.length - 1; index6 >= 0; index6--) {
            System.out.print(test3[index6]);
            if (index6 != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача №4");
        for (int index7 = 0; index7 < test.length; index7++) {
            if (test[index7] % 2 != 0) {
                test[index7]++;
            }
        }
        System.out.println(Arrays.toString(test));
    }
}