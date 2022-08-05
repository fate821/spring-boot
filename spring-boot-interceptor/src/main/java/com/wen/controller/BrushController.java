package com.wen.controller;

import com.wen.interceptor.AccessLimit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口防刷验证
 *  参考 https://mp.weixin.qq.com/s/Z9lxBqJeT1Ouy_lloMg-4Q
 */
@RestController
public class BrushController {

    @AccessLimit(seconds = 5, maxCount = 5, needLogin = true)
    @RequestMapping("/fangshua")
    @ResponseBody
    public  String fangshua() {
        return null;//Result.success("请求成功");Result<String>
    }
}
