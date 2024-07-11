package com.aj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.aj.exception.UserNotFoundException;

@RestController
public class UserRestController {

    @GetMapping("/user/{userId}")
    public ResponseEntity<String> getUserName(@PathVariable Integer userId) {
        if (userId == 100) {
            return ResponseEntity.ok("John");
        } else if (userId == 101) {
            return ResponseEntity.ok("Smith");
        } else {
            throw new UserNotFoundException("User not found.");
        }
    }
}
  