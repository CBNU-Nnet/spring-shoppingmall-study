package kr.ac.nnet.spring.study.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    private String email;

    //장바구니 ->필요?
    @OneToMany(mappedBy = "member")
    private List<Cart> carts = new ArrayList<>();

    //주문
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList();
}
