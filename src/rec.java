import java.util.Scanner;

class rec {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a value is ");
        int myint = a.nextInt();

        for (int b = 1; b <= myint; b++) {

            System.out.println("The value is " + b + " :");

            for (int c = 1; c <= b; c++) {
                System.out.print(c + "  ");
            }
            System.out.println();
        }
        a.close();
    }
}


