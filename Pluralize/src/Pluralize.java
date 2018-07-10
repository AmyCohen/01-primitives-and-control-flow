public class Pluralize {
    public static void main(String[] args) {


        pluralize("dog", 13);
        pluralize("cat", 2);
        pluralize("turtle", 1);
        pluralize("wooly rhino", 0);

    }

    private static void pluralize(String animal, int count) {
        if (count != 1) {
            System.out.println("I own " + count + " " + animal + "s.");
        } else {
            System.out.println("I own " + count + " " + animal + ".");
        }
    }
}
