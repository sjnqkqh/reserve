package com.book.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.reserve.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
