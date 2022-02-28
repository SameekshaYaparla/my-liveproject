package com.project.videomanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.project.videomanagementsystem.entity.Video;

 @Component
public interface VideoRepo extends CrudRepository<Video, Integer> 
{
	
}
