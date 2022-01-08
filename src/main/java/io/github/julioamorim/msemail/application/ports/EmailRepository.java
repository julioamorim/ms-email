package io.github.julioamorim.msemail.application.ports;

import io.github.julioamorim.msemail.application.entities.EmailModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface EmailRepository {

    EmailModel save(EmailModel emailModel);

    Page<EmailModel> findAll(Pageable pageable);

    Optional<EmailModel> findById(UUID emailId);
}
