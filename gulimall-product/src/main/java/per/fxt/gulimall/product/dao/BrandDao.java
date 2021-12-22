package per.fxt.gulimall.product.dao;

import per.fxt.gulimall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-21 17:48:57
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
