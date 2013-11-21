package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

public class CNTV extends HeartBeanAbstrace {

	@Override
	public void takeAim() {
		super.updateTimes = 120 * 1000;

		if (canWeShut()) {
			
//			msisdn:15201009625
//			verfiCodeType:1
//			method:getRequestVerifiCode
//			间隔120S
			
			Bundle params = new Bundle();
			params.putString("msisdn", Contances.SHUT_MOBILE_NUM);
			params.putString("verfiCodeType", "1");
			params.putString("method", "getRequestVerifiCode");
			shutPost("http://passport.cntv.cn/mobileRegister.do", params);
		}
	}

}


/**
 * 2013-11-19 通过
 * 有IP检测，大概发送10次后ip锁定，锁定24小时
 * */