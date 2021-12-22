package per.fxt.gulimall.member.dao;

import per.fxt.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:18:29
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
