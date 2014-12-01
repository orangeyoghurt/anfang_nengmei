package com.sanss.msganalysis;

import java.util.HashMap;
import java.util.List;

public class NengmeiMsgHandler extends AMsgHandler {

	private HashMap<String,RawMsg> collectors=new HashMap<String,RawMsg>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			RawMsg rm=this.msgs.poll();
			
			if(collectors.containsKey(rm.getIdentifier()))
			{
				RawMsg buf=collectors.get(rm.getIdentifier());
			
			}
		}
		
	}

	@Override
	public void handleMsg(RawMsg msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	
}
