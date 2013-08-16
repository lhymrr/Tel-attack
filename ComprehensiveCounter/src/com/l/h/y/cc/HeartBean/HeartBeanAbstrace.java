package com.l.h.y.cc.HeartBean;

import java.io.IOException;

import com.l.h.y.cc.Http.Bundle;
import com.l.h.y.cc.Http.HttpJavaHandler;

public abstract class HeartBeanAbstrace {

	/**
	 * 默认刷新时间
	 */
	public long updateTimes = 60 * 1000;

	private long oldTimes = 0;

	public abstract void takeAim();

	public boolean canWeShut() {

		long currentTime = System.currentTimeMillis();

		if (oldTimes + updateTimes <= currentTime) {
			oldTimes = currentTime;
			return true;
		}

		return false;
	}

	public void shutGet(String baseUrl, Bundle params) {
		try {
			HttpJavaHandler.doGet(baseUrl, params);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void shutPost(String baseUrl, Bundle params) {
		try {
			HttpJavaHandler.doPost(baseUrl, params);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
