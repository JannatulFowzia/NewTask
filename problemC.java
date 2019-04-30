import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problemC {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        HashMap<String, ArrayList> d = new HashMap<String, ArrayList>();
        Map<String, HashMap> newList = new HashMap<String, HashMap>();
        
        for (int no = 0; no < testcases; no++) {
            int couples = scan.nextInt();
            int total = scan.nextInt();
            for (int i = 0; i <= couples; i++) {
               String me = scan.nextLine();
                System.out.println("me : " + me);
                if (!me.isEmpty()) {
                    String[] me1 = me.split(" ");
                    if (!" ".equals(me1[0])) {
                        System.out.println("me : " + me1[0]);
                    }
                    ArrayList<String> price = new ArrayList<String>();
                    price.add(me1[1]);
                    price.add(me1[2]);
                    price.add(me1[3]);
                    d.put(me1[0], price);
                    System.out.println("d : " + d);

                }


            }
            for (int i = 0; i <= total; i++) {
                String ne = scan.nextLine();
                System.out.println("me : " + ne);

                String[] data = ne.split(" ");
                String time = data[0];
                String spyName = data[1];
                String event = data[2];
                String brand = data[3];
                HashMap<String, String> d1 = new HashMap<String, String>();
                d1.put(event, brand);

                if (newList.containsKey(spyName)) {
                    Map<String, String> d21 = newList.get(spyName);
                    d21.put(event, brand);
                    newList.put(spyName, (HashMap) d21);

                } else {
                    newList.put(spyName, d1);
                }
                System.out.println(newList);
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;
                System.out.println("duration" + duration);
            }

            // for()
        }
    }

}
