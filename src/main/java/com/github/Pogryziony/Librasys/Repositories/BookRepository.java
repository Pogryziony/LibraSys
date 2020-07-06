package com.github.Pogryziony.Librasys.Repositories;

import com.github.Pogryziony.Librasys.Entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
