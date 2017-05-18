package com.woowahan.web;

import com.woowahan.model.User;
import com.woowahan.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Resource(name = "userRepository")
    private UserRepository userRepository;

    @PostMapping("/users")
    public String create(User user) {
        log.debug("User: {}", user);
        userRepository.save(user);
        return "redirect:/users";
    }
}
