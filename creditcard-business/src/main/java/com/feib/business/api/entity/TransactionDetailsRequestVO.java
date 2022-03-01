package com.feib.business.api.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "TransactionDetailsRequestVO", description = "交易明細請求條件")
public class TransactionDetailsRequestVO {

	@ApiModelProperty("消費者ID")
	private String userID;

}
