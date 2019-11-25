package cn.ibilling.bean.bo;

import cn.ibilling.bean.dto.ProductOfferDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

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
    @ApiModelProperty(value = "生效时间", name = "effDate")
    private Date effDate;
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
    //所关联的销售品
    @ApiModelProperty(value = "所关联的销售品", name = "productOfferList")
    private List<ProductOfferDO> productOfferList;

    public ProductBean() {
    }

    public ProductBean(String productId, String productName, String productType, String propertyType, String billingModeId, Date effDate, Date expDate, String state, String remark, Date createDate, Date lastUpdateDate, PricingPlanBean pricingPlanBean, List<ProductOfferDO> productOfferList) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.propertyType = propertyType;
        this.billingModeId = billingModeId;
        this.effDate = effDate;
        this.expDate = expDate;
        this.state = state;
        this.remark = remark;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.pricingPlanBean = pricingPlanBean;
        this.productOfferList = productOfferList;
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

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
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

    public List<ProductOfferDO> getProductOfferList() {
        return productOfferList;
    }

    public void setProductOfferList(List<ProductOfferDO> productOfferList) {
        this.productOfferList = productOfferList;
    }
}
