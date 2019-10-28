package com.nonexistenware.igor.demoblog.Model;

public class PostItem {

    public String postImage;
    public String postViewTitle;
    public String postAuthorImageView;
    public String postAuthorNameView;
    public String postDateView;
    public String postDescription;
    public String postLikeCount;

    public PostItem() {
    }

    public PostItem(String postImage, String postViewTitle, String postAuthorImageView, String postAuthorNameView, String postDateView, String postDescription, String postLikeCount) {
        this.postImage = postImage;
        this.postViewTitle = postViewTitle;
        this.postAuthorImageView = postAuthorImageView;
        this.postAuthorNameView = postAuthorNameView;
        this.postDateView = postDateView;
        this.postDescription = postDescription;
        this.postLikeCount = postLikeCount;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getPostViewTitle() {
        return postViewTitle;
    }

    public void setPostViewTitle(String postViewTitle) {
        this.postViewTitle = postViewTitle;
    }

    public String getPostAuthorImageView() {
        return postAuthorImageView;
    }

    public void setPostAuthorImageView(String postAuthorImageView) {
        this.postAuthorImageView = postAuthorImageView;
    }

    public String getPostAuthorNameView() {
        return postAuthorNameView;
    }

    public void setPostAuthorNameView(String postAuthorNameView) {
        this.postAuthorNameView = postAuthorNameView;
    }

    public String getPostDateView() {
        return postDateView;
    }

    public void setPostDateView(String postDateView) {
        this.postDateView = postDateView;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostLikeCount() {
        return postLikeCount;
    }

    public void setPostLikeCount(String postLikeCount) {
        this.postLikeCount = postLikeCount;
    }
}
