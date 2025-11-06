package andrew_volostnykh.kafkapractice.groups;

import andrew_volostnykh.kafkapractice.KafkaTopicsDeclaration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class GroupMessageConsumer {

	@KafkaListener(
		topics = KafkaTopicsDeclaration.GROUPS_PRACTICE_TOPIC,
		groupId = "group-training-1"
	)
	public void group1(String message) {
		System.err.println("Group 1 Received: " + message);
	}

	@KafkaListener(
		topics = KafkaTopicsDeclaration.GROUPS_PRACTICE_TOPIC,
		groupId = "group-training-2"
	)
	public void group2(String message) {
		System.out.println("Group 2 Received: " + message);
	}
}
