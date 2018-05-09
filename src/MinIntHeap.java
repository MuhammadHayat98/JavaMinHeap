import java.lang.reflect.Array;
import java.util.Arrays;

public class MinIntHeap {
	private int[] items;
	private int lastNode;
	private int size;
	 //constructor that sets max capacity of the heap to m
	   public MinIntHeap( int m) 
	   {  
		   this.items = new int[m];
		   this.lastNode = 0;;
	   }   

	//constructor that sets max capacity of heap to m; initializes the heap with the b values. 
	//Use a private method called buildheap
	   public MinIntHeap( int[] b, int m) 
	   { 
		   this.items = new int[m];
		   
		   buildHeap(b);
	   }


	//-------------- public methods -------------------------------
	   public boolean isEmpty() 
	   { 
		   if(this.size == 0)
			   return true;
		   else
			   return false;
	   }
	   public int size() 
	   { 
		   return this.size;
	   }  //return number of values in the heap
	   public void heapInsert(int v) 
	   { 
		   this.lastNode++;
		   items[lastNode] = v;
		   bubbleUp(lastNode);
		   this.size++;
		   
	   }
	   
	   public int  removeMin () 
	   { 
		   int minValue = items[1];
		   items[1] = items[lastNode];
		   items[lastNode] = 0;
		   this.lastNode--;
		   this.size--;
		   bubbleDown(1);
		   return minValue;
	   }
	   public int min() 
	   {
		   return items[1];
	   }

	 // Print the heap values in  heap array order
	  public void printHeapValues() 
	  {
		  for(int i = 1; i <= this.size; i++)
			  System.out.print(items[i] + " ");
	  }
	 
	// Return a copy of the heap values in heap array order.
	 public int[]  getHeapValues() 
	 { 
		 int[] z = new int[size];
		 for(int i = 0; i < z.length; i++) 
		 {
			z[i] = items[i+1];
		 }
		 return z;
	 }   

	 //Uses heapsort algorithm to sort the array b. This is the only static method.
	public static void heapsort( int[] b) 
	{ 
	
	} 

	  //------------private methods ---- including bubbleup, bubbledown and buildheap-------
	private void buildHeap(int[] array) 
	{
		int k = 1;
		this.lastNode = array.length;
		for(int i = 0; i < array.length; i++) 
		{
			this.items[k] = array[i];
			k++;
			this.size++;
		}
		for(int j = (lastNode/2); j >= 1; j--)
		{
			bubbleDown(j);
		}
	}
	
	private void bubbleDown(int n) 
	{
		while(hasChild(n))
		{
			int child;
			if(leftChild(n) == -1)
				child = rightChild(n);
			else if(rightChild(n) == -1)
				child = leftChild(n);
			else if(items[leftChild(n)] > items[rightChild(n)])
				child = rightChild(n);
			else
				child = leftChild(n);
			if(items[n] > items[child]) 
			{
				swap(n, child);
				n = child;
			}
			else
				break;
			
		}
	}
	
	private void bubbleUp(int n) 
	{
		while(n != 1) 
		{
			if(items[n] < items[parent(n)]) 
			{
				swap(n,parent(n));
				n = parent(n);
			}
			else
				return;
		}
	}
	
	private boolean hasChild(int k) 
	{
		if((leftChild(k) != -1) || (rightChild(k) != -1)) 
		{
			return true;
		}
		else
			return false;
	}
	
	private int leftChild(int k) 
	{	
		int left;
		if((2*k) > items.length) 
			left = -1;
		else
			left = (items[(2*k)] != 0) ? (2*k) : -1;
		return left;
	}
	
	private int rightChild(int k) 
	{
		int right;
		if(((2*k)+1) > items.length)
			right = -1;
		else
			right = (items[(2*k)+1] != 0) ? ((2*k)+1) : -1;
		return right;
	}
	private int parent(int k) 
	{
		return (k/2);
	}
	private void swap(int a, int b) 
	{
		int tmp = items[b];
		items[b] = items[a];
		items[a] = tmp;
		
	}

}
