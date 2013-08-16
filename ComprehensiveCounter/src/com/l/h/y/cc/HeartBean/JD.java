package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 
 * 京东
 */
public class JD extends HeartBeanAbstrace {
	
	/**
	 * 默认刷新时间
	 */

	@Override
	public void takeAim() {
		super.updateTimes = 120 * 1000;
		if (canWeShut()) {
			Bundle params = new Bundle();
			params.putString("mobile", Contances.SHUT_MOBILE_NUM);
			params.putString("r", String.valueOf(Math.random()));
			shutGet("https://passport.jd.com/emReg/mobileReg/sendMobileCode", params);
		}
	}

}
