package com.dana.lab3spring.service.repository;

import com.dana.lab3spring.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

@Component
public interface WorkerRepository extends JpaRepository<Worker, Long> {
    @Override
    List<Worker> findAll();

    @Override
    Optional<Worker> findById(Long id);

    @Override
    <S extends Worker> S save(S s);

    @Override
    void delete(Worker worker);

    Optional<Worker> findTopByOrderBySalary();

    int countAllBySalary(Double salary);

    List<Worker> findAllByNameStartsWith(String prefix);
}

// test class without db connection
//@Component
//public class WorkerRepository {
//    public WorkerRepository() {}
//
//    public List<Worker> findAll() {
//        return emptyList();
//    }
//
//
//    public List<Worker> findAll(Object value) {
//        return emptyList();
//    }
//
//    public Optional<Worker> findById(Long id) {
//        return Optional.empty();
//    }
//
//    public Worker save(Object value) {
//        return null;
//    }
//
//    public void delete(Worker worker) {}
//
//    public void deleteById(Long id) {}
//
//    public Optional<Worker> findTopByOrderBySalary() {
//        return Optional.empty();
//    }
//
//    public int countAllBySalary(Double salary){
//        return 0;
//    }
//
//    public List<Worker> findAllByNameStartsWith(String prefix) {
//        return emptyList();
//    }
//
//    public boolean existsById(Long id) {
//        return false;
//    }
//}
