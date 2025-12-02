import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (integer): ");
        int a = Integer.parseInt(sc.nextLine().trim());
        if (a <= 0) {
            System.out.println(""); // nothing or you can print message
            sc.close();
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int val = 2 * i + 1;
            sb.append(val);
            if (i != a - 1) sb.append(", ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
