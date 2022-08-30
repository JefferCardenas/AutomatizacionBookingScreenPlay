package com.sophos.semillero.utils;

import java.util.List;

public class Find {
	public static Integer cheapPrice(List<Integer> lstPrices) {
		Integer priceCheap = 0;
		int band = 999999;
		
		for(Integer price : lstPrices) {
			if(price < band) {
				band = price;
				priceCheap = price;
			}
		}
		
		return priceCheap;
	}
}
