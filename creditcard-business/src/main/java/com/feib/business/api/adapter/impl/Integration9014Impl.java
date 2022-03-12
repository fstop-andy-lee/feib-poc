package com.feib.business.api.adapter.impl;

import org.springframework.stereotype.Component;

import com.feib.business.api.adapter.Integration9014;
import com.feib.integration.api.entity.IVR9014RequestVO;
import com.feib.integration.api.entity.IVR9014ResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Integration9014Impl extends BaseIntegration<IVR9014RequestVO, IVR9014ResponseVO> implements Integration9014  {

  public Integration9014Impl() {
    super();
    this.returnClass = IVR9014ResponseVO.class;
  }
  
  public Integration9014Impl(String channelName, String apiUrl) {
    super();
    this.returnClass = IVR9014ResponseVO.class;
  }
  
  @Override
  public void onSuccess(IVR9014ResponseVO result) {
    log.debug("Get result {}", result.toString());
  }

  @Override
  public void onFailure(Throwable ex) {
    log.error(ex.getMessage());
  }

}
