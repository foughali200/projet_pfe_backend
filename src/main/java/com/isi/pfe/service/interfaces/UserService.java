package com.isi.pfe.service.interfaces;

import com.isi.pfe.domain.User;

public interface UserService {
    void updateUser(User user);

    void deleteUser(Long id);
}

