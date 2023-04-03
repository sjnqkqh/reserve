DROP TABLE IF EXISTS TB_USER_LIBRARY_MAPPING;
DROP TABLE IF EXISTS TB_BOOK_RESERVATION;
DROP TABLE IF EXISTS TB_LIBRARY_BOOK_CNT;
DROP TABLE IF EXISTS TB_LIBRARIAN;
DROP TABLE IF EXISTS TB_USER;
DROP TABLE IF EXISTS TB_LIBRARY;
DROP TABLE IF EXISTS TB_BOOK;
DROP TABLE IF EXISTS TB_ADMIN;


#  도서관 메타 테이블
CREATE TABLE TB_LIBRARY
(
    id           BIGINT UNSIGNED AUTO_INCREMENT,
    library_name VARCHAR(255)               NOT NULL,
    address      VARCHAR(255)               NOT NULL,
    phone_number VARCHAR(255) DEFAULT NULL,
    use_yn       CHAR(1)      DEFAULT 'Y',
    created_at   DATETIME     DEFAULT NOW() NOT NULL,
    updated_at   DATETIME     DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id)
);

# 유저 메타 테이블
CREATE TABLE TB_USER
(
    id                       BIGINT UNSIGNED            NOT NULL AUTO_INCREMENT,
    login_id                 VARCHAR(255)               NOT NULL,
    enc_password             VARCHAR(255)               NOT NULL,
    user_name                VARCHAR(255)               NOT NULL,
    email                    VARCHAR(255)               NOT NULL,
    library_id               BIGINT                     NOT NULL,
    access_token             VARCHAR(255) DEFAULT NULL,
    refresh_token            VARCHAR(255) DEFAULT NULL,
    refresh_token_expired_at DATETIME     DEFAULT NULL,
    use_yn                   CHAR(1)                    NOT NULL DEFAULT 'Y',
    created_at               DATETIME     DEFAULT NOW() NOT NULL,
    updated_at               DATETIME     DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id),
    KEY fk_user_to_library (library_id)
);

# 회원별 도서관 매핑 테이블
CREATE TABLE TB_USER_LIBRARY_MAPPING
(
    id         BIGINT                 NOT NULL AUTO_INCREMENT,
    user_id    BIGINT UNSIGNED        NOT NULL,
    library_id BIGINT UNSIGNED        NOT NULL,
    created_at DATETIME DEFAULT NOW() NOT NULL,
    updated_at DATETIME DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_library_mapping FOREIGN KEY (library_id) REFERENCES tb_library (id),
    CONSTRAINT fk_user_mapping FOREIGN KEY (user_id) REFERENCES tb_user (id)
);

# 사서 계정 메타 테이블
CREATE TABLE TB_LIBRARIAN
(
    id                       BIGINT UNSIGNED            NOT NULL AUTO_INCREMENT,
    login_id                 VARCHAR(255)               NOT NULL,
    enc_password             VARCHAR(255)               NOT NULL,
    user_name                VARCHAR(255)               NOT NULL,
    email                    VARCHAR(255)               NOT NULL,
    library_id               BIGINT UNSIGNED            NOT NULL,
    access_token             VARCHAR(255) DEFAULT NULL,
    refresh_token            VARCHAR(255) DEFAULT NULL,
    refresh_token_expired_at DATETIME     DEFAULT NULL,
    use_yn                   CHAR(1)                    NOT NULL DEFAULT 'Y',
    created_at               DATETIME     DEFAULT NOW() NOT NULL,
    updated_at               DATETIME     DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY fk_user_to_library (library_id) REFERENCES TB_LIBRARY (ID)
);

# 도서 메타 정보 테이블
CREATE TABLE TB_BOOK
(
    id               BIGINT UNSIGNED        NOT NULL AUTO_INCREMENT,
    title            VARCHAR(255)           NOT NULL,
    author           VARCHAR(255)           NOT NULL,
    publisher_name   VARCHAR(255)           NOT NULL,
    isbn             VARCHAR(255)           NOT NULL,
    book_information TEXT                   NOT NULL,
    book_cover_image VARCHAR(255)           NOT NULL,
    use_yn           CHAR(1)                NOT NULL DEFAULT 'Y',
    created_at       DATETIME DEFAULT NOW() NOT NULL,
    updated_at       DATETIME DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id)
);

# 도서 소장 권수 테이블
CREATE TABLE TB_LIBRARY_BOOK_CNT
(
    id         BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    library_id BIGINT UNSIGNED NOT NULL,
    book_id    BIGINT UNSIGNED NOT NULL,
    book_cnt   INT             NOT NULL DEFAULT 0,
    use_yn     CHAR(1)         NOT NULL DEFAULT 'Y',
    created_at DATETIME                 DEFAULT NOW() NOT NULL,
    updated_at DATETIME                 DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY fk_library_mapping (library_id) REFERENCES TB_LIBRARY (id),
    FOREIGN KEY fk_book_mapping (book_id) REFERENCES TB_BOOK (id)
);

# 도서 대출 예약 테이블
CREATE TABLE TB_BOOK_RESERVATION
(
    id             BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    library_id     BIGINT UNSIGNED NOT NULL,
    book_id        BIGINT UNSIGNED NOT NULL,
    expired_at     DATETIME        NOT NULL,
    expired_yn     CHAR(1)         NOT NULL DEFAULT 'N',
    expired_reason VARCHAR(255)             DEFAULT NULL,
    use_yn         CHAR(1)         NOT NULL DEFAULT 'Y',
    created_at     DATETIME                 DEFAULT NOW() NOT NULL,
    updated_at     DATETIME                 DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY fk_library_mapping (library_id) REFERENCES TB_LIBRARY (id),
    FOREIGN KEY fk_book_mapping (book_id) REFERENCES TB_BOOK (id)
);

# 어드민 계정 테이블
CREATE TABLE TB_ADMIN
(
    id                       BIGINT UNSIGNED            NOT NULL AUTO_INCREMENT,
    login_id                 VARCHAR(255)               NOT NULL,
    enc_password             VARCHAR(255)               NOT NULL,
    access_token             VARCHAR(255) DEFAULT NULL,
    refresh_token            VARCHAR(255) DEFAULT NULL,
    refresh_token_expired_at DATETIME     DEFAULT NULL,
    use_yn                   CHAR(1)                    NOT NULL DEFAULT 'Y',
    created_at               DATETIME     DEFAULT NOW() NOT NULL,
    updated_at               DATETIME     DEFAULT NOW() NOT NULL,
    PRIMARY KEY (id)
);