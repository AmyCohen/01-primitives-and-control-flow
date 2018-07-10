public class Pluralize {
    public static void main(String[] args) {
        int dogCount = 1;
        int catCount = 2;
        int turtleCount = 0;

        pluralize("dog", dogCount);
        pluralize("cat", catCount);
        pluralize("turtle", turtleCount);
    }

    private static void pluralize(String animal, int count) {
        if (count != 1) {
            System.out.println("I own " + count + " " + animal + "s.");
        } else {
            System.out.println("I own " + count + " " + animal + ".");
        }
    }
}
