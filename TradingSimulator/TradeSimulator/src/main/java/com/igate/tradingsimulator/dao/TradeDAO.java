package com.igate.tradingsimulator.dao;

import java.util.List;

import com.igate.tradingsimulator.domain.TradeTxn;

public interface TradeDAO {
	
	TradeTxn saveTrade(TradeTxn tradeTxn);
	void getMatchingTrades();
	List<TradeTxn> getTradesForUser(int userId,String status);
}
