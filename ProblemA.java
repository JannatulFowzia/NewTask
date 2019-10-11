import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner scan = new Scanner(System.in);

        int testcases = scan.nextInt();

        for (int no = 0; no < testcases; no++)
            {
            int couples = scan.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            ArrayList<Integer> chck = new ArrayList<>();
            long fin = 0;
            
            for (int i = 0; i < couples; i++){
                nums.add(scan.nextInt());
                if (!chck.contains(nums.get(i)))
                    {
                    chck.add(nums.get(i));
                    fin += nums.get(i);
                } else {
                    fin -= nums.get(i);
                }

            }

            System.out.println("Case #" + (no + 1) + ": " + fin);

            }

        scan.close();
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println(duration);
            }
}
