import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class solution {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        Map<String, HashMap> newList = new HashMap<String, HashMap>();
        Map<String, HashMap> pricelist = new HashMap<String, HashMap>();
        int testcases = scan.nextInt();
        for (int no = 0; no < testcases; no++) {
            int couples = scan.nextInt();
            int nextooo = scan.nextInt();
            for (int s = 0; s <= couples; s++) {
                HashMap<String, String> price = new HashMap<String, String>();
                String next = scan.nextLine();
                String[] da = next.split(" ");
                if (!"".equals(da[0])) {
                    price.put("catalogPrice", da[1]);
                    price.put("pickupPrice", da[2]);
                    price.put("priceperHour", da[3]);
                    pricelist.put(da[0], price);
                }

            }

            for (int i = 0; i < nextooo; i++) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
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
            }

        }
        List<String> result = new ArrayList<String>();
        for (Entry<String, HashMap> entry : newList.entrySet()) {
            String name = entry.getKey();
            HashMap value = entry.getValue();
            HashMap<String, String> amount = new HashMap<String, String>();
            for (Entry<String, HashMap> price : pricelist.entrySet()) {
                amount = price.getValue();
                if (value.containsKey("p") && value.containsKey("a") && value.containsKey("r")) {
                    if (price.getKey().equals(value.get("p"))) {
                        int hours = Integer.parseInt((String) value.get("r"));
                        int perHour = Integer.parseInt((String) amount.get("priceperHour"));
                        int pickup = Integer.parseInt((String) amount.get("pickupPrice"));
                        int catalogPrice = Integer.parseInt((String) amount.get("catalogPrice"));
                        int surityPercent = Integer.parseInt((String) value.get("a"));
                        int securityPrice = catalogPrice * surityPercent / 100;
                        int totalPrice = (hours * perHour) + pickup + securityPrice;
                        result.add(name + " " + totalPrice);
                    }
                } else if (value.containsKey("p") && value.containsKey("r")) {
                    if (price.getKey().equals(value.get("p"))) {
                        int hours = Integer.parseInt((String) value.get("r"));
                        int perHour = Integer.parseInt((String) amount.get("priceperHour"));
                        int pickup = Integer.parseInt((String) amount.get("pickupPrice"));
                        int totalPrice = (hours * perHour) + pickup;
                        result.add(name + " " + totalPrice);
                    }

                } else {
                    result.add(name + " " + "INCONSISTENT");
                    break;
                }

            }


        }
        Collections.sort(result);
        for (String s : result) {
            System.out.println(s);
        }
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println(duration);
    }


}
