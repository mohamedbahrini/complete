package com.training.complete.listener;

import com.training.complete.model.Audit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class JpaListener<T extends Audit> {
    private final static Logger LOGGER = LoggerFactory.getLogger(JpaListener.class);

    @PrePersist
    public void beforePersisting(T entity) {
        String connectedUser = getUserName();
        LOGGER.info("connected user {}", connectedUser);
        entity.setCreatedBy(connectedUser);
        entity.setLastModifiedBy(connectedUser);
    }

    @PreUpdate
    public void beforeUpdating(T entity) {
        entity.setLastModifiedBy(getUserName());
    }

    private String getUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
