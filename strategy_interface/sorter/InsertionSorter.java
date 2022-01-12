package strategy_interface.sorter;

import java.util.ArrayList;
import context.*;

//Strategy Class "InsertionSorter" to implement interface
public class InsertionSorter<E extends Number & Comparable<E> > implements Sorter<E>{
	@Override
	public void sort(ArrayList<Item<E>> storageM) {
		for(int i = 1; i < storageM.size(); i++)
		{
			Item<E> t = storageM.get(i);
			int j;
			for(j = i-1; j >= 0 && (storageM.get(j).getItem().compareTo(t.getItem()) > 0); j--)
			{
				storageM.set(j+1, storageM.get(j));
			}
		storageM.set(j+1, t);
		}
	}
}