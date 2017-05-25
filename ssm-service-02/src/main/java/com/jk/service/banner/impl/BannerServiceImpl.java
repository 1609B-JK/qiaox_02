package com.jk.service.banner.impl;

import com.jk.entity.banner.BannerResponse;
import com.jk.mapper.banner.BannerMapper;
import com.jk.service.banner.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2017/5/25.
 */
@Service
public class BannerServiceImpl implements BannerService{

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<BannerResponse> selectBannerList() {
        return bannerMapper.selectBannerList();
    }
}
