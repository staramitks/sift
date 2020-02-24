package com.sift.app.service;

import java.util.List;

import com.sift.app.dto.StockLeaderDTO;

public interface StockLeaderService {
	
	public List<StockLeaderDTO> getStockLeaders(String stockCategory);

}
