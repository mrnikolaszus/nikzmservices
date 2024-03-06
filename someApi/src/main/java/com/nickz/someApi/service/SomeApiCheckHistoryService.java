package com.nickz.someApi.service;

import com.nickz.someApi.entity.SomeApiCheckHistory;
import com.nickz.someApi.reposiory.SomeApiCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class SomeApiCheckHistoryService {

    private final SomeApiCheckHistoryRepository someApiCheckHistoryRepository;

    public boolean isSomeApiCheckEx(Integer customerId){
        someApiCheckHistoryRepository.save(
                SomeApiCheckHistory.builder()
                        .customerId(customerId)
                        .isSomApiEx(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
