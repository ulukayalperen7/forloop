import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("sayi giriniz: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
