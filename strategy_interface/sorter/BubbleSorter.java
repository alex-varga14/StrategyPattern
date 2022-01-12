package strategy_interface.sorter;

import java.util.ArrayList;
import context.*;

//Strategy Class "BubbleSorter" to implement interface
public class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E>{
	@Override
	public void sort(ArrayList<Item<E>> storageM) {
		for(int i = 0; i < storageM.size()-1; i++) 
		{
			for(int j = 0; j < storageM.size()-1-i; j++)
			{
				if(storageM.get(j).getItem().compareTo(storageM.get(j+1).getItem()) > 0)
				{
					Item<E> tmp = storageM.get(j);
					storageM.set(j, storageM.get(j+1));
					storageM.set(j+1, tmp);
				}
			}
		}
	}
}