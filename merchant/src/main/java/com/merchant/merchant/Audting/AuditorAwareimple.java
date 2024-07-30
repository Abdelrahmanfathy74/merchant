package com.merchant.merchant.Audting;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareimple implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("test user");
    }
}
