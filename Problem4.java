import java.util.*;
import java.util.stream.Collectors;

public class Problem4 {
    public static Map<Integer, Integer> countMultiples(List<Integer> nums) {
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int d = 1; d <= 9; d++) {
            final int div = d;
            int cnt = 0;
            for (int n : nums) {
                if (n % div == 0) cnt++;
            }
            counts.put(d, cnt);
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by commas (e.g. 1,2,8,9,12,...): ");
        String line = sc.nextLine().trim();
        List<Integer> nums;
        if (line.isEmpty()) {
            nums = Collections.emptyList();
        } else {
            nums = Arrays.stream(line.split(","))
                         .map(String::trim)
                         .filter(s -> !s.isEmpty())
                         .map(Integer::parseInt)
                         .collect(Collectors.toList());
        }
        Map<Integer, Integer> res = countMultiples(nums);

        // Print in requested format similar to the example:
        System.out.print("{");
        boolean first = true;
        for (Map.Entry<Integer, Integer> e : res.entrySet()) {
            if (!first) System.out.print(", ");
            System.out.print(e.getKey() + ": " + e.getValue());
            first = false;
        }
        System.out.println("}");
        sc.close();
    }
}
