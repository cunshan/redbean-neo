package com.redbean.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GL on 2016/11/19.
 */
@Controller
public class NeoController {

  private static final Logger logger = LoggerFactory.getLogger(NeoController.class);

  @RequestMapping("/")
  @ResponseBody
  public String index(){
    return "index";
  }




}
