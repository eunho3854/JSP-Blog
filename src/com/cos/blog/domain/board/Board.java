package com.cos.blog.domain.board;

import java.sql.Timestamp;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Board {
	private int id;
	private int userId;
	private String title;
	private String content;
	private int readCount; // 조회수 디폴트값 0
=======
import lombok.Data;

@Data
public class Board {
	private  int id;
	private  int userId;
	private String title;
	private String content;
	private int readCount; // 조회수 디폴트 값 0
>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
	private Timestamp createDate;
}
