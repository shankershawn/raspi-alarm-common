package com.shankarsan.raspialarm.common.reactor.deserialization;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shankarsan.raspialarm.common.dto.KafkaPayload;
import com.shankarsan.raspialarm.common.dto.PayloadDTO;

@Component(value = "messageDeserializerReactor")
public class MessageDeserializer implements Deserializer<KafkaPayload<? extends PayloadDTO>> {
	
	private final ObjectMapper mapper = new ObjectMapper();

	public MessageDeserializer() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public KafkaPayload<? extends PayloadDTO> deserialize(String topic, byte[] data) {
		if(null == data) {
			return null;
		}
		try {
			return mapper.readValue(data, KafkaPayload.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
