package com.project.videomanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {
	@Id
	int video_id;
	String video_name;
	int rating;
	float price;
	
	public Video() {
		super();
	}
	
	public int getVideo_id() {
		return video_id;
	}
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	public String getVideo_name() {
		return video_name;
	}
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return ("video_id=" + video_id + video_name + "video with rating of " + rating + " costs " + price);
	}
}
