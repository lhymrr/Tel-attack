package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

public class Vancl extends HeartBeanAbstrace {
	private String baseUrl = "https://login.vancl.com/login/BeginRegister.ashx";
//	?action=sendmobilecode&key=15201009625&validatecode=&_=1368249397167

	@Override
	public void takeAim() {

		
		if (canWeShut()) {
			Bundle params = new Bundle();
			params.putString("action", "sendmobilecode");
			params.putString("key", Contances.SHUT_MOBILE_NUM);
			params.putString("validatecode", "");
			params.putString("_", String.valueOf(System.currentTimeMillis()));
			
			shutGet(baseUrl, params);
		}
	}

}
