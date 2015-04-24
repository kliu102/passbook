package cn.xing.passbook.app;

import cn.xing.passbook.model.SettingKey;

/**
 * 用户设置变化监听器
 */
public interface OnSettingChangeListener {
	void onSettingChange(SettingKey key);
}
