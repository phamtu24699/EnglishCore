package com.english.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@Table(name ="vocabulary")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VocabularyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name")
    private  String name;

    @Column(name = "Code")
    private  String Code;

    @Column(name = "Date")
    private Timestamp date;
}
