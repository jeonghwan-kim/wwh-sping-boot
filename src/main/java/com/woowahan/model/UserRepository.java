package com.woowahan.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by woowahan on 2017. 5. 18..
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
