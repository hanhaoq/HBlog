package top.hhq.service;

import top.hhq.entity.Friend;
import top.hhq.model.vo.FriendInfo;

import java.util.List;

public interface FriendService {
	List<Friend> getFriendList();

	List<top.hhq.model.vo.Friend> getFriendVOList();

	void updateFriendPublishedById(Long friendId, Boolean published);

	void saveFriend(Friend friend);

	void updateFriend(top.hhq.model.dto.Friend friend);

	void deleteFriend(Long id);

	void updateViewsByNickname(String nickname);

	FriendInfo getFriendInfo(boolean cache, boolean md);

	void updateFriendInfoContent(String content);

	void updateFriendInfoCommentEnabled(Boolean commentEnabled);
}
