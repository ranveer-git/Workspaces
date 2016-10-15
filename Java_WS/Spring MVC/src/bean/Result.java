package bean;

import java.io.Serializable;


public class Result implements Serializable
{
	String name;
	String alpha2_code;
	String alpha3_code;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAlpha2_code() {
		return alpha2_code;
	}
	
	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}
	
	public String getAlpha3_code() {
		return alpha3_code;
	}
	
	public void setAlpha3_code(String alpha3_code) {
		this.alpha3_code = alpha3_code;
	}
	
	
	@Override
	public String toString() {
		return "{ name: "+this.name+", alpha2_code: "+this.alpha2_code+", alpha3_code: "+this.alpha3_code+"}";
	}
	

}