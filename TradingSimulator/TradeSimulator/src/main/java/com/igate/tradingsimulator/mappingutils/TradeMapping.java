package com.igate.tradingsimulator.mappingutils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.igate.tradingsimulator.domain.TradeTxn;
import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.vo.TradeVO;

import static com.igate.tradingsimulator.util.AppConstants.BUY;

public class TradeMapping {
	
	public static TradeTxn mapTradeData(TradeVO tradevo){
		TradeTxn tradeTxn = new TradeTxn();
		tradeTxn.setAction(tradevo.getAction());
		tradeTxn.setCreationDate(Calendar.getInstance().getTime());
		tradeTxn.setExchange(tradevo.getExchange());
		tradeTxn.setLimitPrice(tradevo.getLimitPrice());
		tradeTxn.setOrderType(tradevo.getOrderType());
		tradeTxn.setOrderValidity(tradevo.getOrderValidity());
		tradeTxn.setProduct(tradevo.getProduct());
		tradeTxn.setQuantity(tradevo.getQuantity());
		tradeTxn.setStock(tradevo.getStock());
		User tradeUser = new User();
		tradeUser.setUsername(tradevo.getUsername());
		tradeTxn.setUser(tradeUser);
		
		return tradeTxn;
	}
	
	public static TradeVO mapDBTradeToView(TradeTxn tradeTxn){
		TradeVO tradevo = new TradeVO();
		
		tradevo.setAction(tradeTxn.getAction());
		tradevo.setId(tradeTxn.getId());
		tradevo.setStock(tradeTxn.getStock());
		tradevo.setQuantity(tradeTxn.getQuantity());
		tradevo.setPrice(100);
		tradevo.setTradeValue(tradevo.getPrice()*tradevo.getQuantity());
		tradevo.setBrokerage(tradevo.getPrice()/100);
		tradevo.setTaxes(tradevo.getPrice()/100*4);
		tradevo.setExchange(tradeTxn.getExchange());
		tradevo.setContractNote(tradevo.getId() + 1000);
		tradevo.setOrderDate(tradeTxn.getCreationDate());
		
		return tradevo;
	}
	
	public static List<TradeVO> mapDBTradesToView(List<TradeTxn> dbTrades){
		List<TradeVO> orderBookTrades = new ArrayList<TradeVO>();
		for(TradeTxn dbTrade : dbTrades){
			TradeVO tradevo = mapDBTradeToView(dbTrade);
			orderBookTrades.add(tradevo);
		}
		return orderBookTrades;
	}
	
	public static List<TradeVO> getPositions(List<TradeTxn> dbTrades){
		Map<String,TradeVO> positions = new HashMap<String,TradeVO>(); 
		for(TradeTxn dbTrade : dbTrades){
			if(BUY.equals(dbTrade.getAction())){
				TradeVO tradevo = mapDBTradeToView(dbTrade);
				if(positions.containsKey(tradevo.getStock())){
					TradeVO trade = positions.get(tradevo.getStock());
					trade.setCount(trade.getCount() + dbTrade.getQuantity());
					positions.put(tradevo.getStock(), trade);
				}else{
					tradevo.setCount(tradevo.getQuantity());
					positions.put(tradevo.getStock(), tradevo);
				}
			}
		}
		List<TradeVO> orderBookTrades = new ArrayList<TradeVO>(positions.values());		
		return orderBookTrades;
	}

}
