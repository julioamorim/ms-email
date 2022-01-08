package io.github.julioamorim.msemail.adapters.outbound.persistence;

import io.github.julioamorim.msemail.application.entities.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataPostgresEmailRepository extends JpaRepository<EmailModel, UUID> {
}
