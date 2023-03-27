package com.book.reserve.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "tb_user")
@Entity
public class User extends CommonBaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "login_id")
	private String loginId;

	@JoinColumn(name = "library_id")
	@ManyToOne(targetEntity = Library.class, fetch = FetchType.LAZY)
	private Library library;

	private String name;

	private String email;

	@Column(name = "enc_password")
	private String encPassword;

}
