package io.github.julioamorim.msemail.adapters.configuration;

import io.github.julioamorim.msemail.MsEmailApplication;
import io.github.julioamorim.msemail.application.ports.EmailRepository;
import io.github.julioamorim.msemail.application.services.EmailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
@ComponentScan(basePackageClasses = MsEmailApplication.class)
public class BeanConfiguration {

    @Bean
    EmailServiceImpl emailServiceImpl(EmailRepository emailRepository, JavaMailSender javaMailSender) {
        return new EmailServiceImpl(emailRepository, javaMailSender);
    }
}
