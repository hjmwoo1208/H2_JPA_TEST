package com.example.demo.repository;

import com.example.demo.dto.EMP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<EMP,Integer> {
    public Optional<EMP> findEMPByEMPNO(int EMPNO);
}
