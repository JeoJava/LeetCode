package graph;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/06/02 17:02
 * @Version 1.0
 * @Description:
 */
import java.util.*;
public class Dijkstra extends Graph {
    public  Map<Integer, Integer> dijkstra(int n, int[][] graph, int[] weight, int start) {
        // 构建邻接表
        Map<Integer, List<int[]>> adj = buildADJ(n, graph,weight);
        Map<Integer, Integer> d = new HashMap<>();
        Map<Integer, Integer> prev = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            d.put(i, Integer.MAX_VALUE);
        }
        d.put(start, 0);
        prev.put(start, -1);
        PriorityQueue<int[]> pq = new PriorityQueue<>(((o1, o2) -> o1[1] -o2[1]));
        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int curNode = cur[0];
            int curWeight = cur[1];
            if (curWeight > d.get(curNode)) {
                continue;
            }
            for (int[] neb : adj.get(curNode)) {
                int nowDistance = curWeight + neb[1];
                if (nowDistance < d.get(neb[0])) {
                    d.put(neb[0], nowDistance);
                    prev.put(neb[0], curNode);  // 更新前驱节点
                    pq.offer(new int[]{neb[0], nowDistance});
                }
            }
        }

        // 构造最短路径
        Map<Integer, String> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            if (d.get(i) == Integer.MAX_VALUE) {
                path.put(i, "-1"); // 无法到达该节点
            } else {
                int cur = i;
                StringBuilder sb = new StringBuilder();
                while (cur != -1) {
                    sb.append(cur).append(" ");
                    cur = prev.get(cur);
                }
                sb.reverse();
                path.put(i, sb.toString().trim()); // 倒序存储路径
            }
        }

        return d;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] graph = {{1, 2}, {1, 3}};
        int[] weight = {1, 2};
        int start = 2;
        Map<Integer, Integer> ans = new Dijkstra().dijkstra(n, graph, weight, start);
        System.out.println(ans);
        List<Integer> list = List.of(1,2,3);
        System.out.println(list.toString().replace(" ", ""));
        Deque<Integer> q = new ArrayDeque<>();
        q.offerLast(null);
    }
}