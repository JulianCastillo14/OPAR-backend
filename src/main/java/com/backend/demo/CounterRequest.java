package com.backend.demo;


import io.prometheus.metrics.core.metrics.Counter;

public class CounterRequest {
    static final Counter requestCount = Counter.builder()
            .name("requests_total")
            .labelNames("method", "endpoint")
            .register();

    public CounterRequest() {
    }
}
