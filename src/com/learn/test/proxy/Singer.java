package com.learn.test.proxy;

public interface Singer {

    /**
     * 根据歌名点歌
     */
    void orderSong(String songName);

    /**
     * 向观众告别
     *
     * @param audienceName
     */
    void  sayGoodBye(String audienceName);
}
