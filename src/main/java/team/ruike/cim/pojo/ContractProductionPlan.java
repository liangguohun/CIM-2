package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

public class ContractProductionPlan implements Serializable {
  private static final long serialVersionUID = -8749159766478095970L;
  private Integer contractProductionPlanId;
  private Integer contractOrderId;
  private String productionBatch;
  private Integer status;
  private Date date;


  public Integer getContractProductionPlanId() {
    return contractProductionPlanId;
  }

  public void setContractProductionPlanId(Integer contractProductionPlanId) {
    this.contractProductionPlanId = contractProductionPlanId;
  }


  public Integer getContractOrderId() {
    return contractOrderId;
  }

  public void setContractOrderId(Integer contractOrderId) {
    this.contractOrderId = contractOrderId;
  }


  public String getProductionBatch() {
    return productionBatch;
  }

  public void setProductionBatch(String productionBatch) {
    this.productionBatch = productionBatch;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}