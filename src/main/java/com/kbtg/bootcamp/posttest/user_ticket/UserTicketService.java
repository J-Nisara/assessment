package com.kbtg.bootcamp.posttest.user_ticket;

import com.kbtg.bootcamp.posttest.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserTicketService {
    private UserRepository userRepository;

    public UserTicketService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
