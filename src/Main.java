public class Main {
    public static void main(String[] args) {
        // Задание 1-1
        System.out.println("Задание 1-1");

        for (int a = 0; a <= 10; a++){
            System.out.println("iteration cycle " + a);
        }
        // Задание 1-2
        System.out.println("Задание 1-2");

        for (int b = 10; b >=1; b--){
            System.out.println(b);
        }
        // Задание 1-3
        System.out.println("Задание 1-3");

        for (int c = 2; c < 18; c+=2){
            System.out.println(c);
        }
        // Задание 1-4
        System.out.println("Задание 1-4");

        for (int d = 10; d >= 10; d--){
            System.out.println(d);
        }
        // Задание 2-1
        System.out.println("Задание 2-1");

        for (int y = 1904; y <= 2096; y+=4){
            System.out.println("is leap year " + y);
        }
        // Задание 2-2
        System.out.println("Задание 2-2");
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int n = 7; n <= 98; n+=7){
            System.out.println(n);
        }
        // Задание 2-3
        System.out.println("Задание 2-3");
        // 1 2 4 8 16 32 64 128 256 512

        for (int s = 1; s <= 512; s*=2){
            System.out.println(s);
        }
        // Задание 3-1
        System.out.println("Задание 3-1");

        int money = 29000;
        int month =0;
        for (int m =1; m <= 12; m++){
            month = month + money;
            System.out.println("Month " + m + ", the amount of savings is equal to " + month + " rublies");
        }
        // Задание 3-2
        System.out.println("Задание 3-1");

        int contributionBank = 29000;
        int amountOfSavings = 0;
        for (int c =1; c <= 12; c++){
            amountOfSavings = amountOfSavings + contributionBank/100;
            amountOfSavings = amountOfSavings + contributionBank;
            System.out.println("Month " + c + ", the amount of savings is equal to " + amountOfSavings + " rublies");
        }
    }
}