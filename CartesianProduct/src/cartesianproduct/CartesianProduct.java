package cartesianproduct;

public class CartesianProduct {

    public static void main(String[] args) {
        int[] ListA = {1, 2, 3, 4};
        int[] ListB = {5, 6};
        System.out.print("{");
        for (int i = 0; i < ListA.length; i++) {
            for (int j = 0; j < ListB.length; j++) {
                System.out.print("(" + ListA[i] + "," + ListB[j] + ")");
                if (i != ListA.length - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.print("}");
    }
}
