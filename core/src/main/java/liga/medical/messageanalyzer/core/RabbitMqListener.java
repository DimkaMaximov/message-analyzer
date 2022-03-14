package liga.medical.messageanalyzer.core;

import liga.medical.DeviceIdentificationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
public class RabbitMqListener {

    Logger logger = LoggerFactory.getLogger(RabbitMqListener.class);

    @RabbitListener(queues = "medical")
    public void processQueue(DeviceIdentificationDto deviceIdentificationDto){
        logger.info("Received from queue [medical]: " +"\n" + deviceIdentificationDto.toString());
    }
}
