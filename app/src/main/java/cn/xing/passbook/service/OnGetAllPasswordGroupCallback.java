package cn.xing.passbook.service;

import java.util.List;

import cn.xing.passbook.model.PasswordGroup;

public interface OnGetAllPasswordGroupCallback {
	public void onGetAllPasswordGroup(List<PasswordGroup> passwordGroups);
}
