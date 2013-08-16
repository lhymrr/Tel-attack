package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 挂号网
 */
public class GuaHaoWang extends HeartBeanAbstrace {
	String baseUrl = "http://www.guahao.com/user/json/existloginid/" + Contances.SHUT_MOBILE_NUM;
	@Override
	public void takeAim() {
		
		if (canWeShut()) {
			Bundle params = new Bundle();
			params.putString("_", String.valueOf(System.currentTimeMillis()));
			shutGet(baseUrl, params);
		}
		
	}

}
