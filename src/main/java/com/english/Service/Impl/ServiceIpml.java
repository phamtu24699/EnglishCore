package com.english.Service.Impl;

import com.english.Service.WordService;
import com.english.convert.WordUtils;
import com.english.dto.WordDTO;
import com.english.entity.VocabularyEntity;
import com.english.repository.WordEnityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class ServiceIpml   implements WordService {
    @Autowired
    private WordEnityRepository wordEnityRepository;

    @Autowired
    private WordUtils wordUtils;

    @Override
    public WordDTO save(WordDTO wordDTO) {
        VocabularyEntity wordEntity = wordEnityRepository.save(wordUtils.entity(wordDTO));
        return wordUtils.dto(wordEntity);
    }

    @Override
    public WordDTO update(WordDTO wordDTO) {
        return null;
    }

    @Override
    public boolean delete(UUID[] t) {
        return false;
    }

    @Override
    public List<WordDTO> findAll() {
        return null;
    }
}
