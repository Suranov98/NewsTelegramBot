package root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.data.model.User;
import root.data.repo.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private User findByChatId(String chatId) {
        for (User user : getAllUsers()) {
            if (user.getChatId().equals(chatId)) {
                return user;
            }
        }
        return null;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserByChatId(String chatId) {
        return findByChatId(chatId);
    }

}
