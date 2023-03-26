package com.book.reserve.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tb_user")
@Entity
public class User extends CommonBaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "login_id")
	private String loginId;

	private String name;

	private String email;

	@Column(name = "enc_password")
	private String encPassword;

}
