package com.cos.blog.domain.reply;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Reply {
	private int id;
	private int userId;
	private int boardId;
	private String content;
	private Timestamp createDate;
}
