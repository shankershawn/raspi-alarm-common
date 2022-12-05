package com.shankarsan.raspialarm.common.reactor.serialization;

import org.apache.kafka.common.serialization.Serializer;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shankarsan.raspialarm.common.dto.KafkaPayload;
import com.shankarsan.raspialarm.common.dto.PayloadDTO;

@Component(value = "messageSerializerReactor")
public class MessageSerializer implements Serializer<KafkaPayload<? extends PayloadDTO>> {
	
	private final ObjectMapper mapper = new ObjectMapper();

	public MessageSerializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] serialize(String topic, KafkaPayload<? extends PayloadDTO> payload) {
		if(null == payload) {
			return null;
		}
		try {
			return mapper.writeValueAsBytes(payload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
