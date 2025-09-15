import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class N2108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);


        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }

        float med = (float) sum / n;
        int intMed = Math.round(med);
        System.out.println(intMed);

        int midNum = n / 2 ;
        System.out.println(arr[midNum]);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : arr) {
            // map.getOrDefault(key, defaultValue)
            // - number라는 Key가 Map에 있으면 해당 Value를 가져온다.
            // - number라는 Key가 없으면 defaultValue(여기서는 0)를 사용한다.
            // 가져온 값에 1을 더해서 다시 Map에 넣는다.
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        List<Integer> mostFreqList = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(mostFreqList.isEmpty()){
                mostFreqList.add(key);
            }else{
                if(value > frequencyMap.get(mostFreqList.getFirst())){
                    mostFreqList.clear();
                    mostFreqList.add(key);
                }else if (value.equals(frequencyMap.get(mostFreqList.getFirst()))){
                    mostFreqList.add(key);
                }
            }

        }
        if(mostFreqList.size()>1){
            Collections.sort(mostFreqList);
            System.out.println(mostFreqList.get(1));
        }else{
            System.out.println(mostFreqList.getFirst());
        }

        int range = arr[n - 1] - arr[0];
        System.out.println(range);


    }

}
