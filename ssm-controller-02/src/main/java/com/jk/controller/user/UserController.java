package com.jk.controller.user;

import com.jk.entity.ResultData;
import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by DELL on 2017/5/24.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public ResultData login(@RequestBody UserRequest userRequest) {
        String msg = "成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        //登陆流程
        Map<String, Object> map = userService.login(userRequest);
        if ("0".equals(map.get("flag"))) {
            code = 201;
            msg = "用户不存在";
        } else if ("1".equals(map.get("flag"))) {
            code = 201;
            msg = "密码错误";
        } else {
            data = map.get("userInfo");
        }

        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(data);
        return rd;
    }


    @RequestMapping("user-repeat")
    @ResponseBody
    public ResultData selectUserByUserAccount(@RequestBody UserRequest userRequest) {
        String msg = "成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        //登陆流程
        UserResponse userResponse = userService.selectUserByUserAccount(userRequest);
        if (null != userResponse) {
            code = 201;
            msg = "用户存在";
        }
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(data);
        return rd;
    }


    @RequestMapping("regedit")
    @ResponseBody
    public ResultData regedit(@RequestBody UserRequest userRequest) {
        String msg = "成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        //登陆流程
        int result = userService.regedit(userRequest);
        if (0 == result) {
            code = 201;
            msg = "用户存在";
        }
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(data);
        return rd;
    }

}
