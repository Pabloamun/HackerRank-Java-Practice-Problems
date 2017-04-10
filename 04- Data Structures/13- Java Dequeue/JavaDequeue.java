package dataStructures;

import java.util.*;

public class JavaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Deque<Integer> deq = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int k = in.nextInt();
			Integer v = map.get(k);

			deq.add(k);
			if (v == null) {
				map.put(k, 1);
			} else {
				map.replace(k, v, v + 1);
			}

			if (deq.size() > m) {
				k = deq.remove();
				v = map.get(k);
				map.replace(k, v, v - 1);
				map.remove(k, 0);
			}

			if (deq.size() == m && map.size() > max) {
				max = map.size();
			}
		}
		System.out.println(max);
		in.close();
	}
}
