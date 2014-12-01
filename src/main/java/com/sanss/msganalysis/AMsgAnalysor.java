package com.sanss.msganalysis;

import java.util.List;

public abstract class AMsgAnalysor {
	
	public abstract List analysis(byte[] buf,String identifier);

}
