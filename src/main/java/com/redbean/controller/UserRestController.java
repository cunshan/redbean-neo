package com.redbean.controller;

import com.redbean.domain.User;
import com.redbean.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by GL on 2016/11/19.
 */
@Controller
@RequestMapping("/user/rest")
public class UserRestController {

  private static final Logger logger = LoggerFactory.getLogger(UserRestController.class);

  @Autowired
  private UserRepository userRepository;

  @RequestMapping("/add")
  @ResponseBody
  public String add(User user) {

    user = this.userRepository.findByName("wang");
    user.setName("hahha");
    this.userRepository.save(user);

    return "success";
  }

}
