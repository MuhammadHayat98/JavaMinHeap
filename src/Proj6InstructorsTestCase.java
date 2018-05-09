//Comp 333 Project 6
//Instructor's Test Case

import java.util.*;
public class Proj6InstructorsTestCase
{
   public static void main(String[] args)
   {
   //Instructtor's Test Case
      
      System.out.println("\n----------------Testing public methods using first constructor------");
      MinIntHeap h = new MinIntHeap(20);
      int[] testValues =  {19, 35, 14, 45, 3, 66, 64, 44, 96, 97, 3,7, 12, 50 };
      for(int k = 0; k < testValues.length; k++)
         h.heapInsert(testValues[k]); 
      System.out.print("\nPrint Heap Values:\n");
      h.printHeapValues();
      

      for (int i = 0; i < 5; i++)
         System.out.println( "removed min = " + h.removeMin());  
   
      h.heapInsert(50);  
      System.out.println("heap size = " + h.size() + "\t\tisEmpty? " + h.isEmpty());
      System.out.print("\nPrint Heap Values:\n");
      h.printHeapValues();
      int[] z = h.getHeapValues();
      System.out.println("Get Heap Values\n" + Arrays.toString(z));
      
     
      System.out.println("\n--------------Testing public methods using second constructor------");
      int[] a = { 23,3,17,11,5,13,7,19};  
      MinIntHeap h2 = new MinIntHeap(a, 20);
      System.out.print("\nPrint Heap Values:\n");
      h2.printHeapValues();
      h2.heapInsert(2);
      System.out.println( "removed min = " + h2.removeMin());
      System.out.println( "removed min = " + h2.removeMin());
      System.out.print("\nPrint Heap Values:\n");
      h2.printHeapValues();
      
   
//      System.out.println("\n-------------Testing heapsort---------------------------------------");
//      int[]  b = {-4, 6,7 ,-20, 50 ,70};
//      System.out.println("unsorted array = " + Arrays.toString(b));
//      MinIntHeap.heapSort(b);
//      System.out.println("sorted array = " + Arrays.toString(b));
//      
//      System.out.println("\n----------------Testing Error messages-------------");
//      MinIntHeap h3 = new MinIntHeap(5);
//      for( int k = 1; k <= 6; k++)
//          h3.heapInsert(2- (k-3)*(k -3));
//      System.out.println("Print Heap Values");
//      h3.printHeapValues();
//      while( !h3.isEmpty())
//         System.out.println( "removed min: " + h3.removeMin() + "  " );
//      h3.removeMin();
      
      
   }




}
/* -----------Testcase Answers--------------------


----------------Testing public methods using first constructor------

Print Heap Values:
3  3  7  44  14  12  50  45  96  97  
35  66  19  64  
removed min = 3
removed min = 3
removed min = 7
removed min = 12
removed min = 14
heap size = 10		isEmpty? false

Print Heap Values:
19  35  50  44  50  66  97  45  96  64  

Get Heap Values
[19, 35, 50, 44, 50, 66, 97, 45, 96, 64]

--------------Testing public methods using second constructor------

Print Heap Values:
3  5  7  11  23  13  17  19  
removed min = 2
removed min = 3

Print Heap Values:
5  11  7  19  23  13  17  

-------------Testing heapsort---------------------------------------
unsorted array = [-4, 6, 7, -20, 50, 70]
sorted array = [-20, -4, 6, 7, 50, 70]

----------------Testing Error messages-------------
Heap is full. Value Not Added = -7
Print Heap Values
-2  -2  2  1  1  
removed min: -2  
removed min: -2  
removed min: 1  
removed min: 1  
removed min: 2  
Cannot delete min from an empty heap


*/