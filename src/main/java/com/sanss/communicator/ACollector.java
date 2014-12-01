package com.sanss.communicator;

import java.util.concurrent.BlockingQueue;

public abstract class ACollector implements Runnable {
	protected BlockingQueue msgs;
	private String identifier;

	public BlockingQueue getMsgs() {
		return msgs;
	}

	public void setMsgs(BlockingQueue msgs) {
		this.msgs = msgs;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	

}
