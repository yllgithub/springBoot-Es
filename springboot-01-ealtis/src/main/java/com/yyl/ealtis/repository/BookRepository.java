package com.yyl.ealtis.repository;

import com.yyl.ealtis.VO.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface BookRepository
        extends ElasticsearchRepository<Book, Integer> {
    List<Book> findBookByBookContentLike(String content);
}
