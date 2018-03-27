/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIDefinitionValidationResponseWsdlInfoBindingInfo;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIDefinitionValidationResponseWsdlInfoEndpoints;

/**
 * Summary of the WSDL including the basic information
 */
@ApiModel(description = "Summary of the WSDL including the basic information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:28:03.315+05:30")
public class APIDefinitionValidationResponseWsdlInfo {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("endpoints")
  private List<APIDefinitionValidationResponseWsdlInfoEndpoints> endpoints = null;

  @JsonProperty("bindingInfo")
  private APIDefinitionValidationResponseWsdlInfoBindingInfo bindingInfo = null;

  public APIDefinitionValidationResponseWsdlInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * WSDL version 
   * @return version
  **/
  @ApiModelProperty(example = "1.1", value = "WSDL version ")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public APIDefinitionValidationResponseWsdlInfo endpoints(List<APIDefinitionValidationResponseWsdlInfoEndpoints> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public APIDefinitionValidationResponseWsdlInfo addEndpointsItem(APIDefinitionValidationResponseWsdlInfoEndpoints endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<APIDefinitionValidationResponseWsdlInfoEndpoints>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * A list of endpoints the service exposes 
   * @return endpoints
  **/
  @ApiModelProperty(value = "A list of endpoints the service exposes ")
  public List<APIDefinitionValidationResponseWsdlInfoEndpoints> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<APIDefinitionValidationResponseWsdlInfoEndpoints> endpoints) {
    this.endpoints = endpoints;
  }

  public APIDefinitionValidationResponseWsdlInfo bindingInfo(APIDefinitionValidationResponseWsdlInfoBindingInfo bindingInfo) {
    this.bindingInfo = bindingInfo;
    return this;
  }

   /**
   * Get bindingInfo
   * @return bindingInfo
  **/
  @ApiModelProperty(value = "")
  public APIDefinitionValidationResponseWsdlInfoBindingInfo getBindingInfo() {
    return bindingInfo;
  }

  public void setBindingInfo(APIDefinitionValidationResponseWsdlInfoBindingInfo bindingInfo) {
    this.bindingInfo = bindingInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIDefinitionValidationResponseWsdlInfo apIDefinitionValidationResponseWsdlInfo = (APIDefinitionValidationResponseWsdlInfo) o;
    return Objects.equals(this.version, apIDefinitionValidationResponseWsdlInfo.version) &&
        Objects.equals(this.endpoints, apIDefinitionValidationResponseWsdlInfo.endpoints) &&
        Objects.equals(this.bindingInfo, apIDefinitionValidationResponseWsdlInfo.bindingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, endpoints, bindingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIDefinitionValidationResponseWsdlInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    bindingInfo: ").append(toIndentedString(bindingInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

