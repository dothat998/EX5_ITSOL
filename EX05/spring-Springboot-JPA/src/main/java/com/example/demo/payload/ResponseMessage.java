package com.example.demo.payload;

import com.example.demo.Entity.MatHangBO;

public class ResponseMessage {
	private String message;
	private MatHangBO matHangBO;
	public ResponseMessage(String message) {
		this.message = message;
	}

	 public ResponseMessage(){}
	public ResponseMessage(String message, MatHangBO matHangBO) {
		this.message = message;
		this.matHangBO = matHangBO;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MatHangBO getMatHang() {
		return matHangBO;
	}

	public void setMatHang(MatHangBO matHangBO) {
		this.matHangBO = matHangBO;
	}
}
