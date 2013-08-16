package com.l.h.y.cc.Heart;

import com.l.h.y.cc.HeartBean.HeartBeanAbstrace;


public class HeartThread {

	public static final long HEART_SPEED = 1000 * 10;
	
	private static HeartBeanAbstrace CMCC = new com.l.h.y.cc.HeartBean.CMCC();
	private static HeartBeanAbstrace CNTV = new com.l.h.y.cc.HeartBean.CNTV();
	private static HeartBeanAbstrace GuaHaoWang = new com.l.h.y.cc.HeartBean.GuaHaoWang();
	private static HeartBeanAbstrace JD = new com.l.h.y.cc.HeartBean.JD();
	private static HeartBeanAbstrace KuTingWang = new com.l.h.y.cc.HeartBean.KuTingWang();
	private static HeartBeanAbstrace ShengDa = new com.l.h.y.cc.HeartBean.ShengDa();
	private static HeartBeanAbstrace Sina = new com.l.h.y.cc.HeartBean.Sina();
	private static HeartBeanAbstrace SJJY = new com.l.h.y.cc.HeartBean.SJJY();
	private static HeartBeanAbstrace Vancl = new com.l.h.y.cc.HeartBean.Vancl();
	private static HeartBeanAbstrace YouGou = new com.l.h.y.cc.HeartBean.YouGou();
	private static HeartBeanAbstrace ZhongHuaJiXieWang = new com.l.h.y.cc.HeartBean.ZhongHuaJiXieWang();
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 1000; i++){
			
			CMCC.takeAim();
			CNTV.takeAim();
			ShengDa.takeAim();
			JD.takeAim();
			KuTingWang.takeAim();
			
			GuaHaoWang.takeAim();
			Sina.takeAim();
			SJJY.takeAim();
			
			
			Vancl.takeAim();
			YouGou.takeAim();
			ZhongHuaJiXieWang.takeAim();
			
			try {
				Thread.currentThread().sleep(10 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}



