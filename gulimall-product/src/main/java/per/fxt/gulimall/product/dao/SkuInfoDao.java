package per.fxt.gulimall.product.dao;

import per.fxt.gulimall.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-21 17:48:57
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
