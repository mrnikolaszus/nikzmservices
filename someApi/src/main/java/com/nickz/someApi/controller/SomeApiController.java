package com.nickz.someApi.controller;

import com.nickz.someApi.entity.SomeApiCheckResponse;
import com.nickz.someApi.service.SomeApiCheckHistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/check")
@AllArgsConstructor
@Slf4j
public class SomeApiController {

    private final SomeApiCheckHistoryService someApiCheckHistoryService;


    @GetMapping(path = "{customerId}")
    public SomeApiCheckResponse isSomApiEx(
            @PathVariable("customerId") Integer customerId){
        boolean isSomeApiCheckEx = someApiCheckHistoryService
                .isSomeApiCheckEx(customerId);

        log.info("SomeApiCheckEx some checking logic");

        return new SomeApiCheckResponse(isSomeApiCheckEx);

    }
}
