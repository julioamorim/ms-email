package io.github.julioamorim.msemail.adapters.outbound.persistence;

import io.github.julioamorim.msemail.application.entities.EmailModel;
import io.github.julioamorim.msemail.application.ports.EmailRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@Primary
public class PostgresEmailRepository implements EmailRepository {

    private final SpringDataPostgresEmailRepository emailRepository;

    public PostgresEmailRepository(final SpringDataPostgresEmailRepository orderRepository) {
        this.emailRepository = orderRepository;
    }

    @Override
    public EmailModel save(EmailModel emailModel) {
        return emailRepository.save(emailModel);
    }

    @Override
    public Page<EmailModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<EmailModel> findById(UUID emailId) {
        return Optional.empty();
    }
}
