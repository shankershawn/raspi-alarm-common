package com.shankarsan.raspialarm.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {
	
	@JsonProperty private int pulseCount;
	@JsonProperty private int pulseMillis;
	@JsonProperty private int intervalMillis;
	public int getPulseCount() {
		return pulseCount;
	}
	public void setPulseCount(int pulseCount) {
		this.pulseCount = pulseCount;
	}
	public int getPulseMillis() {
		return pulseMillis;
	}
	public void setPulseMillis(int pulseMillis) {
		this.pulseMillis = pulseMillis;
	}
	public int getIntervalMillis() {
		return intervalMillis;
	}
	public void setIntervalMillis(int intervalMillis) {
		this.intervalMillis = intervalMillis;
	}

}
