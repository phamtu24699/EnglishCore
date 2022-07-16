package com.english.api;

import com.english.Service.WordService;
import com.english.dto.WordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home/v1")
public class Test {
    @Autowired
    WordService wordService;

    @PostMapping
    public ResponseEntity<WordDTO> save (@RequestBody WordDTO wordDTO){
        WordDTO dto = wordService.save(wordDTO);
        return  ResponseEntity.ok(dto);
    }

}
