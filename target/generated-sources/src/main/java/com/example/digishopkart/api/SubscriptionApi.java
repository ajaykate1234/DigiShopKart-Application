/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.digishopkart.api;

import com.example.digishopkart.model.Errors;
import com.example.digishopkart.model.Subscription;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-20T16:59:59.580281231+05:30[Asia/Kolkata]")
@Validated
public interface SubscriptionApi {

    @Operation(summary = "create a suscription", description = "Api to create Subscription by using Customer, Product, Discount", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success Response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/subscriptions",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Subscription> createSubscription(@Parameter(in = ParameterIn.DEFAULT, description = "A JSON object Contenting Subscription information.", required=true, schema=@Schema()) @Valid @RequestBody Subscription body);


    @Operation(summary = "delete a suscription", description = "Api to delete the subscription by id", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/subscription/{subscriptionId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Subscription> deleteSubscription(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("subscriptionId") Integer subscriptionId);


    @Operation(summary = "fetch all suscriptions", description = "APi to get All the sunscriptions", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/subscriptions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Subscription> fetchAllSubscriptions();


    @Operation(summary = "fetch a suscription", description = "Api to fetch sunscription by id", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/subscription/{subscriptionId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Subscription> fetchSubscription(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("subscriptionId") Integer subscriptionId);


    @Operation(summary = "update a suscription", description = "Api to update subscription record by id", tags={ "Subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "404", description = "The specified resource was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Errors.class))) })
    @RequestMapping(value = "/api/v1/subscription/{subscriptionId}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Subscription> updateSubscription(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("subscriptionId") Integer subscriptionId, @Parameter(in = ParameterIn.DEFAULT, description = "A JSON object Contenting Subscription information.", required=true, schema=@Schema()) @Valid @RequestBody Subscription body);

}

