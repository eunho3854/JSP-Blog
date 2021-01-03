package com.cos.blog.domain.reply;

import java.sql.Timestamp;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
=======
import lombok.Data;

@Data
>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
public class Reply {
	private int id;
	private int userId;
	private int boardId;
	private String content;
	private Timestamp createDate;
}
