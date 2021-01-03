package com.cos.blog.domain.user;

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
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private String address;
<<<<<<< HEAD
	private String userRole; // admin, user
=======
	private String userRole;  // admin, user
>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
	private Timestamp createDate;
}
