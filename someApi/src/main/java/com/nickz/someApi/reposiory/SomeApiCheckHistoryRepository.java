package com.nickz.someApi.reposiory;

import com.nickz.someApi.entity.SomeApiCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeApiCheckHistoryRepository
        extends JpaRepository<SomeApiCheckHistory, Integer> {
}
