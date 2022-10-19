package com.github.sullis.dropwizard.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Message {
	private String text;
	private Date timestamp = new Date();

	public Message() {
		// Jackson deserialization
	}

	public Message(String text, Date timestamp) {
		this.text = text;
		this.timestamp = timestamp;
	}

	@JsonProperty
	public Date getTimestamp() {
		return timestamp;
	}

	@JsonProperty
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty
	public String getText() {
		return text;
	}

	@JsonProperty
	public void setText(String s) {
		text = s;
	}

}
