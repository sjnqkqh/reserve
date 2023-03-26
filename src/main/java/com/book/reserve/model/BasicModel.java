package com.book.reserve.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "tb_model")
@NoArgsConstructor
public class BasicModel extends CommonBaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Builder
    public BasicModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
