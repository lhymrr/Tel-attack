package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

public class Sina extends HeartBeanAbstrace {
	
	

	@Override
	public void takeAim() {
		super.updateTimes = 180 * 1000;

		if (canWeShut()) {
			Bundle params = new Bundle();
			params.putString("mobile", Contances.SHUT_MOBILE_NUM);
			shutPost("https://login.sina.com.cn/signup/message", params);
		}
	}

}
