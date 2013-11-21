package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

/**
 * @author liuheyuan
 * 
 * 中国移动
 */
public class CMCC extends HeartBeanAbstrace {
	private final String baseUrl = "https://bj.ac.10086.cn/ac/tempPwdSend?mobile=" + Contances.SHUT_MOBILE_NUM;

	@Override
	public void takeAim() {

		if(canWeShut()){
			shutGet(baseUrl, new Bundle());
		}
	}

}


/***
 * 2013-11-19 通过
 * 
 * */