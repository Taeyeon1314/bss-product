package cn.ibilling.bean.bo;

import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-21-9:28
 */
public class FormValidateBean {
    private String text;
    private String key;
    private String type;
    private String exp;
    private String value;
    private String value2;
    private String group;
    private String total;
    private List dataList;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List getDataList() {
        return dataList;
    }

    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    public FormValidateBean(String text, String key, String type, String exp, String value, String value2, String group, String total, List dataList) {
        this.text = text;
        this.key = key;
        this.type = type;
        this.exp = exp;
        this.value = value;
        this.value2 = value2;
        this.group = group;
        this.total = total;
        this.dataList = dataList;
    }
}
