package com.wuniu.printmanage.general;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author Yan
 */
public interface GeneralController<T extends BaseEntity, PK extends Serializable> {

    GeneralService<T, PK> getService();

    @PostMapping
    @ApiOperation(value = "创建")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    default void save(@RequestBody T data) {
        getService().insert(data);
    }

    @ApiOperation(value = "更新全部")
    @PutMapping("/{id}")
    default void update(@PathVariable PK id,
                        @RequestBody T data) {
        getService().update(id, data);
    }


    @ApiOperation(value = "更新部分")
    @PatchMapping("/{id}")
    default void merge(@PathVariable PK id,
                        @RequestBody T data) {
        getService().update(id, data);
    }


    @ApiOperation(value = "删除")
    @DeleteMapping("/{id}")
    @ResponseBody
    default void delete(@PathVariable PK id) {
        getService().remove(id);
    }

    @ApiOperation(value = "id查询")
    @GetMapping(value = "/{id}")
    @ResponseBody
    default T get(@PathVariable PK id) {
        return getService().get(id);
    }

    // @ApiOperation(value = "查询")
    // @GetMapping
    // @ResponseBody
    // default Page<T> list(QueryParam param) {
    //   return getService().page(param.getPage(), param.getLimit(), param.getParams());
    // }

    // @ApiOperation(value = "数量查询")
    // @GetMapping("/count")
    // @ResponseBody
    // default int count(@RequestParam Map<String, Object> params) {
    //   return 0;
    // }
}
