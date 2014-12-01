package com.sanss.msganalysis;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

import com.sanss.alarmPreProc.info.AlarmInfo;

public abstract class AMsgHandler implements Runnable {

	protected BlockingQueue<RawMsg> msgs;
	protected BlockingQueue<AlarmInfo> alarms;
	
	public BlockingQueue<AlarmInfo> getAlarms() {
		return alarms;
	}

	public void setAlarms(BlockingQueue<AlarmInfo> alarms) {
		this.alarms = alarms;
	}

	public BlockingQueue<RawMsg> getMsgs() {
		return msgs;
	}

	public void setMsgs(BlockingQueue<RawMsg> msgs) {
		this.msgs = msgs;
	}
	
	public abstract void handleMsg(RawMsg msg);
	
	public abstract void init();
	
}
