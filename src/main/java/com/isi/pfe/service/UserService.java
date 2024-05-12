package com.isi.pfe.service;

import com.isi.pfe.domain.User;
import com.isi.pfe.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    // Method to find a user by ID
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    // Method to update a user
    public User updateUser(User user) {
        // Save the updated user and return the saved entity
        return userRepository.save(user);
    }




//    public void updateUser(User user) {
//        User userToUpdate = userRepository.findById(user.getId()).get();
//            userToUpdate.setFullName(user.getFullName());
//            userToUpdate.setRole(user.getRole());
//            userToUpdate.setEmail(user.getEmail());
//          userToUpdate.setCompetences(user.getCompetences());
//           userToUpdate.setFormations(user.getFormations());
//        userToUpdate.setExperiences(user.getExperiences());
//            userRepository.save(userToUpdate);
//    }
//public void updateUser(Long id, User updatedUser) {
//    Optional<User> optionalUser = userRepository.findById(id);
//    if (optionalUser.isPresent()) {
//        User userToUpdate = optionalUser.get();
//        userToUpdate.setFullName(updatedUser.getFullName());
//        userToUpdate.setRole(updatedUser.getRole());
//        userToUpdate.setEmail(updatedUser.getEmail());
//        userToUpdate.setCompetences(updatedUser.getCompetences());
//        userToUpdate.setFormations(updatedUser.getFormations());
//        userToUpdate.setExperiences(updatedUser.getExperiences());
//        userRepository.save(userToUpdate);
//    }
//}
}


