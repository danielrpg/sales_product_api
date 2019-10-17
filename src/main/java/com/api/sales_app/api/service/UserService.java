package com.api.sales_app.api.service;

import com.api.sales_app.api.model.User;
import com.api.sales_app.api.model.UserDto;

import java.util.List;

public interface UserService {

    User save (UserDto user);
    List<User> findAll ();
    void delete (int id);

    User findOne (String username);

    User findById (int id);

    UserDto update (UserDto userDto);
}
