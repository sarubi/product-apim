/*
 * WSO2 API Manager - Admin Portal API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.admin.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ThreatProtectionPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:24:45.778+05:30")
public class ThreatProtectionPolicy {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("policy")
  private String policy = null;

  public ThreatProtectionPolicy uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Policy ID
   * @return uuid
  **/
  @ApiModelProperty(value = "Policy ID")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ThreatProtectionPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the policy
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the policy")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThreatProtectionPolicy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the policy
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the policy")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ThreatProtectionPolicy policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * policy as a json string
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "policy as a json string")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatProtectionPolicy threatProtectionPolicy = (ThreatProtectionPolicy) o;
    return Objects.equals(this.uuid, threatProtectionPolicy.uuid) &&
        Objects.equals(this.name, threatProtectionPolicy.name) &&
        Objects.equals(this.type, threatProtectionPolicy.type) &&
        Objects.equals(this.policy, threatProtectionPolicy.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, type, policy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatProtectionPolicy {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

