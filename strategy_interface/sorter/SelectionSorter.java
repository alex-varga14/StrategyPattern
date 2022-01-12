package strategy_interface.sorter;

import java.util.ArrayList;
import context.*;

//Strategy Class "SelectionSorter" to implement interface
public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
	@Override
	public void sort(ArrayList<Item<E>> storageM) {
		// TODO Auto-generated method stub
		for(int i = 0; i < storageM.size()-1; i++)
		{
			int min = i;
			for(int j = i+1; j < storageM.size(); j++)
			{
				if(storageM.get(j).getItem().compareTo(storageM.get(min).getItem()) < 0)
				{
					min = j;
				}
			}
			Item<E> tmp = storageM.get(min);
			storageM.set(min, storageM.get(i));
			storageM.set(i, tmp);
		}
	}
}
