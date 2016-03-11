package com.maiquan.aladdin_comment.domain;

import java.io.Serializable;
import java.util.Date;

public class CommentImg implements Serializable{
	
	
	private static final long serialVersionUID = -4167574452997190235L;

	public static final String STATUS_OK  = "OK#";
	public static final String STATUS_DEL = "DEL";
	
	private Integer ID;

    private Integer commentID;

    private String imgPath;

    private String status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;

    private Date delTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCommentID() {
        return commentID;
    }

    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

	@Override
	public String toString() {
		return "CommentImg [ID=" + ID + ", commentID=" + commentID
				+ ", imgPath=" + imgPath + ", status=" + status
				+ ", sortOrder=" + sortOrder + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", delTime=" + delTime + "]";
	}
    
    
}