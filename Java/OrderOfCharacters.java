/*
import java.util.*;

class Lexi
{
    private final LinkedList<Integer>[] adjacencyList;
 
    Lexi(int nVertices)
    {
        adjacencyList = new LinkedList[nVertices];
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
        {
            adjacencyList[vertexIndex] = new LinkedList<>();
        }
    }
 
    void addEdge(int startVertex, int endVertex)
    {
        adjacencyList[startVertex].add(endVertex);
    }
 
    private int getNoOfVertices()
    {
        return adjacencyList.length;
    }
 
    private void topologicalSortUtil(int currentVertex, boolean[] visited, Stack<Integer> stack)
    {
        visited[currentVertex] = true;
 
        for (int adjacentVertex : adjacencyList[currentVertex])
        {
            if (!visited[adjacentVertex])
            {
                topologicalSortUtil(adjacentVertex, visited, stack);
            }
        }
        stack.push(currentVertex);
    }
    
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<>();
 
        boolean[] visited = new boolean[getNoOfVertices()];
        for (int i = 0; i < getNoOfVertices(); i++)
        {
            visited[i] = false;
        }
        
        for (int i = 0; i < getNoOfVertices(); i++)
        {
            if (!visited[i])
            {
                topologicalSortUtil(i, visited, stack);
            }
        }
        
        while (!stack.isEmpty())
        {
            System.out.print((char)('a' + stack.pop()) + " ");
        }
    }
}
 
class OrderOfCharacters
{
    private static void printOrder(String[] words, int alpha)
    {
        Lexi Lexi = new Lexi(alpha);
 
        for (int i = 0; i < words.length - 1; i++)
        {
            String word1 = words[i];
            String word2 = words[i+1];
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++)
            {
                if (word1.charAt(j) != word2.charAt(j))
                {
                    Lexi.addEdge(word1.charAt(j) - 'a', word2.charAt(j)- 'a');
                    break;
                }
            }
        }
        Lexi.topologicalSort();
    }
    
    public static void main(String[] args)
    {
    	int size;
    	String temp;
    	Scanner sc = new Scanner(System.in);
    	size = sc.nextInt();
        String[] words = new String[size];
    	
    	for(int i=0;i<size;i++)
    	{
    		temp = sc.next();
    		words[i] = temp;
    	}
    	
        printOrder(words, size);
    }
}
*/

import java.util.*;
 
// Class to represent a graph
class Graph
{
 
    // An array representing the graph as an adjacency list
    private final LinkedList<Integer>[] adjacencyList;
 
    Graph(int nVertices)
    {
        adjacencyList = new LinkedList[nVertices];
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
        {
            adjacencyList[vertexIndex] = new LinkedList<>();
        }
    }
 
    // function to add an edge to graph
    void addEdge(int startVertex, int endVertex)
    {
        adjacencyList[startVertex].add(endVertex);
    }
 
    private int getNoOfVertices()
    {
        return adjacencyList.length;
    }
 
    // A recursive function used by topologicalSort
    private void topologicalSortUtil(int currentVertex, boolean[] visited,
                                     Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[currentVertex] = true;
 
        // Recur for all the vertices adjacent to this vertex
        for (int adjacentVertex : adjacencyList[currentVertex])
        {
            if (!visited[adjacentVertex])
            {
                topologicalSortUtil(adjacentVertex, visited, stack);
            }
        }
 
        // Push current vertex to stack which stores result
        stack.push(currentVertex);
    }
 
    // prints a Topological Sort of the complete graph
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<>();
 
        // Mark all the vertices as not visited
        boolean[] visited = new boolean[getNoOfVertices()];
        for (int i = 0; i < getNoOfVertices(); i++)
        {
            visited[i] = false;
        }
 
        // Call the recursive helper function to store Topological
        // Sort starting from all vertices one by one
        for (int i = 0; i < getNoOfVertices(); i++)
        {
            if (!visited[i])
            {
                topologicalSortUtil(i, visited, stack);
            }
        }
 
        // Print contents of stack
        while (!stack.isEmpty())
        {
            System.out.print((char)('a' + stack.pop()) + " ");
        }
    }
}
 
public class OrderOfCharacters
{
    // This function finds and prints order
    // of character from a sorted array of words.
    // alpha is number of possible alphabets
    // starting from 'a'. For simplicity, this
    // function is written in a way that only
    // first 'alpha' characters can be there
    // in words array. For example if alpha
    //  is 7, then words[] should contain words
    // having only 'a', 'b','c' 'd', 'e', 'f', 'g'
    private static void printOrder(String[] words, int alpha)
    {
        // Create a graph with 'aplha' edges
        Graph graph = new Graph(alpha);
 
        for (int i = 0; i < words.length - 1; i++)
        {
            // Take the current two words and find the first mismatching
            // character
            String word1 = words[i];
            String word2 = words[i+1];
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++)
            {
                // If we find a mismatching character, then add an edge
                // from character of word1 to that of word2
                if (word1.charAt(j) != word2.charAt(j))
                {
                    graph.addEdge(word1.charAt(j) - 'a', word2.charAt(j)- 'a');
                    break;
                }
            }
        }
 
        // Print topological sort of the above created graph
        graph.topologicalSort();
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        String[] words = {"caa", "aaa", "aab"};
        printOrder(words, 3);
    }
}
