package com.bjike.goddess.interiorrecommend.service;

import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.interiorrecommend.dto.RecommendContentDTO;
import com.bjike.goddess.interiorrecommend.entity.RecommendContent;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
* 推荐内容业务实现
* @Author:			[ Jason ]
* @Date:			[  2017-04-10 02:51 ]
* @Description:	[ 推荐内容业务实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@CacheConfig(cacheNames ="interiorrecommendSerCache")
@Service
public class RecommendContentSerImpl extends ServiceImpl<RecommendContent, RecommendContentDTO> implements RecommendContentSer { 

 }