package com.jk.service.banner;

import com.jk.entity.banner.BannerResponse;

import java.util.List;

/**
 * Created by DELL on 2017/5/25.
 */
public interface BannerService {

    List<BannerResponse> selectBannerList();
}
