package cn.ibilling.controller;

import cn.ibilling.bean.bo.APIResultBean;
import cn.ibilling.bean.bo.FormValidateBean;
import cn.ibilling.bean.query.UserParameter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-21-9:26
 */
@RestController
public class TestController {

    @PostMapping("/getUserPageForm")
    public APIResultBean getUserPageForm(@RequestBody @Valid UserParameter userParameter) {
        if ("admin".equals(userParameter.getUsername())) {
            List<FormValidateBean> formValidateBeanList = new ArrayList<>();
            formValidateBeanList.add(new FormValidateBean("年龄", "age", "1", "eq", "22", "", "0", "0", new ArrayList()));
            formValidateBeanList.add(new FormValidateBean("用户名", "username", "2", "perfectMatching", "张三", "", "0", "0", new ArrayList()));
            formValidateBeanList.add(new FormValidateBean("出生日期", "birthday", "3", "between", "2012-10-12", "2019-10-12", "0", "0", new ArrayList()));
            formValidateBeanList.add(new FormValidateBean("状态", "product_status", "4", "", "1", "", "0", "0", new ArrayList()));
            formValidateBeanList.add(new FormValidateBean("指派给", "operator", "5", "", "1", "", "0", "0", new ArrayList()));
            return new APIResultBean("0", "查询成功", formValidateBeanList);
        } else {
            return new APIResultBean("-1", "查询失败", null);
        }
    }
}
