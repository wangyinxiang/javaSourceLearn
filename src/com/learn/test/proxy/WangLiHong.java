package com.learn.test.proxy;

public class WangLiHong implements Singer{

    @Override
    public void orderSong(String songName) {
        System.out.println("演唱歌曲：" + songName);
    }

    @Override
    public void sayGoodBye(String audienceName) {
        System.out.println("再见：" + audienceName);
    }
}
