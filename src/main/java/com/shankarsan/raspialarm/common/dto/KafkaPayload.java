package com.shankarsan.raspialarm.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaPayload<T extends PayloadDTO> {

	T payload;
}
