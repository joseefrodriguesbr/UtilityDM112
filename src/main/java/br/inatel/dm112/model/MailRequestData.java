package br.inatel.dm112.model;

public class MailRequestData {

	private int orderNumber;
	private String to;
	private byte[] content;
	private String message;

	public MailRequestData() {
	}

	public MailRequestData(int orderNumber, String to, byte[] content) {
		this.orderNumber = orderNumber;
		this.to = to;
		this.content = content;
	}
	
	public MailRequestData(int orderNumber, String to, String message)
	{
		super();
		this.orderNumber = orderNumber;
		this.to = to;
		this.message = message;
	}

	public int getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
	
	
	
	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	@Override
	public String toString() {
		return "MailData [orderNumber=" + orderNumber + ", to=" + to + "]";
	}

}
