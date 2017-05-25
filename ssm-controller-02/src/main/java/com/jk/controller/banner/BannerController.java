package com.jk.controller.banner;

import com.jk.entity.ResultData;
import com.jk.entity.banner.BannerResponse;
import com.jk.entity.type.MovieTypeResponse;
import com.jk.service.banner.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 2017/5/25.
 */
@Controller
@RequestMapping("/banner/")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("select_banner_list")
    @ResponseBody
    public ResultData selectBannerList() {
        String msg = "success";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        //查询类型列表
        List<BannerResponse> bannerList = bannerService.selectBannerList();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(bannerList);
        return rd;
    }
}
