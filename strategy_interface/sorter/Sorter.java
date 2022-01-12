package strategy_interface.sorter;

import java.util.ArrayList;
import context.*;

//Sorter Strategy Interface
public interface Sorter<E extends Number & Comparable<E> > {
	//Interface method
	public void sort(ArrayList<Item<E>> storageM);
}
