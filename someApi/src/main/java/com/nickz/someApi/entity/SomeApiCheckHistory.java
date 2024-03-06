package com.nickz.someApi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SomeApiCheckHistory {

    @Id
    @SequenceGenerator(
            name = "someApi_id_sequence",
            sequenceName = "someApi_id_sequence")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "someApi_id_sequence"
    )
    private Integer id;
    private Integer customerId;
    private Boolean isSomApiEx;
    private LocalDateTime createdAt;

}
