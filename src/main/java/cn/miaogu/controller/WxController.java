package cn.miaogu.controller;


import cn.miaogu.Util.*;
import cn.miaogu.dao.*;
import cn.miaogu.domain.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "*", allowCredentials = "true", maxAge = 3600)    /*跨域且允许携带cookie*/
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "tomato")
public class WxController {
    //依赖注入
    @Autowired
    private BbspaquMapper bbspaquMapper;

    @Autowired
    private MyMapper myMapper;

//    //region 测试接口
//    @RequestMapping("/ex")
//    @ResponseBody
//    public User addBiao(HttpServletRequest request, HttpServletResponse response
//    ) throws Exception {
//
//        User user = new User();
//        try {
//            user = myMapper.selectAllUsers("aaaaaa");
//
//            System.out.println(user);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return user;
//    }
//    //endregion

    //region 查询bbspaqu表
    @RequestMapping("/bbspaqu")
    @ResponseBody
    public List<Bbspaqu> addBiao(HttpServletRequest request, HttpServletResponse response
    ) throws Exception {
        List<Bbspaqu> bbspaqus = new ArrayList<>();
        try{
            bbspaqus = myMapper.selectAllBbs();
        }catch (Exception e){
            System.out.println(e);
        }
        return bbspaqus;
    }
    //endregion

}
