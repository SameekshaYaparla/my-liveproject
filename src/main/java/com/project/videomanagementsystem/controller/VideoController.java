package com.project.videomanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.videomanagementsystem.dao.VideoRepo;
import com.project.videomanagementsystem.entity.Video;

@Controller
public class VideoController {
	
	@Autowired
	VideoRepo vr;
	
	@RequestMapping("/")
	public String show()
	{
		return "index.jsp"; 
	}
	
	@RequestMapping("/addvideo")
	@ResponseBody
	public String addvideo(Video v)
	{
		vr.save(v);
		return "video added...";
	}
	
	@RequestMapping("/viewvideo")
	@ResponseBody
	public String viewvideo(int video_id)
	{
		Video v = vr.findById(video_id).orElse(new Video());
		return v.toString();
	}
	
	@RequestMapping("/videolist")
	@ResponseBody
	public String videolist()
	{
		List<Video> vl =(List<Video>) 
				vr.findAll();
		
		return vl.toString();
	}
	
	@RequestMapping("/updatevideo")
	@ResponseBody
	public String updatevideo(Video v)
	{
		vr.save(v);
		return "video updated...";
	}
	
	@RequestMapping("/deletevideo")
	@ResponseBody
	public String deletevideo(int video_id)
	{
		vr.deleteById(video_id);
		return "video deleted...";
	}
}