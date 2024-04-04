package com.evidencia.api_2.Repository;

     import com.evidencia.api_2.Entity.Local;
     import org.springframework.data.jpa.repository.JpaRepository;
     import org.springframework.stereotype.Repository;

     @Repository
     public interface LocalRepository extends JpaRepository<Local, Long> {
     }