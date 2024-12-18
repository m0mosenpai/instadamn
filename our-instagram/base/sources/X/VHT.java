package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VHT implements InterfaceC02530Ab {
    public static final /* synthetic */ VHT[] A01;
    public final String A00;

    static {
        VHT vht = new VHT("CREATE_PAYOUT_PAYPAL_URL", 0, "create_payout_paypal_url");
        VHT vht2 = new VHT("CREATE_FINANCIAL_ENTITY_NEW", 1, "create_financial_entity_new");
        VHT vht3 = new VHT("CREATE_DIRECT_DEBIT_CREDENTIAL", 2, "create_direct_debit_credential");
        VHT vht4 = new VHT("PAYOUT_SET_ADMIN", 3, "payout_set_admin");
        VHT vht5 = new VHT("UPDATE_FINANCIAL_ENTITY", 4, "update_financial_entity");
        VHT vht6 = new VHT("PAYOUT_PHONE_VALIDATION", 5, "payout_phone_validation");
        VHT vht7 = new VHT("PAYOUT_BANK_ACCOUNT_VALIDATION", 6, "payout_bank_account_validation");
        VHT vht8 = new VHT("PAYOUT_ADDRESS_VALIDATION", 7, "payout_address_validation");
        VHT vht9 = new VHT("PAYOUT_ADDRESS_VALIDATION_WITH_SUGGESTIONS", 8, "payout_address_validation_with_suggestions");
        VHT vht10 = new VHT("PAYOUT_ELIGIBILITY", 9, "payout_eligibility");
        VHT vht11 = new VHT("PAYOUT_PAYPAL_VALIDATION", 10, "payout_paypal_validation");
        VHT vht12 = new VHT("PAYOUT_PAYPAL_LOGIN_WITH_REDIRECT", 11, "XPAYLoginWithPaypalReturnControllerTrait::genCreateCredential");
        VHT vht13 = new VHT("PAYOUT_PHONE_ADDRESS_VALIDATION", 12, "payout_phone_address_validation");
        VHT vht14 = new VHT("PAYOUT_TIN_VALIDATION", 13, "payout_tin_validation");
        VHT vht15 = new VHT("INVOICE_DOWNLOAD_DETAILS", 14, "invoice_download_details");
        VHT vht16 = new VHT("REMITTANCE_DOWNLOAD_DETAILS", 15, "remittance_download_details");
        VHT vht17 = new VHT("PAYOUT_DIRECT_DEBIT_ACH_INIT", 16, "direct_debit_ach_payout_init");
        VHT vht18 = new VHT("PAYOUT_DIRECT_DEBIT_ACH_COMPLETION", 17, "direct_debit_ach_payout_completion");
        VHT vht19 = new VHT("PAY_CREATE_FINANCIAL_ENTITY", 18, "pay_create_financial_entity");
        VHT vht20 = new VHT("PAY_UPDATE_FINANCIAL_ENTITY", 19, "pay_update_financial_entity");
        VHT vht21 = new VHT("PAY_CREATE_TASKLESS_URL", 20, "pay_create_taskless_url");
        VHT vht22 = new VHT("PAY_LINK_FINANCIAL_ENTITY", 21, "pay_link_financial_entity");
        VHT vht23 = new VHT("PAY_FINANCIAL_ENTITY", 22, "pay_financial_entity");
        VHT vht24 = new VHT("CLIENT_ON_ACCOUNT_READY", 23, "client_on_account_ready");
        VHT vht25 = new VHT("X_UNIVERSE_ENT_FE_CREATION_OBSERVER", 24, "x_universe_ent_fe_creation_observer");
        VHT vht26 = new VHT("UNIFIED_ONBOARDING_EXIT_HANDLER", 25, "unified_onboarding_exit_handler");
        VHT vht27 = new VHT("X_UNIVERSE_BPA_LINKING", 26, "x_universe_bpa_linking");
        VHT vht28 = new VHT("X_UNIVERSE_BPA_FETCH", 27, "x_universe_bpa_fetch");
        VHT vht29 = new VHT("X_UNIVERSE_ADD_FBUSER_AS_ADMIN_TO_FE", 28, "x_universe_add_fbuser_as_admin_to_fe");
        VHT vht30 = new VHT("X_UNIVERSE_REMOVE_FBUSER_AS_ADMIN_OF_FE", 29, "x_universe_remove_fbuser_as_admin_of_fe");
        VHT vht31 = new VHT("X_UNIVERSE_RELOAD_PAYOUT_FLOW_AFTER_BPL", 30, "x_universe_reload_payout_flow_after_bpl");
        VHT vht32 = new VHT("X_UNIVERSE_SHOW_IG_FE_IN_SELECT_EXISTING", 31, "x_universe_show_ig_fe_in_select_existing");
        VHT vht33 = new VHT("X_UNIVERSE_SHOW_USE_EXISTING_PAYOUT_BUTTON", 32, "x_universe_show_use_existing_payout_button");
        VHT vht34 = new VHT("X_UNIVERSE_BOTTOM_SHEET_NEXT_CLICK", 33, "x_universe_bottom_sheet_next_click");
        VHT vht35 = new VHT("X_UNIVERSE_IG_USER_WITHOUT_BUSINESS", 34, "x_universe_ig_user_without_business");
        VHT vht36 = new VHT("BIZ_ACTIVATION_ONBOARDING_SERVICE", 35, "biz_activation_onboarding_service::genSaveFinancialEntityAndCalculateNextSteps");
        VHT vht37 = new VHT("BIZ_ACTIVATION_MUTATOR_MAIN_FUNCTION", 36, "biz_activation_mutator::genSaveFinancialEntity");
        VHT vht38 = new VHT("BIZ_ACTIVATION_MUTATOR_INTERNAL_FUNCTION", 37, "biz_activation_mutator::genRunFinancialEntityMutator");
        VHT vht39 = new VHT("BIZ_ACTIVATION_CREATE_CREDENTIAL", 38, "biz_activation_credential_utils::genCreateCredential");
        VHT vht40 = new VHT("BIZ_ACTIVATION_CREATE_FE_FOR_CREDENTIAL", 39, "biz_activation_credential_utils::genCreateNewFinancialIDForCredential");
        VHT vht41 = new VHT("BIZ_ACTIVATION_VERIFICATION_SERVICE", 40, "biz_activation_verification_service");
        VHT vht42 = new VHT("BIZ_ACTIVATION_DELTA_PROCESSOR", 41, "biz_activation_delta_processor");
        VHT vht43 = new VHT("BIZ_ACTIVATION_PAYEE_LINK_PROCESSOR", 42, "biz_activation_payee_link_processor");
        VHT vht44 = new VHT("BIZ_ACTIVATION_GEN_EXTERNAL_LOGIN", 43, "BizActivationExternalLoginFlowUtils::genExternalLoginURLsIfNeeded");
        VHT vht45 = new VHT("BSC_DEFERRED_EARNINGS_NOTIFICATIONS", 44, "bsc_deferred_earnings::genPayeeDeferredNotifications");
        VHT vht46 = new VHT("BSC_HYPERWALLET_NOTIFICATIONS", 45, "bsc_hyperwallet_notifications::genPaymentMethodType");
        VHT vht47 = new VHT("BSC_PAYOUT_HOLD_NOTIFICATIONS", 46, "bsc_payout_hold_notifications::genPayoutHolds");
        VHT vht48 = new VHT("BSC_FASTER_PAYOUT_NOTIFICATIONS", 47, "bsc_faster_payout_notifications::genNotificationForFasterPayout");
        VHT vht49 = new VHT("BSC_LOWER_THRESHOLD_EXISTING_METHODS_NOTIFICATIONS", 48, "bsc_faster_payout_notifications::genNotificationForLowerThresholdExistingMethods");
        VHT vht50 = new VHT("BSC_CLIENT_FETCH_NOTIFICATIONS", 49, "xfb_business_payments_notification_hub:notifications");
        VHT vht51 = new VHT("BSC_PAYOUT_EARNINGS_DETAIL", 50, "business_payments_hub::genEarningDetailsViewImpl");
        VHT vht52 = new VHT("BSC_PAYOUT_PAYOUTS_DETAIL", 51, "business_payments_hub::genPayoutDetailsViewImpl");
        VHT vht53 = new VHT("BSC_PAYOUT_EARNINGS", 52, "pay_payout_transactions_connection_earnings");
        VHT vht54 = new VHT("BSC_PAYOUT_PAYOUTS", 53, "pay_payout_transactions_connection_payouts");
        VHT vht55 = new VHT("BSC_PAYOUT_EARNINGS_AND_PAYOUTS", 54, "pay_payout_transactions_connection_all_earnings_and payouts");
        VHT vht56 = new VHT("BSC_PAYOUT_HUB_OVERVIEW", 55, "business_payments_hub::genPAYPaymentsHubOverview");
        VHT vht57 = new VHT("BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", 56, "business_payments_hub::genPayoutTransactions");
        VHT vht58 = new VHT("BSC_PAYOUT_HUB_EARNING_TRANSACTION", 57, "business_payments_hub::genPayoutRecords");
        VHT vht59 = new VHT("BSC_PAYOUT_HUB_EARNING_AND_PAYOUT_TRANSACTION", 58, "business_payments_hub::genPayoutRecordsAndTransactions");
        VHT vht60 = new VHT("BSC_PAYOUT_HUB_FETCH_FINANCIAL_ENTITIES", 59, "business_payments_hub::genFinancialEntities");
        VHT vht61 = new VHT("BSC_PAYOUT_HUB_FETCH_MONETIZATION_STATUS_MODULE", 60, "business_payments_hub::genMonetizationStatusModuleRows");
        VHT vht62 = new VHT("BSC_PAYOUT_HUB_FETCH_SUBPAGE_DETAILS", 61, "business_payments_hub::genDetailsRows");
        VHT vht63 = new VHT("BSC_PAYOUT_EARNINGS_INSIGHTS", 62, "business_payments_hub::genEarningsBreakdownByTools");
        VHT vht64 = new VHT("BSC_PAYOUT_EARNINGS_REINVESTMENT", 63, "business_payments_hub::genEarningsReinvestmentCampaign");
        VHT vht65 = new VHT("BSC_PAYOUT_EARNINGS_REINVESTMENT_CREATE", 64, "business_payments_hub::genEarningsReinvestmentSaveDecision");
        VHT vht66 = new VHT("BSC_PAYOUT_HUB_FETCH_SETTINGS", 65, "business_payments_hub::genSettingsView");
        VHT vht67 = new VHT("BSC_LOCAL_BANK_PAYOUT_METHOD_UPDATE_NOTIFICATIONS", 66, "bsc_local_bank_payout_method_update_notifications:notifications");
        VHT vht68 = new VHT("BSC_PAYOUT_HUB_IG_P2M_SETTINGS", 67, "IGP2MPayoutInfoLoader::genBusinessInfo,genPayoutAccount");
        VHT vht69 = new VHT("BSC_CLIENT_FETCH_NULL_STATES", 68, "new_fe_information:prompts");
        VHT vht70 = new VHT("PAYOUT_REMOVE_DEFERRED_STATUS_ON_FE_EDIT", 69, "PAYEntCheckDeferredStatusOnUpdateCriticalObserver");
        VHT vht71 = new VHT("PAYOUT_REMOVE_DEFERRED_STATUS_ON_TASKLESS_EDIT", 70, "PAYEntCheckDeferredStatusOnTaxStatusUpdateCriticalObserver");
        VHT vht72 = new VHT("BSC_CLIENT_FETCH_EARNINGS_DETAILS", 71, "earning_details_view");
        VHT vht73 = new VHT("BSC_CLIENT_FETCH_PAYOUT_DETAILS", 72, "payout_details_view");
        VHT vht74 = new VHT("BSC_CLIENT_FETCH_PAYOUT_METHOD_DETAILS", 73, "payout_method_details_view");
        VHT vht75 = new VHT("BSC_CLIENT_FETCH_TAX_FORM_DETAILS", 74, "tax_form_details_view");
        VHT vht76 = new VHT("BSC_CLIENT_FETCH_PAY_FE_WRAPPER", 75, "pay_financial_entity_wrapper");
        VHT vht77 = new VHT("BSC_CLIENT_FETCH_PAY_FE_FOR_HUB", 76, "pay_financial_entities_for_hub");
        VHT vht78 = new VHT("BSC_CLIENT_FETCH_PAY_FE_BY_ADMIN_FOR_PAYOUTHUB", 77, "pay_financial_entity_by_admin_for_payout_hub");
        VHT vht79 = new VHT("DEFERRED_CONSISTENCY_CHECK", 78, "deferred_consistency_check");
        VHT vht80 = new VHT("LOWER_THRESHHOLD_NOTIFICATION_JOB", 79, "lower_threshold_notification_job");
        VHT vht81 = new VHT("MONETIZATION_STATUS_MODULE_ORCHESTRATOR", 80, "monetization_status_module_orchestrator");
        VHT vht82 = new VHT("BUSINESS_PAYMENT_ELIGIBILITY_API", 81, "business_payment_eligibility_api");
        VHT vht83 = new VHT("MONETIZATION_STATUS_MODULE_UI_FACTORY", 82, "monetization_status_module_ui_factory");
        VHT vht84 = new VHT("TRUSTLY_DIRECT_DEBIT_ACH_PAYOUT_INIT", 83, "trustly_direct_debit_ach_payout_init");
        VHT vht85 = new VHT("TRUSTLY_DIRECT_DEBIT_ACH_PAYOUT_COMPLETION", 84, "trustly_direct_debit_ach_payout_completion");
        VHT[] vhtArr = new VHT[85];
        System.arraycopy(new VHT[]{vht, vht2, vht3, vht4, vht5, vht6, vht7, vht8, vht9, vht10, vht11, vht12, vht13, vht14, vht15, vht16, vht17, vht18, vht19, vht20, vht21, vht22, vht23, vht24, vht25, vht26, vht27}, 0, vhtArr, 0, 27);
        System.arraycopy(new VHT[]{vht28, vht29, vht30, vht31, vht32, vht33, vht34, vht35, vht36, vht37, vht38, vht39, vht40, vht41, vht42, vht43, vht44, vht45, vht46, vht47, vht48, vht49, vht50, vht51, vht52, vht53, vht54}, 0, vhtArr, 27, 27);
        System.arraycopy(new VHT[]{vht55, vht56, vht57, vht58, vht59, vht60, vht61, vht62, vht63, vht64, vht65, vht66, vht67, vht68, vht69, vht70, vht71, vht72, vht73, vht74, vht75, vht76, vht77, vht78, vht79, vht80, vht81}, 0, vhtArr, 54, 27);
        System.arraycopy(new VHT[]{vht82, vht83, vht84, vht85}, 0, vhtArr, 81, 4);
        A01 = vhtArr;
    }

    public static VHT valueOf(String str) {
        return (VHT) Enum.valueOf(VHT.class, str);
    }

    public static VHT[] values() {
        return (VHT[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public VHT(String str, int i, String str2) {
        this.A00 = str2;
    }
}
