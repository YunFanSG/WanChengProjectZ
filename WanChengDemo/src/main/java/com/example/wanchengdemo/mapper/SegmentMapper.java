package com.example.wanchengdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wanchengdemo.entity.Segment;
import org.apache.ibatis.annotations.Mapper;

import java.util.Base64;

@Mapper
public interface SegmentMapper extends BaseMapper<Segment> {
}
