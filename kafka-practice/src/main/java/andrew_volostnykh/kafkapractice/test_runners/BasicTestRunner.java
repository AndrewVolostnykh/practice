package andrew_volostnykh.kafkapractice.test_runners;

import andrew_volostnykh.kafkapractice.KafkaTopicsDeclaration;
import andrew_volostnykh.kafkapractice.basic.BasicMessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BasicTestRunner
	implements CommandLineRunner {

	private final BasicMessageProducer producer;

	@Override
	public void run(String... args) {
		producer.send(
			KafkaTopicsDeclaration.BASIC_PRACTICE_TOPIC,
			"Basic Practice Message"
		);
	}
}
