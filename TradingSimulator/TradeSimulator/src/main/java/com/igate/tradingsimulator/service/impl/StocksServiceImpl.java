package com.igate.tradingsimulator.service.impl;

import java.util.List;

import com.igate.tradingsimulator.dao.StocksDAO;
import com.igate.tradingsimulator.domain.Stocks;
import com.igate.tradingsimulator.service.BaseService;
import com.igate.tradingsimulator.service.StocksService;

public class StocksServiceImpl extends BaseService implements StocksService{

	private StocksDAO stocksDAO;

	public StocksDAO getStocksDAO() {
		return stocksDAO;
	}

	public void setStocksDAO(StocksDAO stocksDAO) {
		this.stocksDAO = stocksDAO;
	}

	@Override
	public List<Stocks> listAllStocks() {
		return getStocksDAO().getAllStocks();
	}

}
