
package com.wireandwheel.demonstrations.ws.model;

import java.util.List;

public class USD{
   	private String code;
   	private String description;
   	private String rate;
   	private Number rate_float;
   	private String symbol;

 	public String getCode(){
		return this.code;
	}
	public void setCode(String code){
		this.code = code;
	}
 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public String getRate(){
		return this.rate;
	}
	public void setRate(String rate){
		this.rate = rate;
	}
 	public Number getRate_float(){
		return this.rate_float;
	}
	public void setRate_float(Number rate_float){
		this.rate_float = rate_float;
	}
 	public String getSymbol(){
		return this.symbol;
	}
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
}
