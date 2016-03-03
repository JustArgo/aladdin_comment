package com.maiquan.aladdin.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comment implements Serializable{
	
	private static final long serialVersionUID = -4214809644379257181L;

	public static final String STATUS_OK  = "OK#";
	public static final String STATUS_DEL = "DEL";
	
	private Integer ID;

    private String mqID;

    private Integer orderID;

    private Integer productID;

    private Integer orderProdID;

    private String commentDesc;

    private List<CommentImg> imgs;
    
    private String status;

    private Date createTime;

    private Date delTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMqID() {
        return mqID;
    }

    public void setMqID(String mqID) {
        this.mqID = mqID == null ? null : mqID.trim();
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getOrderProdID() {
        return orderProdID;
    }

    public void setOrderProdID(Integer orderProdID) {
        this.orderProdID = orderProdID;
    }

    public String getCommentDesc() {
        return commentDesc;
    }

    public void setCommentDesc(String commentDesc) {
        this.commentDesc = commentDesc == null ? null : commentDesc.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

	public List<CommentImg> getImgs() {
		return imgs;
	}

	public void setImgs(List<CommentImg> imgs) {
		this.imgs = imgs;
	}

	@Override
	public String toString() {
		return "Comment [ID=" + ID + ", mqID=" + mqID + ", orderID=" + orderID
				+ ", productID=" + productID + ", orderProdID=" + orderProdID
				+ ", commentDesc=" + commentDesc + ", imgs=" + imgs
				+ ", status=" + status + ", createTime=" + createTime
				+ ", delTime=" + delTime + "]";
	}
	
	
}