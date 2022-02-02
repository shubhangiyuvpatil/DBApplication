package com.dbb.util;

import java.util.Comparator;
import com.dbb.model.ToAccount;

public class ToAccountNumberSorting implements Comparator<ToAccount> {

	@Override
	public int compare(ToAccount o1, ToAccount o2) {
		return o1.getAccountNumber().compareTo(o2.getAccountNumber());
	}

}
