package per.fxt.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.fxt.common.utils.PageUtils;
import per.fxt.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-21 17:48:57
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

