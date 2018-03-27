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
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.ScopeBindings;

/**
 * Scope
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-27T17:28:03.315+05:30")
public class Scope {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("bindings")
  private ScopeBindings bindings = null;

  public Scope name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of Scope 
   * @return name
  **/
  @ApiModelProperty(example = "apim:api_view", value = "name of Scope ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Scope description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of Scope 
   * @return description
  **/
  @ApiModelProperty(example = "This Scope can used to view Apis", value = "description of Scope ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Scope bindings(ScopeBindings bindings) {
    this.bindings = bindings;
    return this;
  }

   /**
   * Get bindings
   * @return bindings
  **/
  @ApiModelProperty(value = "")
  public ScopeBindings getBindings() {
    return bindings;
  }

  public void setBindings(ScopeBindings bindings) {
    this.bindings = bindings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scope scope = (Scope) o;
    return Objects.equals(this.name, scope.name) &&
        Objects.equals(this.description, scope.description) &&
        Objects.equals(this.bindings, scope.bindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, bindings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scope {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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

