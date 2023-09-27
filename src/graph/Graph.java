package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xutao
 * @Date: 2023/06/02 17:01
 * @Version 1.0
 * @Description:
 */
public class Graph {
    public  Map<Integer, List<int[]>>  buildADJ(int n, int [][]graph, int[] weight){
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            int[] edge = graph[i];
            int w = weight[i];
            adj.putIfAbsent(edge[0], new ArrayList<>());
            adj.putIfAbsent(edge[1], new ArrayList<>());
            adj.get(edge[0]).add(new int[]{edge[1], w});
            adj.get(edge[1]).add(new int[]{edge[0], w});
        }
        return adj;
    }
    public int[][] getDegree(int n , int [][]graph){
        int[][] degree = new int[n][2];
        for (int i = 0; i < graph.length; i++) {
            int[] edge = graph[i];
            degree[edge[0]][0]++;
            degree[edge[0]][1]++;
            degree[edge[1]][0]++;
            degree[edge[1]][1]++;
        }
        return degree;
    }
}
