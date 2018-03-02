package com.dzjt.base.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/2/2 0002.
 */
@Component
@ConfigurationProperties(prefix="dzjt.file.dzyx")
public class FileConfig {
    String basepath;//文件存放路径
    String markfile;
    String filesize;
    String key;//文件压缩打包密码
    public String getBasepath() {
        return basepath;
    }
    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }
    public String getFilesize() {
        return filesize;
    }
    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getMarkfile() {
        return markfile;
    }
    public void setMarkfile(String markfile) {
        this.markfile = markfile;
    }
}
