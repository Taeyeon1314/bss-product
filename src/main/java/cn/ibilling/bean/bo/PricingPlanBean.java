package cn.ibilling.bean.bo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Taeyeon
 * @createTime 2019-11-15-20:09
 */
public class PricingPlanBean {
    //定价计划ID
    @ApiModelProperty(value = "定价计划ID", name = "pricingPlanId")
    private String pricingPlanId;
    //定价计划ID
    @ApiModelProperty(value = "定价计划名称", name = "pricingPlanName")
    private String pricingPlanName;
    //定价计划ID
    @ApiModelProperty(value = "定价计划描述", name = "pricingPlanDesc")
    private String pricingPlanDesc;


    public PricingPlanBean() {
    }

    public PricingPlanBean(String pricingPlanId, String pricingPlanName, String pricingPlanDesc) {
        this.pricingPlanId = pricingPlanId;
        this.pricingPlanName = pricingPlanName;
        this.pricingPlanDesc = pricingPlanDesc;
    }

    public String getPricingPlanId() {
        return pricingPlanId;
    }

    public void setPricingPlanId(String pricingPlanId) {
        this.pricingPlanId = pricingPlanId;
    }

    public String getPricingPlanName() {
        return pricingPlanName;
    }

    public void setPricingPlanName(String pricingPlanName) {
        this.pricingPlanName = pricingPlanName;
    }

    public String getPricingPlanDesc() {
        return pricingPlanDesc;
    }

    public void setPricingPlanDesc(String pricingPlanDesc) {
        this.pricingPlanDesc = pricingPlanDesc;
    }
}
