package com.nonexistenware.igor.demoblog.Model;

public class BlogItem {

    public String blogImage;
    public String authorImage;
    public String postTitle;
    public String authorPostCount;
    public String likeCount;
    public String postDate;
    public String detailedDate;
    public String postDescription;
    public String authorCommentImage;

    public BlogItem() {
    }

    public BlogItem(String blogImage, String authorImage, String postTitle, String authorPostCount, String likeCount, String postDate, String detailedDate, String postDescription, String authorCommentImage) {
        this.blogImage = blogImage;
        this.authorImage = authorImage;
        this.postTitle = postTitle;
        this.authorPostCount = authorPostCount;
        this.likeCount = likeCount;
        this.postDate = postDate;
        this.detailedDate = detailedDate;
        this.postDescription = postDescription;
        this.authorCommentImage = authorCommentImage;
    }

    public String getBlogImage() {
        return blogImage;
    }

    public void setBlogImage(String blogImage) {
        this.blogImage = blogImage;
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getAuthorPostCount() {
        return authorPostCount;
    }

    public void setAuthorPostCount(String authorPostCount) {
        this.authorPostCount = authorPostCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getDetailedDate() {
        return detailedDate;
    }

    public void setDetailedDate(String detailedDate) {
        this.detailedDate = detailedDate;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getAuthorCommentImage() {
        return authorCommentImage;
    }

    public void setAuthorCommentImage(String authorCommentImage) {
        this.authorCommentImage = authorCommentImage;
    }
}
