package com.dana.lab3spring.service.repository;

import com.dana.lab3spring.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    @Override
    List<Organization> findAll();

    @Override
    Optional<Organization> findById(Long id);

    @Override
    boolean existsById(Long id);
}

// test class without db connection
//@Component
//public class OrganizationRepository {
//
//    public OrganizationRepository() {}
//
//    public List<Organization> findAll() {
//        return Collections.emptyList();
//    }
//
//    public Optional<Organization> findById(Long id) {
//        return Optional.empty();
//    }
//
//    public boolean existsById(Long id) {
//        return false;
//    }
//
//    public Organization save(Object value) {
//        return null;
//    }
//
//    public void deleteById(Long id) {}
//}
