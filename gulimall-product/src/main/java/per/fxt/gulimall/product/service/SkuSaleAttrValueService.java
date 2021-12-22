package per.fxt.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.fxt.common.utils.PageUtils;
import per.fxt.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-21 17:48:57
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

