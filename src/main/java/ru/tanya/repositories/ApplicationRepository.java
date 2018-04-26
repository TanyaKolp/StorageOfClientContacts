package ru.tanya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tanya.entities.Application;
import ru.tanya.entities.Contact;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    Application findTopByContactOrderByCreatedDesc(Contact contact);
}
