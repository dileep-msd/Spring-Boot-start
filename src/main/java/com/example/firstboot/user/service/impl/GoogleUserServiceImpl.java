package com.example.firstboot.user.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.firstboot.user.service.UserManagementService;
@Qualifier("google")    
//@Primary
@Service
public class GoogleUserServiceImpl implements UserManagementService{

	public void getUserName() {
		System.out.print("dileep kumar google");
	}
}
