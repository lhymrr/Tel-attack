package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 中华机械网
 */
public class ZhongHuaJiXieWang extends HeartBeanAbstrace {
	String baseUrl = "http://china.machine365.com/dataaccess/SendMobileMes.aspx";

	@Override
	public void takeAim() {

		if (canWeShut()) {
			Bundle pamars = new Bundle();
			pamars.putString("Mobile", Contances.SHUT_MOBILE_NUM);
			shutPost(baseUrl, pamars);
		}
	}

}
