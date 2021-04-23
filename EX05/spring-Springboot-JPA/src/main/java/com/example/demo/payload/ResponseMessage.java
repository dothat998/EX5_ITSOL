package com.example.demo.payload;

import com.example.demo.Entity.MatHang;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ResponseMessage {
	private String message;
	private MatHang matHang;
	public ResponseMessage(String message) {
		this.message = message;
	}

	 public ResponseMessage(){}
	public ResponseMessage(String message, MatHang matHang) {
		this.message = message;
		this.matHang = matHang;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MatHang getMatHang() {
		return matHang;
	}

	public void setMatHang(MatHang matHang) {
		this.matHang = matHang;
	}
}
