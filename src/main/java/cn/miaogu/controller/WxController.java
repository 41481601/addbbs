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
import java.util.*;

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
    private ForumThreadMapper forumThread;

    @Autowired
    private CommonMemberCountMapper commonMemberCountMapper;

    @Autowired
    private ForumPostMapper forumPostMapper;

    @Autowired
    private MyMapper myMapper;

    public WxController() {
    }

    //region 测试接口
    @RequestMapping("/ceshi")
    @ResponseBody
    public int ceshi(HttpServletRequest request, HttpServletResponse response
    ) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Fid",2);//版块ID
        jsonObject.put("author","大番茄");
        jsonObject.put("authorid",1);
        jsonObject.put("subject","今天是个号日子今天是个号日子");
        jsonObject.put("Text","今天是个号日子今天是个号日子今天是个号日子今天是个号日子今天是个号日子今天是个号日子");
        int k = fabutiezi(jsonObject);
       return k;
    }
    //endregion

    //region 查询bbspaqu表
    @RequestMapping("/bbspaqu")
    @ResponseBody
    public String addBiao(HttpServletRequest request, HttpServletResponse response
    ) throws Exception {
        List<Bbspaqu> bbspaqus = new ArrayList<>();
        String k="";
        try{
            bbspaqus = myMapper.selectAllBbs();
            for (int i=0;i<bbspaqus.size();i++){
                String zhengwen = bbspaqus.get(i).getZhengwen();
                //处理正文
                String clzhengwen = MyUbb.htmlToUbb(zhengwen);

                JSONObject jsonObject = new JSONObject();
                jsonObject.put("Text",clzhengwen);
                jsonObject.put("Fid",72);
                jsonObject.put("author","大番茄");
                jsonObject.put("authorid",1);
                jsonObject.put("subject",bbspaqus.get(i).getBiaoti());
                System.out.println(clzhengwen);
                int ks = fabutiezi(jsonObject);
                k = String.valueOf(ks);
            }
        }catch (Exception e){
            System.out.println(e);
            k = e.toString();
        }

        return k;
    }
    //endregion

    //region 发布帖子
    public int fabutiezi(JSONObject tiezi){
        //需要Fid  author   authorid   subject
        Integer nowTime = Integer.parseInt(String.valueOf(System.currentTimeMillis()/1000));//当前时间的时间戳。
        Integer Fid = Integer.parseInt(tiezi.get("Fid").toString());
        String Author = tiezi.get("author").toString();//作者名
        Integer Authorid = Integer.parseInt(tiezi.get("authorid").toString());//作者ID
        String Subject = tiezi.get("subject").toString();//标题
        String zwText = tiezi.get("Text").toString();//正文
        try {
            //获取pid
            ForumPostTableid forumPostx2 = new ForumPostTableid();
            myMapper.insertForum(forumPostx2);
            int pid = forumPostx2.getPid();
            //插入forum_thread 并获取到tid。
            ForumThread forumThread1 = new ForumThread();
            forumThread1.setFid(Fid);
            forumThread1.setAuthor(Author);
            forumThread1.setAuthorid(Authorid);
            forumThread1.setSubject(Subject);
            forumThread1.setDateline(nowTime);//发布时间
            forumThread1.setLastpost(nowTime);//最后回复的时间
            forumThread1.setLastposter(Author);//最后回复的人
            forumThread1.setStatus((short)32);
            forumThread1.setMaxposition(1);
            myMapper.addForumThread(forumThread1);//帖子ID
            int tid = forumThread1.getTid();

            //插入主题
            ForumPost forumPost = new ForumPost();
            forumPost.setPid(pid);
            forumPost.setFid(Fid);//论坛id
            forumPost.setTid(tid);//主题id
            forumPost.setFirst(true);//是否首贴
            forumPost.setAuthor(Author);
            forumPost.setAuthorid(Authorid);
            forumPost.setSubject(Subject);
            forumPost.setDateline(nowTime);
            forumPost.setMessage(zwText);
            forumPost.setUseip("123.145.82.103");
            forumPost.setPort((short)8847);
            forumPost.setInvisible(false);
            forumPostMapper.insertSelective(forumPost);

            //操作pre_common_member_count表  修改
            CommonMemberCount comm = new CommonMemberCount();
            myMapper.updateCommonMemberCount(Authorid);

            ForumForum forumForum = new ForumForum();
            forumForum.setFid(Fid);
            forumForum.setLastpost("tid+\\t"+Subject+"\\t"+nowTime+"\\t"+Author);
            myMapper.updateForumForum(forumForum);
        }catch (Exception E){
            System.out.println(E);
            return 0;
        }

        return 1;
    }
    //endregion

}
