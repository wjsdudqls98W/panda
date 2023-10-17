package com.playdata.panda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.playdata.panda.dto.User;
import com.playdata.panda.service.UserService;

@Controller
public class UserViewController {

    /**
     * @return 회원가입 페이지 화면을 리턴한다.
     */
    @GetMapping("/signup")
    public String signupPageView() {
        return "member/register";
    }

    @GetMapping("/login")
    public String loginPageView() {
        return "member/login2";
    }

    @GetMapping("/mypage")
    public String myPageView() {
        return "member/my-page";
    }
    
    

}
