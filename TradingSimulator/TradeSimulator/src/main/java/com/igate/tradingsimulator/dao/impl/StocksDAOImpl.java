package com.igate.tradingsimulator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.transaction.annotation.Transactional;

import com.igate.tradingsimulator.dao.StocksDAO;
import com.igate.tradingsimulator.domain.Stocks;

@Transactional
public class StocksDAOImpl extends BaseDAO implements StocksDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Stocks> getAllStocks() {
		Criteria criteria = getSession().createCriteria(Stocks.class);
		return (List<Stocks>) criteria.list();
	}

}
