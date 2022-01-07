package io.github.julioamorim.msemail.repositories;

import io.github.julioamorim.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
