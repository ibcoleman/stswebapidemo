
package com.wireandwheel.demonstrations.ws.model;

import java.util.List;


public class BitcoinPrice{
   	private Bpi bpi;
   	private String disclaimer;
   	private Exchanges exchanges;
   	private Time time;

 	public Bpi getBpi(){
		return this.bpi;
	}
	public void setBpi(Bpi bpi){
		this.bpi = bpi;
	}
 	public String getDisclaimer(){
		return this.disclaimer;
	}
	public void setDisclaimer(String disclaimer){
		this.disclaimer = disclaimer;
	}
 	public Exchanges getExchanges(){
		return this.exchanges;
	}
	public void setExchanges(Exchanges exchanges){
		this.exchanges = exchanges;
	}
 	public Time getTime(){
		return this.time;
	}
	public void setTime(Time time){
		this.time = time;
	}
}
