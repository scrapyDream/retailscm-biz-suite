
package com.doublechaintech.retailscm.retailstorecityservicecenter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.retailscm.RetailscmUserContext;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;

public interface RetailStoreCityServiceCenterManager{

		

	public RetailStoreCityServiceCenter createRetailStoreCityServiceCenter(RetailscmUserContext userContext, String name, Date founded, String belongsToId) throws Exception;	
	public RetailStoreCityServiceCenter updateRetailStoreCityServiceCenter(RetailscmUserContext userContext,String retailStoreCityServiceCenterId, int retailStoreCityServiceCenterVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public RetailStoreCityServiceCenter loadRetailStoreCityServiceCenter(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String [] tokensExpr) throws Exception;
	public RetailStoreCityServiceCenter internalSaveRetailStoreCityServiceCenter(RetailscmUserContext userContext, RetailStoreCityServiceCenter retailStoreCityServiceCenter) throws Exception;
	public RetailStoreCityServiceCenter internalSaveRetailStoreCityServiceCenter(RetailscmUserContext userContext, RetailStoreCityServiceCenter retailStoreCityServiceCenter,Map<String,Object>option) throws Exception;
	
	public RetailStoreCityServiceCenter transferToAnotherBelongsTo(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String anotherBelongsToId)  throws Exception;
 

	public void delete(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, int version) throws Exception;
	public int deleteAll(RetailscmUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(RetailscmUserContext userContext, RetailStoreCityServiceCenter newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	

	//public  CityPartnerManager getCityPartnerManager(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String mobile, String description ,String [] tokensExpr)  throws Exception;
	
	public  RetailStoreCityServiceCenter addCityPartner(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String mobile, String description , String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter removeCityPartner(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String cityPartnerId, int cityPartnerVersion,String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter updateCityPartner(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String cityPartnerId, int cityPartnerVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  PotentialCustomerManager getPotentialCustomerManager(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String mobile, String cityPartnerId, String description ,String [] tokensExpr)  throws Exception;
	
	public  RetailStoreCityServiceCenter addPotentialCustomer(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String mobile, String cityPartnerId, String description , String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter removePotentialCustomer(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String potentialCustomerId, int potentialCustomerVersion,String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter updatePotentialCustomer(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String potentialCustomerId, int potentialCustomerVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  CityEventManager getCityEventManager(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String mobile, String description ,String [] tokensExpr)  throws Exception;
	
	public  RetailStoreCityServiceCenter addCityEvent(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String mobile, String description , String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter removeCityEvent(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String cityEventId, int cityEventVersion,String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter updateCityEvent(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String cityEventId, int cityEventVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  RetailStoreManager getRetailStoreManager(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String telephone, String owner, String retailStoreCountryCenterId, Date founded, BigDecimal latitude, BigDecimal longitude, String description ,String [] tokensExpr)  throws Exception;
	
	public  RetailStoreCityServiceCenter addRetailStore(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String name, String telephone, String owner, String retailStoreCountryCenterId, Date founded, BigDecimal latitude, BigDecimal longitude, String description , String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter removeRetailStore(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String retailStoreId, int retailStoreVersion,String [] tokensExpr)  throws Exception;
	public  RetailStoreCityServiceCenter updateRetailStore(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String retailStoreId, int retailStoreVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*
	public  RetailStoreCityServiceCenter associateRetailStoreListToNewCreation(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[], String comment, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToCreation(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[],String creationId, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToNewInvestmentInvitation(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[], String comment, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToInvestmentInvitation(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[],String investmentInvitationId, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToNewFranchising(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[], String comment, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToFranchising(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[],String franchisingId, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToNewDecoration(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[], String comment, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToDecoration(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[],String decorationId, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToNewOpening(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[], String comment, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToOpening(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[],String openingId, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToNewClosing(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[], String comment, String [] tokensExpr) throws Exception ;
	public  RetailStoreCityServiceCenter associateRetailStoreListToClosing(RetailscmUserContext userContext, String retailStoreCityServiceCenterId, String  retailStoreIds[],String closingId, String [] tokensExpr) throws Exception ;

	*/



}


