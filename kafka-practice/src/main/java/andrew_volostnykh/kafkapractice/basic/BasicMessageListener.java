package andrew_volostnykh.kafkapractice.basic;

import andrew_volostnykh.kafkapractice.KafkaTopicsDeclaration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BasicMessageListener {

	@KafkaListener(
		topics = KafkaTopicsDeclaration.BASIC_PRACTICE_TOPIC,
		groupId = "basic-training-group"
	)
	public void listen(String message) {
		System.out.println("Received: " + message);
	}
}
