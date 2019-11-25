package cn.ibilling.bean.bo;

import cn.ibilling.module.product.bean.dto.ProductDO;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-13:38
 */
public class ProductOfferBean {
    //销售品ID
    @ApiModelProperty(value = "销售品ID", name = "offerId")
    private String offerId;
    //销售品名称
    @ApiModelProperty(value = "销售品名称", name = "productId")
    private String offerName;
    //生效时间
    @ApiModelProperty(value = "生效时间", name = "productId")
    private Date effDate;
    //失效时间
    @ApiModelProperty(value = "失效时间", name = "productId")
    private Date expDate;
    //状态
    @ApiModelProperty(value = "状态", name = "productId")
    private String state;
    //备注
    @ApiModelProperty(value = "备注", name = "productId")
    private String remark;
    //创建时间
    @ApiModelProperty(value = "创建时间", name = "productId")
    private Date createDate;
    //最近更新时间
    @ApiModelProperty(value = "最近更新时间", name = "productId")
    private Date lastUpdateDate;
    //关联的产品数据集合
    @ApiModelProperty(value = "关联的产品数据集合", name = "productList", dataType = "List")
    private List<ProductDO> productList;
    //定价计划
    @ApiModelProperty(value = "定价计划", name = "pricingPlanBean")
    private PricingPlanBean pricingPlanBean;

    public ProductOfferBean() {
    }

    public ProductOfferBean(String offerId, String offerName, Date effDate, Date expDate, String state, String remark, Date createDate, Date lastUpdateDate, List<ProductDO> productList, PricingPlanBean pricingPlanBean) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.effDate = effDate;
        this.expDate = expDate;
        this.state = state;
        this.remark = remark;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.productList = productList;
        this.pricingPlanBean = pricingPlanBean;
    }

    public PricingPlanBean getPricingPlanBean() {
        return pricingPlanBean;
    }

    public void setPricingPlanBean(PricingPlanBean pricingPlanBean) {
        this.pricingPlanBean = pricingPlanBean;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
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

    public List<ProductDO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDO> productList) {
        this.productList = productList;
    }
}
