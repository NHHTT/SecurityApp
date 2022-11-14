package com.SecurityApp.Services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;

@Service
public class AdminService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void doAdminStuff(){

    }
}
