package ru.netology.domain;

public class UserInfo {
    private int userId;
    private String userName;
    private boolean registeredUser;
    private boolean canHidePost;
    private boolean canReposts;
    private boolean canLikePost;
    private boolean canAddToFavorite;
    private boolean canComment;
    private boolean canAddImage;
    protected boolean canAddAudio;
    private boolean canAddVideo;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canPin;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    public boolean isCanHidePost() {
        return canHidePost;
    }

    public void setCanHidePost(boolean canHidePost) {
        this.canHidePost = canHidePost;
    }

    public boolean isCanReposts() {
        return canReposts;
    }

    public void setCanReposts(boolean canReposts) {
        this.canReposts = canReposts;
    }

    public boolean isCanLikePost() {
        return canLikePost;
    }

    public void setCanLikePost(boolean canLikePost) {
        this.canLikePost = canLikePost;
    }

    public boolean isCanAddToFavorite() {
        return canAddToFavorite;
    }

    public void setCanAddToFavorite(boolean canAddToFavorite) {
        this.canAddToFavorite = canAddToFavorite;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanAddImage() {
        return canAddImage;
    }

    public void setCanAddImage(boolean canAddImage) {
        this.canAddImage = canAddImage;
    }

    public boolean isCanAddAudio() {
        return canAddAudio;
    }

    public void setCanAddAudio(boolean canAddAudio) {
        this.canAddAudio = canAddAudio;
    }

    public boolean isCanAddVideo() {
        return canAddVideo;
    }

    public void setCanAddVideo(boolean canAddVideo) {
        this.canAddVideo = canAddVideo;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }
}
