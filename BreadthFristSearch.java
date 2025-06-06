import java.util.LinkedList;
import java.util.Iterator;

class Graph {
    private final int V;  // Made final
    private final LinkedList<Integer>[] adj;  // Made final

    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print("a" + (v + 1) + " ");
        
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        System.out.println("\nDFS dengan vertex awal a" + (v + 1));
        DFSUtil(v, visited);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        
        visited[s] = true;
        queue.add(s);
        
        System.out.println("\nBFS dengan vertex awal a" + (s + 1));
        
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print("a" + (s + 1) + " ");
            
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(7);
        
        // Membuat hubungan antar node
        g.addEdge(0, 1);  // a1 -> a2
        g.addEdge(0, 2);  // a1 -> a3
        g.addEdge(1, 3);  // a2 -> a4
        g.addEdge(1, 4);  // a2 -> a5
        g.addEdge(2, 5);  // a3 -> a6
        g.addEdge(4, 6);  // a5 -> a7
        
        System.out.println("Struktur Graf:");
        System.out.println("a1 -> a2, a3");
        System.out.println("a2 -> a4, a5");
        System.out.println("a3 -> a6");
        System.out.println("a5 -> a7");
        
        // Memulai DFS dari a1 (0)
        g.DFS(0);
        
        // Memulai BFS dari a1 (0)
        g.BFS(0);
    }
}
    
