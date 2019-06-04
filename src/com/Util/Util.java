package com.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import com.Model.HitokotoModel;
import com.UI.UI;
import com.google.gson.Gson;

public class Util {
	private static String Get(String httpurl) {
		StringBuffer data = new  StringBuffer();
		try {
			URL url = new URL(httpurl);
			InputStream is = url.openStream();
			InputStreamReader str = new InputStreamReader(is,"utf-8");
			BufferedReader indata = new BufferedReader(str);
			String line;
			while((line= indata.readLine())!=null) {
				data.append(line+"\r\n");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data.toString();
	}
	private static HitokotoModel Json(String JsonData) {
		String[] arr = new String[4];
		Gson gson = new Gson();
		HitokotoModel model = gson.fromJson(JsonData, HitokotoModel.class);
		return model;
	}
	
	public static void RunHitokoto() {
		Runnable run = new Runnable() {
			public void run() {
				while(true) {
					String json = Get("https://v1.hitokoto.cn/?c");
					HitokotoModel model = Json(json);
					UI.HitokotoText.setText(model.getHitokoto());
					UI.Creator.setText("！！！！"+model.getCreator());
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		run.run();
	}
	//	public static void main(String[] args) {
//		String json = Get("https://v1.hitokoto.cn/");
//		HitokotoModel model = Json(json);
//		System.out.println(model.getHitokoto());
//	}
}
