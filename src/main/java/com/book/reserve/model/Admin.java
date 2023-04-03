package com.book.reserve.model;

import java.time.LocalDateTime;

import com.book.reserve.util.enumCode.YnCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tb_admin")
@Entity
public class Admin extends CommonBaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "login_id", nullable = false)
	private String loginId;

	@Column(name = "enc_password", nullable = false)
	private String encPassword;

	@Column(name = "access_token")
	private String accessToken;

	@Column(name = "refresh_token")
	private String refreshToken;

	@Column(name = "refresh_token_expired_at")
	private LocalDateTime refreshTokenExpiredAt;

	@Enumerated(EnumType.STRING)
	@Column(name = "use_yn", nullable = false)
	private YnCode useYn;

}
