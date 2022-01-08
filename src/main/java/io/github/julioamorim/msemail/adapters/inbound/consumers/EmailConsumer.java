package io.github.julioamorim.msemail.adapters.inbound.consumers;

import io.github.julioamorim.msemail.adapters.inbound.dtos.EmailDto;
import io.github.julioamorim.msemail.application.entities.EmailModel;
import io.github.julioamorim.msemail.application.services.EmailServiceImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    private final EmailServiceImpl emailService;

    public EmailConsumer(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "ms.email")
    public void listen(@Payload EmailDto emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        System.out.println("Email Status: " + emailModel.getStatusEmail().toString());
    }
}
