package com.igate.tradingsimulator.service;

import java.util.List;

import com.igate.tradingsimulator.domain.TradeTxn;

public interface TradeService {

	TradeTxn saveTrade(TradeTxn tradeTxn);
	List<TradeTxn> getAllOrderBookTrades(String userName);
	List<TradeTxn> getAllTradeBookTrades(String userName);
	void matchTrade();
}
