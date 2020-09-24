public class Tafel22 {

    public static void main(String[] args) {

        int x = 22;
        for (int teller = 1; teller <= 10; teller++) {
            int tafel22 = teller * x;

            System.out.print(teller);
            System.out.print(" x " + x + " = ");
            System.out.println(tafel22);

        }
    }
}