import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            deque.add(num);
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, count + 1);
            }

            if (deque.size() == m) {
                if (map.size() > maxUnique) {
                    maxUnique = map.size();
                }
                
                int removed = deque.remove();
                int remCount = map.get(removed);
                if (remCount == 1) {
                    map.remove(removed);
                } else {
                    map.put(removed, remCount - 1);
                }
            }
        }
        
        System.out.println(maxUnique);
        in.close();
    }
}
