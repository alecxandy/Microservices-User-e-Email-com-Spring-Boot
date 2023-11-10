package https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.service;

import https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.model.UserModel;
import https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserModel userModel){
        return userRepository.save(userModel);
    }

}
