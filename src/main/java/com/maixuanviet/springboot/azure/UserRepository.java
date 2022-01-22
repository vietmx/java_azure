package com.maixuanviet.springboot.azure;

import org.springframework.data.repository.CrudRepository;

/**
 * @author VietMX
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
