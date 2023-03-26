package com.book.reserve.repository;

import com.book.reserve.model.BasicModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicRepository extends JpaRepository<BasicModel,Long> {
}
