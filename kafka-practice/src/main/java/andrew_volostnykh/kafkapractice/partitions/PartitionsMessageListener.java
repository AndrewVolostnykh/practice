package andrew_volostnykh.kafkapractice.partitions;

import andrew_volostnykh.kafkapractice.KafkaTopicsDeclaration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PartitionsMessageListener {

	@KafkaListener(
		topics = KafkaTopicsDeclaration.PARTITIONS_PRACTICE_TOPIC,
		groupId = "partitions-training",
		concurrency = "2"
	)
	public void receiver1(String message) {
		System.err.println("receiver1 Received: " + message);
	}

	@KafkaListener(
		topics = KafkaTopicsDeclaration.PARTITIONS_PRACTICE_TOPIC,
		groupId = "partitions-training",
		concurrency = "2"
	)
	public void receiver2(String message) {
		System.err.println("receiver2 Received: " + message);
	}
}
