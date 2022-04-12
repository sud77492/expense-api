package com.sudproject.expensetrackerapi.services;

import com.sudproject.expensetrackerapi.domain.User;
import com.sudproject.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
