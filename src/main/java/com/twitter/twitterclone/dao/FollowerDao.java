package com.twitter.twitterclone.dao;

import com.twitter.twitterclone.model.Followings;

public interface FollowerDao {

    void addFriend(Integer senderId, Integer receiverId);

    Followings getFriendByIds(Integer senderId, Integer receiverId);

    void delete(Integer senderId, Integer receiverId);
}
