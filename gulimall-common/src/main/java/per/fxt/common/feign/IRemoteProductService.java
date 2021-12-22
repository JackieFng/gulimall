package per.fxt.common.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author JackieFng
 * @Date 2021/12/22 16:11
 */
@FeignClient("product")
public interface IRemoteProductService {
}
