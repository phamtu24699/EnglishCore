package com.english.convert;

import com.english.dto.WordDTO;
import com.english.entity.WordEntity;
import org.springframework.stereotype.Component;

@Component
public class WordUtils {
    public WordDTO dto(WordEntity entity) {
        WordDTO wordDTO = WordDTO.builder()
                .Code(entity.getCode())
                .date(entity.getDate())
                .name(entity.getName()).build();
        return wordDTO;
    }

    public WordEntity entity(WordDTO wordDTO) {
        WordEntity wordEntity = WordEntity.builder().
                Code(wordDTO.getCode()).
                name(wordDTO.getName()).
                date(wordDTO.getDate()).
                build();
        return wordEntity;
    }
}
