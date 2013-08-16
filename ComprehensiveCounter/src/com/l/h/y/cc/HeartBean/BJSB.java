package com.l.h.y.cc.HeartBean;

import com.l.h.y.cc.Contances.Contances;
import com.l.h.y.cc.Http.Bundle;

public class BJSB extends HeartBeanAbstrace {

	@Override
	public void takeAim() {
		Bundle params = new Bundle();
		params.putString("sYear", "2013");
		params.putString("printType", "img");
		params.putString("button", "查 询");
		
		
		shutPost("http://www.bjld.gov.cn/csibiz/indinfo/equities/ind/ind5InsurancePolicySearchAction!insuranceListSearch", params);		
	}

}
