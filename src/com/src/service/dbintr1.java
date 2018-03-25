package com.src.service;

import java.sql.SQLException;

import com.src.model.LoginModel;
import com.src.model.RegisterModel1;

public interface dbintr1 {
	public int insertToDb(RegisterModel1 rml)throws 	SQLException;
	public boolean CheckLogin(LoginModel ln)throws 	SQLException;

}
