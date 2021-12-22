package per.fxt.gulimall.product.dao;

import per.fxt.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-21 17:48:57
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
