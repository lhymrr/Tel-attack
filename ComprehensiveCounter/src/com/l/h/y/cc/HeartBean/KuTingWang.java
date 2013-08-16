package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 酷听网
 */
public class KuTingWang extends HeartBeanAbstrace {

	@Override
	public void takeAim() {
		if (canWeShut()) {
			shutGet("http://sign.kting.cn/register/getphoneverify/phone/" + Contances.SHUT_MOBILE_NUM, new Bundle());
		}
	}

}
