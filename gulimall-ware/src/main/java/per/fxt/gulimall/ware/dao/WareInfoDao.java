package per.fxt.gulimall.ware.dao;

import per.fxt.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:28:22
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
