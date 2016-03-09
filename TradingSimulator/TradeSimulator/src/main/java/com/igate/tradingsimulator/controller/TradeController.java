package com.igate.tradingsimulator.controller;

import static com.igate.tradingsimulator.util.AppConstants.success;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igate.tradingsimulator.domain.TradeTxn;
import com.igate.tradingsimulator.mappingutils.TradeMapping;
import com.igate.tradingsimulator.service.TradeService;
import com.igate.tradingsimulator.service.UserService;
import com.igate.tradingsimulator.vo.TradeVO;

@RestController
public class TradeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TradeService tradeService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public TradeService getTradeService() {
		return tradeService;
	}

	public void setTradeService(TradeService tradeService) {
		this.tradeService = tradeService;
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/submitTrade" , method = RequestMethod.POST)
	public TradeVO submitTrade(@RequestBody TradeVO tradevo){
		TradeTxn tradeTxn = TradeMapping.mapTradeData(tradevo); 
		tradeTxn = getTradeService().saveTrade(tradeTxn);
		TradeVO confirmTrade = TradeMapping.mapDBTradeToView(tradeTxn); 
		confirmTrade.setStatus(success);
		return confirmTrade;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/listOrderBook" , method = RequestMethod.POST)
	public List<TradeVO> listOrderBookTrades(@RequestBody String userName){
		List<TradeTxn> orderBookTradesFromDB = getTradeService().getAllOrderBookTrades(userName);
		return TradeMapping.mapDBTradesToView(orderBookTradesFromDB);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/listTradeBook" , method = RequestMethod.POST)
	public List<TradeVO> listTradeBookTrades(@RequestBody String userName){
		List<TradeTxn> tradeBookTradesFromDB = getTradeService().getAllTradeBookTrades(userName);
		return TradeMapping.mapDBTradesToView(tradeBookTradesFromDB);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/getPositions" , method = RequestMethod.POST)
	public List<TradeVO> getUserPositions(@RequestBody String userName){
		List<TradeTxn> tradeBookTradesFromDB = getTradeService().getAllTradeBookTrades(userName);
		return TradeMapping.getPositions(tradeBookTradesFromDB);
	}	
}
