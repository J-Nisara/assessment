package com.kbtg.bootcamp.posttest.lottery;

import com.kbtg.bootcamp.posttest.user_ticket.UserTicket;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "lottery")
public class Lottery {
    @Id
    public String ticket_id;
    public int price;
    public int amount;

//    public Lottery(String ticket_id, int price, int amount) {
//        this.ticket_id = ticket_id;
//        this.price = price;
//        this.amount = amount;
//    }

    public Lottery() {
    }

    public String getTicket_id() {
        return ticket_id;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
