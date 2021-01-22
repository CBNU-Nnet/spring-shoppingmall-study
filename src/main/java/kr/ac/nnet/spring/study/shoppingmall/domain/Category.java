package kr.ac.nnet.spring.study.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;

//    @ManyToMany
//    @JoinTable(name = "category_item",
//            joinColumns = @JoinColumn(name = "category_id"),
//            inverseJoinColumns = @JoinColumn(name = "item_id"))
//    private List<Item> Items = new ArrayList<>();
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "parent_id")
//    private Category parent;
//
//    @OneToMany(mappedBy = "parent")
//    private List<Category>child = new ArrayList<>();
//
//    public void addChildCategory(Category child){
//        this.child.add(child);
//        child.setParent(this);
//    }
}
