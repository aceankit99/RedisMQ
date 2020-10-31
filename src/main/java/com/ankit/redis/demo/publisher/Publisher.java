package com.ankit.redis.demo.publisher;

import com.ankit.redis.demo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {

    @Autowired
    private RedisTemplate template;

    @Autowired
    private ChannelTopic topic;

    @PostMapping("/publish")
    public String publish(@RequestBody Product product){
        template.convertAndSend(topic.getTopic(),product.toString());
        return "Event Published !!";
    }

}