package com.igate.tradingsimulator.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TradeSimListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContextListener destroyed");
	}

	// Run this before web application is started
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContextListener started");
		for(int i=0;i<10;i++)System.out.println(i);
	}
}