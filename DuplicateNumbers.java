import java.util.Random;
import java.text.*;

public class DuplicateNumbers {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] array = {500000, 200000, 100000, 300000, 700000, 600000, 800000};

        for (int num : array) {
            try {
                tree.insert(num);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        tree.displayPreOrder();

        Random random = new Random();
        int[] randomArray = new int[20];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(900000) + 100000;
        }

        int randomIndex = random.nextInt(20);
        int randomValue = randomArray[randomIndex];

        randomArray[random.nextInt(20)] = randomValue;

        randomArray[random.nextInt(20)] = randomValue;

        BinaryTree newTree = new BinaryTree();

        System.out.println("\n***** Array of 20 numbers (100000-999999) *****\n");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + "\t ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n**************** End of Array *****************");
        System.out.println("\nInserting Values in the Tree: ");
        int count = 0;

        for (int num : randomArray) {
            try {
                newTree.insert(num);
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("A total of " + count + " numbers were added.\n");
        newTree.displayPreOrder();
    }
}