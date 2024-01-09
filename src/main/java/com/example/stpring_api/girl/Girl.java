package com.example.stpring_api.girl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @PostConstruct
    public void postConstruct(){
        System.out.println("Hello my babes : Hàm này được gọi khi sau khi tạo bean!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Hello my babes : Hàm này được gọi trước khi xóa bean!");
    }
}
