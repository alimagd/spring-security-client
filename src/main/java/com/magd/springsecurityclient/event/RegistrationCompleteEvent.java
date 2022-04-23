package com.magd.springsecurityclient.event;

import com.magd.springsecurityclient.entity.User;
import lombok.*;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }

//    public RegistrationCompleteEvent(Object source, Clock clock) {
//        super(source, clock);
//    }
}
