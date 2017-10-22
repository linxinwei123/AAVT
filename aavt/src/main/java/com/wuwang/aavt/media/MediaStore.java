package com.wuwang.aavt.media;

/**
 * Created by wuwang on 2017/10/22.
 */

public interface MediaStore<T>{

    void start(String path);

    void store(T hard);

    void stop();

}
