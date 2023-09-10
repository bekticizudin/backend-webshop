package com.zavrsniprojekat.ZavrsniProjekat.Repo;

import com.zavrsniprojekat.ZavrsniProjekat.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {
}
