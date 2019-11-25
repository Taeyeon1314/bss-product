package cn.ibilling.bean.query;

import javax.validation.constraints.NotEmpty;

/**
 * @author Taeyeon
 * @createTime 2019-11-21-10:10
 */
public class UserParameter {

    @NotEmpty(message = "用户名不能为空")
    private String username;

    public UserParameter() {
    }

    public UserParameter(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserParameter{" +
                "username='" + username + '\'' +
                '}';
    }
}
