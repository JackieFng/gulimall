package per.fxt.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.fxt.common.utils.PageUtils;
import per.fxt.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:07:05
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

