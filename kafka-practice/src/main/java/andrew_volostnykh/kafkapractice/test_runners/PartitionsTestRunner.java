package andrew_volostnykh.kafkapractice.test_runners;

import andrew_volostnykh.kafkapractice.KafkaTopicsDeclaration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PartitionsTestRunner
	implements CommandLineRunner {

	private final KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void run(String... args) {
		String topic = KafkaTopicsDeclaration.PARTITIONS_PRACTICE_TOPIC;

		for (int i = 1; i <= 9; i++) {
			String key = switch (i % 3) {
				case 0 -> "A";
				case 1 -> "B";
				default -> "C";
			};
			kafkaTemplate.send(topic, key, "msg-" + i);
		}

		kafkaTemplate.flush();
		System.out.println("Messages sent to topic: " + topic);
	}
}
