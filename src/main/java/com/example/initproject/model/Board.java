package com.example.initproject.model;
import lombok.ToString;
import lombok.Setter;
import lombok.Getter;
import java.util.Date;

@Getter
@Setter
@ToString
public class Board {
    private Long seq;
    private String title;
    private String writer;
    private String content;
    private Date createDate;
    private Long cnt;
}
