package https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.controller;

import https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.dto.UserRecordDTO;
import https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.model.UserModel;
import https.github.com.alecxandy.MicroservicesUsereEmailcomSpringBoot.ms_user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserModel> save(@RequestBody @Valid UserRecordDTO userRecordDTO) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDTO, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }

}
