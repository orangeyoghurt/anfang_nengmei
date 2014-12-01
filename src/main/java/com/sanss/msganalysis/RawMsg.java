package com.sanss.msganalysis;

public class RawMsg {
	private String Identifier;
	private byte[] buf=new byte[1024];
	public byte[] getBuf() {
		return buf;
	}
	private int bufuse;
	
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}
	
	public void setBuf(byte[] input,int length) {
		System.arraycopy(input, 0, buf, 0, length);
		bufuse=length;
	}
	
	public int append(RawMsg msg)
	{
		if(this.bufuse+msg.bufuse>buf.length)
		{
			byte[] nbyte=new byte[bufuse+msg.bufuse+1024];		
			System.arraycopy(buf, 0,  nbyte,0, bufuse);
			buf=nbyte;			
		}
		System.arraycopy(msg.getBuf(), 0, this.buf, this.bufuse, msg.getBufuse());
		this.bufuse=bufuse+msg.bufuse;
		return 0;
	}
	public int getBufuse() {
		return bufuse;
	}
	public void setBufuse(int bufuse) {
		this.bufuse = bufuse;
	}
	
	
}
