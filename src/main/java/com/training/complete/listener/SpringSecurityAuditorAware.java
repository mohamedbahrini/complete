package com.training.complete.listener;

import com.training.complete.utils.Constants;
import com.training.complete.utils.SecurityUtil;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SpringSecurityAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(SecurityUtil.getUserName().orElse(Constants.SYSTEM_ACCOUNT));
    }
}