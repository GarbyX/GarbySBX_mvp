package com.garby.garbysx;

import com.garby.garbysx.commons.Constants;
import com.garby.garbysx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.garby.garbysx.model.User;

@Component
public class ApplicationStartUp implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        initDatabaseEntities();
    }


    private void initDatabaseEntities() {

        if( userService.getAllUsers().size() == 0) {
            userService.addNew(new User("Admin", "admin", "admin", Constants.ROLE_ADMIN));
            userService.addNew(new User("Librarian", "librarian", "librarian", Constants.ROLE_LIBRARIAN));
        }

    }
}