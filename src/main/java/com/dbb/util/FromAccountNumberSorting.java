package com.dbb.util;

import java.util.Comparator;

import com.dbb.model.FromAccount;

public class FromAccountNumberSorting implements Comparator<FromAccount> {

	@Override
	public int compare(FromAccount o1, FromAccount o2) {
		return o1.getAccountNumber().compareTo(o2.getAccountNumber());
	}

}
