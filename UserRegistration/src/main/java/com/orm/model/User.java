package com.orm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
		@Id
		private int userId;
		private String userName;
		private String userEmail;
		private String userContact;
		private String userPassword;
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}


		public User(int userId, String userName, String userEmail, String userContact, String userPassword) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userEmail = userEmail;
			this.userContact = userContact;
			this.userPassword = userPassword;
		}


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


		public String getUserEmail() {
			return userEmail;
		}


		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}


		public String getUserContact() {
			return userContact;
		}


		public void setUserContact(String userContact) {
			this.userContact = userContact;
		}


		public String getUserPassword() {
			return userPassword;
		}


		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}


		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userContact="
					+ userContact + ", userPassword=" + userPassword + "]";
		}
		
		
}	
