package kr.ac.nnet.spring.study.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Items {

    @Id
    @GeneratedValue
    @Column(name = "items_id")
    private Long id;

    @OneToMany(mappedBy = "items",cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();
}
