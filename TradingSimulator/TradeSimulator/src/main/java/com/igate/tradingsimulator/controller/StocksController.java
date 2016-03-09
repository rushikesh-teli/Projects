package com.igate.tradingsimulator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igate.tradingsimulator.mappingutils.StocksMapping;
import com.igate.tradingsimulator.service.StocksService;
import com.igate.tradingsimulator.vo.StocksVO;

@RestController
public class StocksController {
	
	@Autowired
	private StocksService stocksService;

	public StocksService getStocksService() {
		return stocksService;
	}

	public void setStocksService(StocksService stocksService) {
		this.stocksService = stocksService;
	}
	

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/listAllStocks" , method = {RequestMethod.POST, RequestMethod.GET})
	public List<StocksVO> listAllStocks(){
		return StocksMapping.mapDBStockstoVO(getStocksService().listAllStocks());
	}
}
