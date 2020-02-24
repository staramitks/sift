package com.sift.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sift.app.dto.StockLeaderDTO;
import com.sift.app.service.StockLeaderService;


@Service("stockLeader")
public class StockLeaderServiceImpl implements StockLeaderService{

	@Override
	public List<StockLeaderDTO> getStockLeaders(String stockCategory) {
		
		List<StockLeaderDTO> stockLeaders= new ArrayList<>();
		StockLeaderDTO lStockLeaderDTO= new StockLeaderDTO(1,"Bajaj Fin.",4880.45,57.54,293651.34,0.12f,21.98f,"LARGE");
		StockLeaderDTO lStockLeaderDTO2= new StockLeaderDTO(2,"Bandhan Bank.",417.95,21.21,66937.34,0.53f,18.96f,"LARGE");
		StockLeaderDTO lStockLeaderDTO3= new StockLeaderDTO(3,"SBI Life Insurance.",928.75,68.84,92875.57,0.22f,18.81f,"LARGE");
		StockLeaderDTO lStockLeaderDTO4= new StockLeaderDTO(4,"Avenue SuperMarket",2462.65,130.61,159524.23,0,17.45f,"LARGE");
		StockLeaderDTO lStockLeaderDTO5= new StockLeaderDTO(5,"ICICI Lombard",1345.45,18.79,61142.09,0.45f,16.12f,"LARGE");
		StockLeaderDTO lStockLeaderDTO6= new StockLeaderDTO(6,"HDFC",2369.5,38.5,409821.6,0.88f,15.95f,"LARGE");
		StockLeaderDTO lStockLeaderDTO7= new StockLeaderDTO(7,"Bajaj Finserv",9709.7,18.31,154517.53,0.03f,14.55f,"LARGE");
		StockLeaderDTO lStockLeaderDTO8= new StockLeaderDTO(8,"IndesInd Bank",1182.2,8.85,81978.7,0.55f,13.08f,"LARGE");
		StockLeaderDTO lStockLeaderDTO9= new StockLeaderDTO(9,"ICICI Bank",547,37.32,353993.46,0.18f,3.78f,"LARGE");
		StockLeaderDTO lStockLeaderDTO10= new StockLeaderDTO(10,"InterGlobe Aviation",1468.85,46.4,56366.88,0.34f,-3.26f,"LARGE");
		
		stockLeaders.add(lStockLeaderDTO);
		stockLeaders.add(lStockLeaderDTO2);
		stockLeaders.add(lStockLeaderDTO3);
		stockLeaders.add(lStockLeaderDTO4);
		stockLeaders.add(lStockLeaderDTO5);
		stockLeaders.add(lStockLeaderDTO6);
		stockLeaders.add(lStockLeaderDTO7);
		stockLeaders.add(lStockLeaderDTO8);
		stockLeaders.add(lStockLeaderDTO9);
		stockLeaders.add(lStockLeaderDTO10);
		
		
		return stockLeaders;
	}

}
