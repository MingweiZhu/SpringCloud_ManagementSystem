package com.mingwei.feign;

import com.mingwei.entity.MenuVO;
import com.mingwei.entity.Order;
import com.mingwei.entity.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/save")
//    这个掉的是ORDER中的ORDERHANDLER
    public void save(@RequestBody Order order);

    @GetMapping("/order/findAllByUid/{index}/{limit}/{uid}")
    public OrderVO findAllByUid(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") long uid);

    @GetMapping("/order/findAll/{index}/{limit}")
    public OrderVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @PutMapping("/order/updateState/{id}")
    public void updateState(@PathVariable("id") long id);
}
