package per.fxt.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.fxt.common.utils.PageUtils;
import per.fxt.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:28:22
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

