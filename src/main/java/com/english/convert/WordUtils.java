package com.english.convert;

import com.english.dto.WordDTO;
import com.english.entity.VocabularyEntity;
import org.springframework.stereotype.Component;

@Component
public class WordUtils {
    public WordDTO dto(VocabularyEntity entity) {
        WordDTO wordDTO = WordDTO.builder()
                .Code(entity.getCode())
                .date(entity.getDate())
                .name(entity.getName()).build();
        return wordDTO;
    }

    public VocabularyEntity entity(WordDTO wordDTO) {
        VocabularyEntity wordEntity = VocabularyEntity.builder().
                Code(wordDTO.getCode()).
                name(wordDTO.getName()).
                date(wordDTO.getDate()).
                build();
        return wordEntity;
    }
}
