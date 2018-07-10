public class FlipNCoins {
    public static void main(String[] args) {
        int n = 0;
        flipNCoins(2);
    }
    public static void flipNCoins(int n) {

        int flips = 0;
        int heads = 0;

        do {
            if (Math.random() >= .5) {
                System.out.println("heads");
                heads++;

            } else {
                System.out.println(("tails"));
                heads = 0;
            }

            flips++;
        } while (heads != n);

        if (heads == 1) {
            if (flips == 1) {
                System.out.println("It took " + flips +  " flip to flip a head.");
            } else {
                System.out.println("It took " + flips +  " flips to flip " + n + " head in a row.");
            }
        } else {
            System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
        }
    }
}
