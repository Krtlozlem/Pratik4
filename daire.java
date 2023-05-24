import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz: ");
        r = input.nextInt();

        double alan = pi * r*r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);






    }
}
