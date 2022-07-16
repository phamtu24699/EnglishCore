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

@Table(name ="word")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="UUID")
    private UUID id;

    @Column(name = "Name")
    private  String name;

    @Column(name = "Code")
    private  String Code;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date")
    private Timestamp date;
}
