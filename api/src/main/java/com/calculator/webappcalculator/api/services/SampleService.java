package com.calculator.webappcalculator.api.services;

import io.kestros.commons.osgiserviceutils.services.ManagedService;

public interface SampleService extends ManagedService {

  String getMyServiceValue();

}