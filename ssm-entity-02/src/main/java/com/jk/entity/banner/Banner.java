package com.jk.entity.banner;

import java.io.Serializable;

/**
 * Created by DELL on 2017/5/25.
 */
public class Banner implements Serializable{

    private int bannerID;
    private String bannerTitle;
    private String bannerImgPath;
    private  String bannerLinkUrl;

    public int getBannerID() {
        return bannerID;
    }

    public void setBannerID(int bannerID) {
        this.bannerID = bannerID;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    public String getBannerImgPath() {
        return bannerImgPath;
    }

    public void setBannerImgPath(String bannerImgPath) {
        this.bannerImgPath = bannerImgPath;
    }

    public String getBannerLinkUrl() {
        return bannerLinkUrl;
    }

    public void setBannerLinkUrl(String bannerLinkUrl) {
        this.bannerLinkUrl = bannerLinkUrl;
    }
}
