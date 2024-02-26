package com.kbtg.bootcamp.posttest.user_ticket;

import com.kbtg.bootcamp.posttest.lottery.Lottery;
import com.kbtg.bootcamp.posttest.user.User;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
@Table(name = "user_ticket")
public class UserTicket implements Serializable {
    @Id
    private int id;
//    @ManyToOne
//    @JoinColumn(name = "id")
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "ticket_id")
    private Lottery lottery;

    private int total_price;

    public UserTicket() {
    }

    public User getUser() {
        return user;
    }

    public Lottery getLottery() {
        return lottery;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setLottery(Lottery lottery) {
        this.lottery = lottery;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}
