public class Tafel93 {

    public static void main(String args[]) {

        int x = 93;
        for (int teller = 1; teller <= 10; teller++) {
            int tafel93 = teller * x;

            System.out.print(teller);
            System.out.print(" x " + x + " = ");
            System.out.println(tafel93);

        }
    }
}
