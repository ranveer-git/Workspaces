package bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse implements Serializable
{
	List<String> messages;
	List<Result> resultLst;
	
	public List<String> getMessages() {
		return messages;
	}
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public List<Result> getResultLst() {
		return resultLst;
	}
	
	public void setResultLst(List<Result> resultLst) {
		this.resultLst = resultLst;
	}
	
	
}
