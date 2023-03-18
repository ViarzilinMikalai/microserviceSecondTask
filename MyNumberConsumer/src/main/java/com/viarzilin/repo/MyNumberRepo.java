package com.viarzilin.repo;

import com.viarzilin.domain.MyNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyNumberRepo extends JpaRepository<MyNumber, Long> {

}
