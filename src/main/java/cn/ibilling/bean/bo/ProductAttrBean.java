package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-10:27
 */
public class ProductAttrBean {

    //产品属性标识
    @ApiModelProperty(value = "属性ID", name = "productAttrId")
    private String productAttrId;
    //产品属性标识
    @ApiModelProperty(value = "属性名称", name = "attrName")
    private String attrName;
    //产品属性标识
    @ApiModelProperty(value = "属性field", name = "attrField")
    private String attrField;
    //产品属性标识
    @ApiModelProperty(value = "属性描述", name = "attrDesc")
    private String attrDesc;
    //产品属性值
    @ApiModelProperty(value = "属性值", name = "attrValue")
    private String attrValue;

    public ProductAttrBean() {
    }

    public ProductAttrBean(String productAttrId, String attrName, String attrField, String attrDesc, String attrValue) {
        this.productAttrId = productAttrId;
        this.attrName = attrName;
        this.attrField = attrField;
        this.attrDesc = attrDesc;
        this.attrValue = attrValue;
    }

    public String getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(String productAttrId) {
        this.productAttrId = productAttrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrField() {
        return attrField;
    }

    public void setAttrField(String attrField) {
        this.attrField = attrField;
    }

    public String getAttrDesc() {
        return attrDesc;
    }

    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Override
    public String toString() {
        return "ProductAttrBean{" +
                "productAttrId='" + productAttrId + '\'' +
                ", attrName='" + attrName + '\'' +
                ", attrField='" + attrField + '\'' +
                ", attrDesc='" + attrDesc + '\'' +
                ", attrValue='" + attrValue + '\'' +
                '}';
    }
}
