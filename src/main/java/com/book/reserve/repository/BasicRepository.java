package com.book.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.reserve.model.BasicModel;

public interface BasicRepository extends JpaRepository<BasicModel, Long> {
}
