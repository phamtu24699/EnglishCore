package com.english.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;


@Data
@Builder
public class WordDTO {

    private  String name;
    private  String Code;
    private Timestamp date;
}
