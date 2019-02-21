package com.oracle.springjpa.SpringJpaExample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<UserRecord, Integer>{

}
