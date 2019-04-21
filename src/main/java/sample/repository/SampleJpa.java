package sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.model.Worker;

@Repository
public interface SampleJpa extends JpaRepository<Worker, String> {

}
