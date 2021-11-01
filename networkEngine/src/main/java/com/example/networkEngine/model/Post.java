package com.example.networkEngine.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "is_active")
    private short isActive;
    ///////////////////////////////////место для статуса модерации в енаме
    @Column(name = "moderator_id")
    private int moderatorId;//////////////переделать в модератора?
    @Column(name = "user_id")
    private int userId;//////////////переделать в юзера?
    private Date time;
    private String title;
    private String text;
    @Column(name = "view_count")
    private int viewCount;
}
