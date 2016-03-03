package com.maiquan.aladdin.service.impl;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.maiquan.aladdin.domain.CommonParam;
import com.maiquan.aladdin.service.ICommentRestService;


@Path("/api/comment_service/comment")
public class CommentRestServiceImpl implements ICommentRestService{

	@Path("/commentList")
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Override
	public Map<String, Object> getCommentList(CommonParam param) {
		return null;
	}

	@Path("/commentDetail")
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Override
	public Map<String, Object> getCommentDetail(CommonParam param) {
		return null;
	}

	@Path("/comment")
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	@Override
	public Map<String, Object> comment(CommonParam param) {
		return null;
	}

}
