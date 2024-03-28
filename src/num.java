public class num {

    public static void main(String[] args) {
        int lines = 3; // Number of lines

        for (int i = 1; i <= lines; i++) {
            // Print the line number
            System.out.println("Line " + i + ":");

            // Print numbers on the current line
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing numbers
            System.out.println();
        }
    }
}


