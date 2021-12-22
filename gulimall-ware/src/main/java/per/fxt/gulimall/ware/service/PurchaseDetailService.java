package per.fxt.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.fxt.common.utils.PageUtils;
import per.fxt.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:28:22
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

