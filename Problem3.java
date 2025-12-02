import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (integer): ");
        int a = Integer.parseInt(sc.nextLine().trim());
        int n = (a % 2 == 1) ? a : (a - 1);
        if (n <= 0) {
            System.out.println(""); // no output for a <= 0 or a == 0/1 handled
            sc.close();
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(2 * i + 1);
            if (i != n - 1) sb.append(", ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
