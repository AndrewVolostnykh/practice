package andrew_volostnykh.kafkapractice.groups;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GroupMessageProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public void send(String topic, String message) {
		kafkaTemplate.send(topic, message);
		System.err.println("Group Producer Sent: " + message);
	}
}
