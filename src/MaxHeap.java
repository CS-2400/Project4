import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxHeap {
	private Node<Integer> root;
	Node<Integer> currentNode = root;
	public MaxHeap() throws FileNotFoundException {
		File file = new File("/data.txt");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		root = new Node<>(scan.nextInt());
		while(scan.hasNextLine()) {
			Node<Integer> newNode = new Node<>(scan.nextInt());
			if(!currentNode.hasChild()) {
				currentNode.setChild(newNode);
				currentNode = newNode;
			}
			
		}
	}
	
	@SuppressWarnings("rawtypes")
	private class Node<T> implements Comparable<Node>{
		private T data;
		private Node<T> child;
		
		public Node(){
			this(null);
		}
		public Node(T data) {
			this(data, null);
		}
		public Node(T data, Node<T> newChild) {
			this.data = data;
			this.child = newChild;
		}
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		
		public Node<T> getChild(){
			return child;
		}
		
		public void setChild(Node<T> newNode) {
			this.child = newNode;
		}
		
		public boolean hasChild() {
			if(child != null) return true;
			return false;
		}
		@Override
		public int compareTo(MaxHeap.Node o) {
			// TODO Auto-generated method stub
			return this.compareTo(o);
		}
	}
	
	
	
}
