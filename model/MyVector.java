package model;

import java.util.ArrayList;
import java.util.Iterator;
import strategy_interface.sorter.*;

public class MyVector<E extends Number & Comparable<E> > {

	private ArrayList<Item<E>> storageM;
	private Sorter<E> sorter;
	
	public MyVector(int n)
	{
		storageM = new ArrayList<Item<E>>(n);
	}
	public MyVector(ArrayList<Item<E>> arr)
	{
		storageM = arr;
	}
	public void add(Item<E> value)
    {
		storageM.add(value);
	}
    //Selects sort strategy from sorter interface to be applied to MyVector object
    public void setSortStrategy(Sorter<E> s)
    {
    	this.sorter = s;
    }
    public void performSort()
    { 	
    	sorter.sort(storageM);
    }
    //Display method
    //Displays all elements of ArrayList storageM of type Item<E>
    public void display()
    {
    	StringBuilder tmp = new StringBuilder();
    	Iterator<Item<E>> myIt =  storageM.iterator();
    	System.out.println("The contents are: ");
    	while(myIt.hasNext())
    	{
    		tmp.append(myIt.next().getItem() + " ");
    	}
    	System.out.println(tmp.toString());
    }
}
