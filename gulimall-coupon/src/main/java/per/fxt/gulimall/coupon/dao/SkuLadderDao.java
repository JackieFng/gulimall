package per.fxt.gulimall.coupon.dao;

import per.fxt.gulimall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:07:05
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
