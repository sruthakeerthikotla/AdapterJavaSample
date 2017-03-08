/*
 *    Licensed Materials - Property of IBM
 *    5725-I43 (C) Copyright IBM Corp. 2015, 2016. All Rights Reserved.
 *    US Government Users Restricted Rights - Use, duplication or
 *    disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.ibm.mfp.sample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ibm.mfp.adapter.api.ConfigurationAPI;
import com.ibm.mfp.adapter.api.OAuthSecurity;

@Api(value = "Sample Adapter Resource")
@Path("/resource")
public class JavaAdapterResource {
	/*
	 * For more info on JAX-RS see
	 * https://jax-rs-spec.java.net/nonav/2.0-rev-a/apidocs/index.html
	 */

	// Define logger (Standard java.util.Logger)
	static Logger logger = Logger.getLogger(JavaAdapterResource.class.getName());

	// Inject the MFP configuration API:
	@Context
	ConfigurationAPI configApi;


	/*
	 * Path for method:
	 * "<server address>/mfp/api/adapters/javaAdapter/resource/getstores"
	 */

	@ApiOperation(value = "Unprotected Resource", notes = "This is an unprotected resource, this resource is accessible without a valid token. Returns a json with list of stores")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "A constant string is returned") })
	@GET
	@Path("/getstores")
	@Produces(MediaType.TEXT_PLAIN)
	@OAuthSecurity(enabled = false)
	public String unprotected() {
	String storeslist ="[{'id':'42d32dc3-d7bf-487b-901d-0e58584c1a7f','locationCode':'SF','country':'United States','phoneNumber':'855-926-2746','sundayClose':'6pm','sundayOpen':'12pm','saturdayClose':'8pm','saturdayOpen':'9am','fridayClose':'8pm','fridayOpen':'9am','thursdayClose':'8pm','thursdayOpen':'9am','wednesdayClose':'8pm','wednesdayOpen':'9am','tuesdayClose':'8pm','tuesdayOpen':'9am','mondayClose':'8pm','mondayOpen':'9am','longitude':-122.401858,'latitude':37.797788,'image':'http://www.refractored.com/images/SF.png','zipCode':'94111','state':'CA','city':'San Francisco','streetAddress':'394 Pacific Ave. 4th Floor','locationHint':'Sansome & Pacific','name':'Xamarin HQ'} ,{'id':'94fa54ab-72c2-40c7-85ee-491f2c9d023e','locationCode':'Austria','country':'Austria','phoneNumber':'855-926-2746','sundayClose':'6pm','sundayOpen':'12pm','saturdayClose':'8pm','saturdayOpen':'9am','fridayClose':'8pm','fridayOpen':'9am','thursdayClose':'8pm','thursdayOpen':'9am','wednesdayClose':'8pm','wednesdayOpen':'9am','tuesdayClose':'8pm','tuesdayOpen':'9am','mondayClose':'8pm','mondayOpen':'9am','longitude':-58.3788027544727,'latitude':-34.6049956875424,'image':'http://refractored.com/images/Argentina.png','zipCode':'C1035AAD CABA','state':'','city':'Buenos Aires','streetAddress':'Av. Pres. Roque Saenz Pena 875','locationHint':'Visual Studio to the Max!','name':'Xamarin Inc. Argentina'} ,{'id':'affad0c3-172e-496c-9697-665d48bb18f8','locationCode':'London','country':'United Kingdom','phoneNumber':'855-926-2746','sundayClose':'6pm','sundayOpen':'12pm','saturdayClose':'8pm','saturdayOpen':'9am','fridayClose':'8pm','fridayOpen':'9am','thursdayClose':'8pm','thursdayOpen':'9am','wednesdayClose':'8pm','wednesdayOpen':'9am','tuesdayClose':'8pm','tuesdayOpen':'9am','mondayClose':'8pm','mondayOpen':'9am','longitude':-0.139453173418381,'latitude':51.5171566022088,'image':'http://refractored.com/images/London.png','zipCode':'W1W 8RL','state':'','city':'London','streetAddress':'10 Margaret Street','locationHint':'South of Regents Park','name':'Xamarin Inc. London'} ,{'id':'d9064e62-df2e-4d16-ba26-bddc06a9c4a2','locationCode':'Denmark','country':'Denmark','phoneNumber':'588-926-2746','sundayClose':'6pm','sundayOpen':'12pm','saturdayClose':'8pm','saturdayOpen':'9am','fridayClose':'8pm','fridayOpen':'9am','thursdayClose':'8pm','thursdayOpen':'9am','wednesdayClose':'8pm','wednesdayOpen':'9am','tuesdayClose':'8pm','tuesdayOpen':'9am','mondayClose':'8pm','mondayOpen':'9am','longitude':10.1875958,'latitude':56.1721407,'image':'http://refractored.com/images/Denmark.png','zipCode':'8200','state':'','city':'Aarhus','streetAddress':'Abogade 15','locationHint':'Home of the Test Cloud','name':'Xamarin Denmark APS'} ] ";
		return storeslist;
	}


}
