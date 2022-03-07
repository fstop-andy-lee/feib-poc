#!/bin/bash

APM_SERVER=localhost

export OTEL_RESOURCE_ATTRIBUTES=service.name=CreditcardBusiness,service.version=0.0.1,deployment.environment=dev
export OTEL_EXPORTER_OTLP_ENDPOINT=https://${APM_SERVER}:8200
export OTEL_EXPORTER_OTLP_HEADERS="Authorization=Bearer an_apm_secret_token"
java -javaagent:./opentelemetry-javaagent.jar \
     -cp ./creditcard-business/target/* \
     com.feib.business.api.FeibCreditCardBusinessServiceApplication