package com.igate.tradingsimulator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.igate.tradingsimulator.dao.TradeDAO;
import com.igate.tradingsimulator.domain.TradeTxn;

@Transactional
public class TradeDAOImpl extends BaseDAO implements TradeDAO{

	@Override
	public TradeTxn saveTrade(TradeTxn tradeTxn) {
		getSession().save(tradeTxn);
		return tradeTxn;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TradeTxn> getTradesForUser(int userId, String status) {
		Criteria criteria = getSession().createCriteria(TradeTxn.class);
		criteria.createAlias("user", "u");
		criteria.add(Restrictions.eq("u.id", userId));
		if(status != null){
			criteria.add(Restrictions.eq("executionStatus", status));
		}
		return criteria.list();
	}

	@Override
	public void getMatchingTrades() {
		String hql = "From TradeTxn t1 , TradeTxn t2 where t1.quantity = t2.quantity "
				+ "and t1.action <> t2.action and t1.user.id <> t2.user.id "
				+ "and t1.stock = t2.stock and t1.executionStatus = t2.executionStatus "
				+ "and t1.executionStatus = 'N'";
		Query query = getSession().createQuery(hql);
		List<Object[]> results = query.list();
		for(int i=0;i<results.size();i++){
			Object[] result = results.get(i);
			for(int j=0;j<result.length;j++){
				TradeTxn ttx = (TradeTxn)result[j];
				ttx.setExecutionStatus("Y");
				getSession().saveOrUpdate(ttx);
			}
		}
	}

}
