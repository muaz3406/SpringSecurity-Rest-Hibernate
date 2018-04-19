package com.muaz.Chart.resource;



import com.muaz.Chart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AdminResource {

    @Autowired
    private UserRepository userRepository;




}
