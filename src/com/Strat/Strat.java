package com.Strat;

import javax.swing.UIManager;

import com.UI.UI;
import com.Util.Util;

public class Strat {
	public static void main(String[] args) {
		try {
			//BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new UI();
		Util.RunHitokoto();
	}
}
