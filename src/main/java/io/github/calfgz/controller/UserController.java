package io.github.calfgz.controller;

import io.github.calfgz.model.User;
import io.github.calfgz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author calf
 * @create 2017-09-14 17:32
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getList() {
        return userService.selectAll();
    }

    @GetMapping("/{id}")
    public User detail(@PathVariable(name = "id", required = true) long id) {
        return userService.selectByKey(id);
    }

    @PostMapping
    public long create(User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public long update(@PathVariable(name = "id", required = true) long id, User user) {
        return userService.updateSelective(user);
    }
}
