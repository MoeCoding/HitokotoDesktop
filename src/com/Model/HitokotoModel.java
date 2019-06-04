package com.Model;

//{
//	  "id": 1349,
//	  "hitokoto": "末将于禁，愿为曹家世代赴汤蹈火。",
//	  "type": "b",
//	  "from": "镇魂街",
//	  "creator": "死木芽",
//	  "created_at": "1515592778"
//	}

public class HitokotoModel {
	private String id;
	private String hitokoto;
	private String from;
	private String creator;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHitokoto() {
		return hitokoto;
	}
	public void setHitokoto(String hitokoto) {
		this.hitokoto = hitokoto;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
}
