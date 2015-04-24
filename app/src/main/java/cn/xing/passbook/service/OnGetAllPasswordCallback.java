package cn.xing.passbook.service;

import java.util.List;

import cn.xing.passbook.model.Password;

public interface OnGetAllPasswordCallback {
	public void onGetAllPassword(String froupName, List<Password> passwords);
}
