package com.github.Pogryziony.Librasys.Repositories;

import com.github.Pogryziony.Librasys.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
