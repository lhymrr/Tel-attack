package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 优购
 */
public class YouGou extends HeartBeanAbstrace {

	private String baseUrl = "http://www.yougou.com/yitianmall/usercenter/registerMobile/getPhoneCode.sc";
	@Override
	public void takeAim() {

		if (canWeShut()) {
			
			Bundle params = new Bundle();
			params.putString("phone", Contances.SHUT_MOBILE_NUM);
			params.putString("codes", "checkCode");
			
			shutPost(baseUrl, params);
		}
	}

}
