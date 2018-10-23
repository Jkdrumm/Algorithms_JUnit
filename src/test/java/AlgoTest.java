package test.java;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest
{

	private Item[] caseBubble1, caseBubble2, caseBubble3, caseBubble4, caseBubble5;
	private Item[] caseSelection1, caseSelection2, caseSelection3, caseSelection4;
	private Item[] caseInsertion1, caseInsertion2, caseInsertion3, caseInsertion4;
	private Item[] caseMerge1, caseMerge2, caseMerge3;
	private Item[] caseQuick1, caseQuick2, caseQuick3, caseQuick4, caseQuick5;
	private Item[] caseHeap1, caseHeap2, caseHeap3, caseHeap4, caseHeap5;
	
	@Before
	public void setUpBefore()
	{
		//Bubble
		caseBubble1 = null;
		caseBubble2 = new Item[] {new Item(3)};
		caseBubble3 = new Item[] {new Item(4), new Item(3)};
		caseBubble4 = new Item[] {new Item(3), new Item(4), new Item(5)};
		caseBubble5 = new Item[] {new Item(5), new Item(4), new Item(3)};
		
		//Selection
		caseSelection1 = null;
		caseSelection2 = new Item[] {new Item(3)};
		caseSelection3 = new Item[] {new Item(3), new Item(4)};
		caseSelection4 = new Item[] {new Item(4), new Item(3)};
		
		//Insertion
		caseInsertion1 = null;
		caseInsertion2 = new Item[] {new Item(3)};
		caseInsertion3 = new Item[] {new Item(4), new Item(3)};
		caseInsertion4 = new Item[] {new Item(2), new Item(1), new Item(3), new Item(4), new Item(5)};
		
		//Merge
		caseMerge1 = null;
		caseMerge2 = new Item[] {new Item(4), new Item(3)};
		caseMerge3 = new Item[] {new Item(4), new Item(3), new Item(1), new Item(2)};
		
		//Quick
		caseQuick1 = null;
		caseQuick2 = new Item[] {new Item(4), new Item(3)};
		caseQuick3 = new Item[] {new Item(2), new Item(1), new Item(3)};
		caseQuick4 = new Item[] {new Item(4), new Item(3), new Item(1), new Item(2)};
		caseQuick5 = new Item[] {new Item(2), new Item(1), new Item(3), new Item(4), new Item(5)};
		
		//Heap
		caseHeap1 = null;
		caseHeap2 = new Item[] {new Item(3)};
		caseHeap3 = new Item[] {new Item(4), new Item(3)};
		caseHeap4 = new Item[] {new Item(2), new Item(1), new Item(3)};
		caseHeap5 = new Item[] {new Item(2), new Item(3), new Item(1)};
	}
	
	//Tests Node Coverage 1, Edge Coverage 1, Condition Coverage 1 
	@Test
	public void testBubble1()
	{
		boolean caught = false;
		try
		{
			SortAlgos.bubbleSort(caseBubble1);
		}
		catch(NullPointerException e)
		{
			caught = true;
		}
		finally
		{
			assertTrue(caught);
		}
	}
	
	//Tests Edge Coverage 2, Condition Coverage 2
	@Test
	public void testBubble2()
	{
		try
		{
			SortAlgos.bubbleSort(caseBubble2);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseBubble2));
	}
	
	//Tests Edge Coverage 3, Condition Coverage 3
	@Test
	public void testBubble3()
	{
		try
		{
			SortAlgos.bubbleSort(caseBubble3);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseBubble3));
	}
	
	//Tests Edge Coverage 4, Condition Coverage 4
	@Test
	public void testBubble4()
	{
		try
		{
			SortAlgos.bubbleSort(caseBubble4);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseBubble4));
	}
	
	//Tests Node Coverage 2, Edge Coverage 5, Condition Coverage 5
	@Test
	public void testBubble5()
	{
		try
		{
			SortAlgos.bubbleSort(caseBubble5);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseBubble5));
	}
	
	@Test
	public void testSelection1()
	{
		boolean caught = false;
		try
		{
			SortAlgos.selectionSort(caseSelection1);
		}
		catch(NullPointerException e)
		{
			caught = true;
		}
		finally
		{
			assertTrue(caught);
		}
	}
	
	@Test
	public void testSelection2()
	{
		try
		{
			SortAlgos.selectionSort(caseSelection2);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseSelection2));
	}
	
	@Test
	public void testSelection3()
	{
		try
		{
			SortAlgos.selectionSort(caseSelection3);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseSelection3));
	}
	
	@Test
	public void testSelection4()
	{
		try
		{
			SortAlgos.selectionSort(caseSelection4);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseSelection4));
	}
	
	@Test
	public void testInsertion1()
	{
		boolean caught = false;
		try
		{
			SortAlgos.insertionSort(caseInsertion1);
		}
		catch(NullPointerException e)
		{
			caught = true;
		}
		finally
		{
			assertTrue(caught);
		}
	}
	
	@Test
	public void testInsertion2()
	{
		try
		{
			SortAlgos.insertionSort(caseInsertion2);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseInsertion2));
	}
	
	@Test
	public void testInsertion3()
	{
		try
		{
			SortAlgos.insertionSort(caseInsertion3);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseInsertion3));
	}
	
	@Test
	public void testInsertion4()
	{
		try
		{
			SortAlgos.insertionSort(caseInsertion4);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseInsertion4));
	}
	
	@Test
	public void testMerge1()
	{
		boolean caught = false;
		try
		{
			SortAlgos.mergeSort(caseMerge1);
		}
		catch(NullPointerException e)
		{
			caught = true;
		}
		finally
		{
			assertTrue(caught);
		}
	}
	
	@Test
	public void testMerge2()
	{
		try
		{
			SortAlgos.mergeSort(caseMerge2);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseMerge2));
	}
	
	@Test
	public void testMerge3()
	{
		try
		{
			SortAlgos.mergeSort(caseMerge3);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseMerge3));
	}
	
	@Test
	public void testQuick1()
	{
		boolean caught = false;
		try
		{
			SortAlgos.quickSort(caseQuick1);
		}
		catch(NullPointerException e)
		{
			caught = true;
		}
		finally
		{
			assertTrue(caught);
		}
	}
	
	@Test
	public void testQuick2()
	{
		try
		{
			SortAlgos.quickSort(caseQuick2);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseQuick2));
	}
	
	@Test
	public void testQuick3()
	{
		try
		{
			SortAlgos.quickSort(caseQuick3);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseQuick3));
	}
	
	@Test
	public void testQuick4()
	{
		try
		{
			SortAlgos.quickSort(caseQuick4);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseQuick4));
	}
	
	@Test
	public void testQuick5()
	{
		try
		{
			SortAlgos.quickSort(caseQuick5);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseQuick5));
	}
	
	@Test
	public void testHeap1()
	{
		boolean caught = false;
		try
		{
			SortAlgos.heapSort(caseHeap1);
		}
		catch(NullPointerException e)
		{
			caught = true;
		}
		finally
		{
			assertTrue(caught);
		}
	}
	
	@Test
	public void testHeap2()
	{
		try
		{
			SortAlgos.heapSort(caseHeap2);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseHeap2));
	}
	
	@Test
	public void testHeap3()
	{
		try
		{
			SortAlgos.heapSort(caseHeap3);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseHeap3));
	}
	
	@Test
	public void testHeap4()
	{
		try
		{
			SortAlgos.heapSort(caseHeap4);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseHeap4));
	}
	
	@Test
	public void testHeap5()
	{
		try
		{
			SortAlgos.heapSort(caseHeap5);
		}
		catch(Exception e)
		{
			fail();
		}
		assertTrue(isSorted(caseHeap5));
	}

	@Test
	public void testSortAlgosClass()
	{
		assertTrue(new SortAlgos() != null);
	}
	
	public boolean isSorted(Item[] vec)
	{
		for(int i = 0; i < vec.length - 1; i++)
		    if(vec[i].key > vec[i + 1].key)
		        return false;
		return true;
	}

}
