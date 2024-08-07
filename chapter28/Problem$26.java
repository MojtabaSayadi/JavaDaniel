package chapter_twenty_eight;

/**
 * *28.26 (Implement remove(int u, int v)) Modify Listing 28.4, UnweightedGraph.java, to
 * override the remove(int u, int v) method defined in the Graph interface.
 *
 *
 * @ Mojtaba Sayadi
 * */
public class Problem$26
{
    public static void main(String[] args)
    {
        String[] vertices = {"Seattle", "San Francisco", "Los Angeles",
                "Denver", "Kansas City", "Chicago", "Boston", "New York",
                "Atlanta", "Miami", "Dallas", "Houston"};

        int[][] edges =
                {
                        {0, 1}, {0, 3}, {0, 5},
                        {1, 0}, {1, 2}, {1, 3},
                        {2, 1}, {2, 3}, {2, 4}, {2, 10},
                        {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
                        {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
                        {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
                        {6, 5}, {6, 7},
                        {7, 4}, {7, 5}, {7, 6}, {7, 8},
                        {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
                        {9, 8}, {9, 11},
                        {10, 2}, {10, 4}, {10, 8}, {10, 11},
                        {11, 8}, {11, 9}, {11, 10}
                };

        Graph<String> graph = new UnweightedGraph<>(vertices, edges);
        graph.remove(0, 1);

        /*
        * [3, 5]
        * */
        System.out.println(graph.getNeighbors(0));

        /*
        * [2, 3]
        * */
        System.out.println(graph.getNeighbors(1));


        graph.remove(6, 5);

        /*
        * [3, 4, 6, 7]
        * */
        System.out.println(graph.getNeighbors(5));

        /*
        * [7]
        * */
        System.out.println(graph.getNeighbors(6));


        graph.remove(0, 3);

        /*
        * [5]
        * */
        System.out.println(graph.getNeighbors(0));

        /*
        * [1, 2, 4, 5]
        * */
        System.out.println(graph.getNeighbors(3));
    }
}
