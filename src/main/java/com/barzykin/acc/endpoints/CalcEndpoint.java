package com.barzykin.acc.endpoints;

import com.barzykin.acc.model.CalcResponse;
import com.barzykin.acc.services.ICalcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CalcEndpoint {

    private final ICalcService calcService;

    @GetMapping("/acc/calc/add")
    public Mono<CalcResponse> add(@RequestParam int a, @RequestParam int b) {
        return Mono.just(toResponse(calcService.add(a, b)));
    }

    @GetMapping("/acc/calc/sub")
    public Mono<CalcResponse> sub(@RequestParam int a, @RequestParam int b) {
        return Mono.just(toResponse(calcService.sub(a, b)));
    }

    @GetMapping("/acc/calc/mul")
    public Mono<CalcResponse> mul(@RequestParam int a, @RequestParam int b) {
        return Mono.just(toResponse(calcService.mul(a, b)));
    }

    @GetMapping("/acc/calc/div")
    public Mono<CalcResponse> div(@RequestParam int a, @RequestParam int b) {
        return Mono.just(toResponse(calcService.div(a, b)));
    }

    private static CalcResponse toResponse(int value) {
        return CalcResponse.builder()
                .result(String.valueOf(value))
                .build();
    }
}
