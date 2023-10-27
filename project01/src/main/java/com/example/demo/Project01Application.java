package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long mno;
   
   @Column 
   private String memoText;
}


@Controller
@SpringBootApplication
public class Project01Application {

    public static void main(String[] args) {
        SpringApplication.run(Project01Application.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "hello"; // 이 부분은 뷰 이름
    }
}

