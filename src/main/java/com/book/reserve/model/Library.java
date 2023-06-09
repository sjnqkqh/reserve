package com.book.reserve.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import com.book.reserve.util.enumCode.YnCode;

@Entity
@Table(name = "TB_LIBRARY")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "library_name", nullable = false)
	private String libraryName;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "use_yn", nullable = false)
	@Enumerated(EnumType.STRING)
	private YnCode useYn;
}
