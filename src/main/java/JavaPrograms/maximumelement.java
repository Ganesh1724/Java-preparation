package JavaPrograms;

public class maximumelement {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 2, 7};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}

