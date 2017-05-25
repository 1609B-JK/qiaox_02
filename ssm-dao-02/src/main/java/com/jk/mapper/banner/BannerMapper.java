package com.jk.mapper.banner;

import com.jk.entity.banner.BannerResponse;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by DELL on 2017/5/25.
 */
public interface BannerMapper {

    @Select("select t_id as \"bannerID\", t_title as \"bannerTitle\", 'http://' as \"bannerImgPath\",'http://' as \"bannerLinkUrl\" from t_banners")
    List<BannerResponse> selectBannerList();
}
