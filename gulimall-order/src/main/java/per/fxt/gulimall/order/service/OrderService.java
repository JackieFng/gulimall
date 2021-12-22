package per.fxt.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.fxt.common.utils.PageUtils;
import per.fxt.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author JackieFng
 * @email fxt@gmail.com
 * @date 2021-12-22 17:23:08
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

