package com.feib.business.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feib.business.api.entity.TransactionDetailsRequestVO;
import com.feib.business.api.entity.TransactionDetailsResponseVO;
import com.feib.business.api.service.CreditCardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "CreditCard")
@RestController
@RequestMapping("/api")
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;

	@ApiOperation(value = "查詢信用卡帳單交易明細", notes = "查詢信用卡帳單交易明細")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = TransactionDetailsResponseVO.class) })
	@PostMapping(value = "/transactionDetails", consumes = "application/json", produces = "application/json")
	public TransactionDetailsResponseVO queryTransactionDetails(@RequestBody TransactionDetailsRequestVO transactionDetailsRequestVO) {
		return creditCardService.queryTransactionDetails(transactionDetailsRequestVO);
	}

}
