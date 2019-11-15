package cn.ibilling.bean.bo;

import cn.ibilling.bean.dto.ProductOfferDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author Taeyeon
 * @createTime 2019-11-14-18:09
 */

public class ProductBean {
    //产品ID
    @ApiModelProperty(value = "产品ID", name = "productId")
    private String productId;
    //产品名称
    @ApiModelProperty(value = "产品名称", name = "productName")
    private String productName;
    //产品类型
    @ApiModelProperty(value = "产品类型", name = "productType")
    private String productType;
    //属性类型
    @ApiModelProperty(value = "属性类型", name = "propertyType")
    private String propertyType;
    //计费方式
    @ApiModelProperty(value = "计费方式", name = "billingModeId")
    private String billingModeId;
    //生效时间
    @ApiModelProperty(value = "生效时间", name = "eftDate")
    private Date eftDate;
    //失效时间
    @ApiModelProperty(value = "失效时间", name = "expDate")
    private Date expDate;
    //状态
    @ApiModelProperty(value = "状态", name = "state")
    private String state;
    //备注
    @ApiModelProperty(value = "备注", name = "remark")
    private String remark;
    //创建时间
    @ApiModelProperty(value = "创建时间", name = "createDate")
    private Date createDate;
    //最近更新时间
    @ApiModelProperty(value = "最近更新时间", name = "lastUpdateDate")
    private Date lastUpdateDate;
    //定价计划
    @ApiModelProperty(value = "定价计划", name = "pricingPlanBean")
    private PricingPlanBean pricingPlanBean;
    //销售品ID
    @ApiModelProperty(value = "所关联的销售品", name = "productOffer")
    private ProductOfferDO productOffer;

    public ProductBean() {
    }


    public ProductBean(String productId, String productName, String productType, String propertyType, String billingModeId, Date eftDate, Date expDate, String state, String remark, Date createDate, Date lastUpdateDate, PricingPlanBean pricingPlanBean, ProductOfferDO productOffer) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.propertyType = propertyType;
        this.billingModeId = billingModeId;
        this.eftDate = eftDate;
        this.expDate = expDate;
        this.state = state;
        this.remark = remark;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.pricingPlanBean = pricingPlanBean;
        this.productOffer = productOffer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getBillingModeId() {
        return billingModeId;
    }

    public void setBillingModeId(String billingModeId) {
        this.billingModeId = billingModeId;
    }

    public Date getEftDate() {
        return eftDate;
    }

    public void setEftDate(Date eftDate) {
        this.eftDate = eftDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public PricingPlanBean getPricingPlanBean() {
        return pricingPlanBean;
    }

    public void setPricingPlanBean(PricingPlanBean pricingPlanBean) {
        this.pricingPlanBean = pricingPlanBean;
    }

    public ProductOfferDO getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(ProductOfferDO productOffer) {
        this.productOffer = productOffer;
    }
}
