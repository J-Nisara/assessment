package com.kbtg.bootcamp.posttest.user;

import com.kbtg.bootcamp.posttest.exception.NotFoundException;
import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.lottery.LotteryService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    private LotteryService lotteryService;

    public UserService(UserRepository userRepository, LotteryService lotteryService) {
        this.userRepository = userRepository;
        this.lotteryService = lotteryService;
    }

    public List<User> getUser(@RequestBody User user){
        List<User> _user = userRepository.findAll();
        return _user;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(User user, String id) {
        userRepository.findById(Long.parseLong(id))
                .map(_user -> {
                    _user.setUsername(user.getUsername());
                    _user.setPassword(user.getPassword());
                    _user.setRole(user.getRole());
                    return userRepository.save(_user);
                });
    }

    public void deleteUser(String id){
        userRepository.deleteById(Long.parseLong(id));
    }

    public List<Lottery> getLottery(){
        return lotteryService.getLottery();
    }

}
