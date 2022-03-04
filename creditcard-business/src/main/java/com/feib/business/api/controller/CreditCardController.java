package com.feib.business.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.feib.api.annotation.WebAdapter;
import com.feib.api.controller.BaseController;
import com.feib.business.api.entity.TransactionDetailsRequestVO;
import com.feib.business.api.entity.TransactionDetailsResponseVO;
import com.feib.business.api.service.CreditCardService;

import io.opentracing.Span;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@WebAdapter
public class CreditCardController extends BaseController implements CreditCardApi {

  @Autowired
  private CreditCardService creditCardService;

  @Override
  public TransactionDetailsResponseVO queryTransactionDetails(
      @RequestBody TransactionDetailsRequestVO transactionDetailsRequestVO) {
    
    Span sp = startTrace("Start queryTransactionDetails");
    
    try {
      log.debug("queryTransactionDetails {}", transactionDetailsRequestVO.toString());  
      traceDebug(sp, "input queryTransactionDetails " + transactionDetailsRequestVO.toString());
      return creditCardService.queryTransactionDetails(transactionDetailsRequestVO);      
    } catch(Exception e) {
      traceError(sp, e.getMessage());      
    } finally {
      endTrace(sp);
    }

    return null;    
  }

}
