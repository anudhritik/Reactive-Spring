package com.learnreactivespring.fluxandmonoplayground;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import javax.swing.*;

public class FluxAndMonoTest {
    @Test
    public void fluxTest(){
        Flux<String> stringFlux = Flux.just("Spring", "SpringBoot", "ReactiveSpring")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred!")));
        stringFlux.subscribe(System.out::println, (e) -> System.err.println(e));
    }
}
