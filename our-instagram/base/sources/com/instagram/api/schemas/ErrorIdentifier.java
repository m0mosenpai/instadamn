package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ErrorIdentifier implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ErrorIdentifier[] A03;
    public static final ErrorIdentifier A04;
    public static final ErrorIdentifier A05;
    public static final ErrorIdentifier A06;
    public static final ErrorIdentifier A07;
    public static final ErrorIdentifier A08;
    public static final ErrorIdentifier A09;
    public static final ErrorIdentifier A0A;
    public static final ErrorIdentifier A0B;
    public static final ErrorIdentifier A0C;
    public static final ErrorIdentifier A0D;
    public static final ErrorIdentifier A0E;
    public static final ErrorIdentifier A0F;
    public static final ErrorIdentifier A0G;
    public static final ErrorIdentifier A0H;
    public static final ErrorIdentifier A0I;
    public static final ErrorIdentifier A0J;
    public static final ErrorIdentifier A0K;
    public static final ErrorIdentifier A0L;
    public static final ErrorIdentifier A0M;
    public static final ErrorIdentifier A0N;
    public static final ErrorIdentifier A0O;
    public static final ErrorIdentifier A0P;
    public static final ErrorIdentifier A0Q;
    public static final ErrorIdentifier A0R;
    public static final ErrorIdentifier A0S;
    public static final ErrorIdentifier A0T;
    public static final ErrorIdentifier A0U;
    public static final ErrorIdentifier A0V;
    public static final ErrorIdentifier A0W;
    public static final ErrorIdentifier A0X;
    public static final ErrorIdentifier A0Y;
    public static final ErrorIdentifier A0Z;
    public static final ErrorIdentifier A0a;
    public static final ErrorIdentifier A0b;
    public static final ErrorIdentifier A0c;
    public static final ErrorIdentifier A0d;
    public static final ErrorIdentifier A0e;
    public static final ErrorIdentifier A0f;
    public static final ErrorIdentifier A0g;
    public static final ErrorIdentifier A0h;
    public static final ErrorIdentifier A0i;
    public static final ErrorIdentifier A0j;
    public static final ErrorIdentifier A0k;
    public static final ErrorIdentifier A0l;
    public static final ErrorIdentifier A0m;
    public static final ErrorIdentifier A0n;
    public static final ErrorIdentifier A0o;
    public static final ErrorIdentifier A0p;
    public static final ErrorIdentifier A0q;
    public static final ErrorIdentifier A0r;
    public static final ErrorIdentifier A0s;
    public static final ErrorIdentifier A0t;
    public static final ErrorIdentifier A0u;
    public static final ErrorIdentifier A0v;
    public static final ErrorIdentifier A0w;
    public static final ErrorIdentifier A0x;
    public static final ErrorIdentifier A0y;
    public static final ErrorIdentifier A0z;
    public static final ErrorIdentifier A10;
    public static final ErrorIdentifier A11;
    public static final ErrorIdentifier A12;
    public static final ErrorIdentifier A13;
    public static final ErrorIdentifier A14;
    public static final ErrorIdentifier A15;
    public static final ErrorIdentifier A16;
    public static final ErrorIdentifier A17;
    public static final ErrorIdentifier A18;
    public static final ErrorIdentifier A19;
    public static final ErrorIdentifier A1A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ErrorIdentifier errorIdentifier = new ErrorIdentifier("UNRECOGNIZED", 0, "ErrorIdentifier_unspecified");
        A19 = errorIdentifier;
        ErrorIdentifier errorIdentifier2 = new ErrorIdentifier("ACCESS_TOKEN_NULL", 1, "ACCESS_TOKEN_NULL");
        A04 = errorIdentifier2;
        ErrorIdentifier errorIdentifier3 = new ErrorIdentifier("ADVERTISER_SANCTIONED", 2, "ADVERTISER_SANCTIONED");
        A07 = errorIdentifier3;
        ErrorIdentifier errorIdentifier4 = new ErrorIdentifier("CANCEL_CALL_CENTER_BOOKING_ERROR", 3, "CANCEL_CALL_CENTER_BOOKING_ERROR");
        A0K = errorIdentifier4;
        ErrorIdentifier errorIdentifier5 = new ErrorIdentifier("CREATE_DRAFT_PROMOTION_ERROR", 4, "CREATE_DRAFT_PROMOTION_ERROR");
        A0L = errorIdentifier5;
        ErrorIdentifier errorIdentifier6 = new ErrorIdentifier("CREATE_LEAD_FORM_ERROR", 5, "CREATE_LEAD_FORM_ERROR");
        A0M = errorIdentifier6;
        ErrorIdentifier errorIdentifier7 = new ErrorIdentifier("CREATE_PROMOTION_ERROR", 6, "CREATE_PROMOTION_ERROR");
        A0N = errorIdentifier7;
        ErrorIdentifier errorIdentifier8 = new ErrorIdentifier("CREATE_UNIFIED_AUDIENCE_ERROR", 7, "CREATE_UNIFIED_AUDIENCE_ERROR");
        A0O = errorIdentifier8;
        ErrorIdentifier errorIdentifier9 = new ErrorIdentifier("CREATION_VALIDATION_ERROR", 8, "CREATION_VALIDATION_ERROR");
        A0P = errorIdentifier9;
        ErrorIdentifier errorIdentifier10 = new ErrorIdentifier("DELETE_DRAFT_PROMOTION_ERROR", 9, "DELETE_DRAFT_PROMOTION_ERROR");
        A0S = errorIdentifier10;
        ErrorIdentifier errorIdentifier11 = new ErrorIdentifier("DELETE_PROMOTION_ERROR", 10, "DELETE_PROMOTION_ERROR");
        A0T = errorIdentifier11;
        ErrorIdentifier errorIdentifier12 = new ErrorIdentifier("DELETE_UNIFIED_AUDIENCE_ERROR", 11, "DELETE_UNIFIED_AUDIENCE_ERROR");
        A0U = errorIdentifier12;
        ErrorIdentifier errorIdentifier13 = new ErrorIdentifier("DEPRECATED_ENDPOINT_ERROR", 12, "DEPRECATED_ENDPOINT_ERROR");
        A0V = errorIdentifier13;
        ErrorIdentifier errorIdentifier14 = new ErrorIdentifier("DEPRECATED_INTERESTS_WARNING", 13, "DEPRECATED_INTERESTS_WARNING");
        A0W = errorIdentifier14;
        ErrorIdentifier errorIdentifier15 = new ErrorIdentifier("DUMMY_ERROR_S265203", 14, "DUMMY_ERROR_S265203");
        A0X = errorIdentifier15;
        ErrorIdentifier errorIdentifier16 = new ErrorIdentifier("EDIT_PROMOTION_ERROR", 15, "EDIT_PROMOTION_ERROR");
        A0Y = errorIdentifier16;
        ErrorIdentifier errorIdentifier17 = new ErrorIdentifier("EDIT_UNIFIED_AUDIENCE_ERROR", 16, "EDIT_UNIFIED_AUDIENCE_ERROR");
        A0Z = errorIdentifier17;
        ErrorIdentifier errorIdentifier18 = new ErrorIdentifier("ENUM_MAPPING_EXCEPTION", 17, "ENUM_MAPPING_EXCEPTION");
        A0a = errorIdentifier18;
        ErrorIdentifier errorIdentifier19 = new ErrorIdentifier("ESTIMATE_AUDIENCE_POTENTIAL_REACH_ERROR", 18, "ESTIMATE_AUDIENCE_POTENTIAL_REACH_ERROR");
        A0b = errorIdentifier19;
        ErrorIdentifier errorIdentifier20 = new ErrorIdentifier("FACEBOOK_COPY_NOT_READY_ERROR", 19, "FACEBOOK_COPY_NOT_READY_ERROR");
        A0c = errorIdentifier20;
        ErrorIdentifier errorIdentifier21 = new ErrorIdentifier("FB_ACCOUNT_INVALID", 20, "FB_ACCOUNT_INVALID");
        A0d = errorIdentifier21;
        ErrorIdentifier errorIdentifier22 = new ErrorIdentifier("FETCH_ALL_UNIFIED_AUDIENCES_ERROR", 21, "FETCH_ALL_UNIFIED_AUDIENCES_ERROR");
        A0e = errorIdentifier22;
        ErrorIdentifier errorIdentifier23 = new ErrorIdentifier("FETCH_BUSINESS_PERSON_ACCESS_TOKEN_ERROR", 22, "FETCH_BUSINESS_PERSON_ACCESS_TOKEN_ERROR");
        A0f = errorIdentifier23;
        ErrorIdentifier errorIdentifier24 = new ErrorIdentifier("FETCH_INFERRED_UNIFIED_AUDIENCE_ERROR", 23, "FETCH_INFERRED_UNIFIED_AUDIENCE_ERROR");
        A0g = errorIdentifier24;
        ErrorIdentifier errorIdentifier25 = new ErrorIdentifier("FETCH_PRIMARY_UNIFIED_AUDIENCE_ERROR", 24, "FETCH_PRIMARY_UNIFIED_AUDIENCE_ERROR");
        A0h = errorIdentifier25;
        ErrorIdentifier errorIdentifier26 = new ErrorIdentifier("GET_PAGE_WELCOME_MESSAGE_ERROR", 25, "GET_PAGE_WELCOME_MESSAGE_ERROR");
        A0j = errorIdentifier26;
        ErrorIdentifier errorIdentifier27 = new ErrorIdentifier("GRAPHQL_QUERY_ERROR", 26, "GRAPHQL_QUERY_ERROR");
        A0k = errorIdentifier27;
        ErrorIdentifier errorIdentifier28 = new ErrorIdentifier("GRAPHQL_QUERY_TIMEOUT_ERROR", 27, "GRAPHQL_QUERY_TIMEOUT_ERROR");
        A0l = errorIdentifier28;
        ErrorIdentifier errorIdentifier29 = new ErrorIdentifier("GRAPHQL_QUERY_UNSUCCESSFUL_ERROR", 28, "GRAPHQL_QUERY_UNSUCCESSFUL_ERROR");
        A0m = errorIdentifier29;
        ErrorIdentifier errorIdentifier30 = new ErrorIdentifier("IABP_CREATION_FAILURE", 29, "IABP_CREATION_FAILURE");
        A0n = errorIdentifier30;
        ErrorIdentifier errorIdentifier31 = new ErrorIdentifier("INELIGIBLE_MEDIA_ERROR", 30, "INELIGIBLE_MEDIA_ERROR");
        A0o = errorIdentifier31;
        ErrorIdentifier errorIdentifier32 = new ErrorIdentifier("MEDIA_VIOLATE_PROFANITY_POLICY_ERROR", 31, "MEDIA_VIOLATE_PROFANITY_POLICY_ERROR");
        A0q = errorIdentifier32;
        ErrorIdentifier errorIdentifier33 = new ErrorIdentifier("NETWORK_CONNECTION_ERROR", 32, "NETWORK_CONNECTION_ERROR");
        A0r = errorIdentifier33;
        ErrorIdentifier errorIdentifier34 = new ErrorIdentifier("PARSING_ERROR", 33, "PARSING_ERROR");
        A10 = errorIdentifier34;
        ErrorIdentifier errorIdentifier35 = new ErrorIdentifier("PAYMENT_CREDIT_CARD_EXPIRED_ERROR", 34, "PAYMENT_CREDIT_CARD_EXPIRED_ERROR");
        A11 = errorIdentifier35;
        ErrorIdentifier errorIdentifier36 = new ErrorIdentifier("PAYMENT_CREDIT_CARD_EXPIRING_ERROR", 35, "PAYMENT_CREDIT_CARD_EXPIRING_ERROR");
        A12 = errorIdentifier36;
        ErrorIdentifier errorIdentifier37 = new ErrorIdentifier("PAYMENT_NO_AVAILABLE_PAYMENT_METHOD_ERROR", 36, "PAYMENT_NO_AVAILABLE_PAYMENT_METHOD_ERROR");
        A13 = errorIdentifier37;
        ErrorIdentifier errorIdentifier38 = new ErrorIdentifier("PAYMENT_PREPAY_LOW_BALANCE_ERROR", 37, "PAYMENT_PREPAY_LOW_BALANCE_ERROR");
        A14 = errorIdentifier38;
        ErrorIdentifier errorIdentifier39 = new ErrorIdentifier("PAYMENT_PREPAY_ZERO_BALANCE_ERROR", 38, "PAYMENT_PREPAY_ZERO_BALANCE_ERROR");
        A15 = errorIdentifier39;
        ErrorIdentifier errorIdentifier40 = new ErrorIdentifier("SET_GEOLOCATION_INFERRED_UNIFIED_AUDIENCE_ERROR", 39, "SET_GEOLOCATION_INFERRED_UNIFIED_AUDIENCE_ERROR");
        A16 = errorIdentifier40;
        ErrorIdentifier errorIdentifier41 = new ErrorIdentifier("SUBMIT_CALL_CENTER_BOOKING_ERROR", 40, "SUBMIT_CALL_CENTER_BOOKING_ERROR");
        A17 = errorIdentifier41;
        ErrorIdentifier errorIdentifier42 = new ErrorIdentifier("UNKNOWN_ERROR", 41, "UNKNOWN_ERROR");
        A18 = errorIdentifier42;
        ErrorIdentifier errorIdentifier43 = new ErrorIdentifier("VALIDATE_BUSINESS_PERSON_ACCESS_TOKEN_ERROR", 42, "VALIDATE_BUSINESS_PERSON_ACCESS_TOKEN_ERROR");
        A1A = errorIdentifier43;
        ErrorIdentifier errorIdentifier44 = new ErrorIdentifier("ACCOUNT_SPEND_LIMIT_REACHED", 43, "account_spend_limit_reached");
        A05 = errorIdentifier44;
        ErrorIdentifier errorIdentifier45 = new ErrorIdentifier("AD_ACCOUNT_DISABLED_ELIGIBLE_FOR_SELF_RESOLUTION", 44, "ad_account_disabled_eligible_for_self_resolution");
        A08 = errorIdentifier45;
        ErrorIdentifier errorIdentifier46 = new ErrorIdentifier("AD_ACCOUNT_DISABLED_FOR_ADS_INTEGRITY_POLICY", 45, "ad_account_disabled_for_ads_integrity_policy");
        A09 = errorIdentifier46;
        ErrorIdentifier errorIdentifier47 = new ErrorIdentifier("AD_ACCOUNT_DISABLED_FOR_PAYMENT_RISK", 46, "ad_account_disabled_for_payment_risk");
        A0A = errorIdentifier47;
        ErrorIdentifier errorIdentifier48 = new ErrorIdentifier("AD_ACCOUNT_NOT_ACTIVE", 47, "ad_account_not_active");
        A0B = errorIdentifier48;
        ErrorIdentifier errorIdentifier49 = new ErrorIdentifier("AD_ACCOUNT_UNSETTLED", 48, "ad_account_unsettled");
        A0C = errorIdentifier49;
        ErrorIdentifier errorIdentifier50 = new ErrorIdentifier("ADS_FREE_SUBSCRIPTION", 49, "ads_free_subscription");
        A06 = errorIdentifier50;
        ErrorIdentifier errorIdentifier51 = new ErrorIdentifier("ALREADY_PROMOTED", 50, "already_promoted");
        A0D = errorIdentifier51;
        ErrorIdentifier errorIdentifier52 = new ErrorIdentifier("BASIC_ADS_TIER", 51, "basic_ads_tier");
        A0E = errorIdentifier52;
        ErrorIdentifier errorIdentifier53 = new ErrorIdentifier("BUSINESS_ACCOUNT_BANHAMMERED", 52, "business_account_banhammered");
        A0F = errorIdentifier53;
        ErrorIdentifier errorIdentifier54 = new ErrorIdentifier("BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED", 53, "business_account_banhammered_and_business_verification_required");
        A0G = errorIdentifier54;
        ErrorIdentifier errorIdentifier55 = new ErrorIdentifier("BUSINESS_ACCOUNT_BANHAMMERED_BY_ACE", 54, "business_account_banhammered_by_ace");
        A0H = errorIdentifier55;
        ErrorIdentifier errorIdentifier56 = new ErrorIdentifier("BUSINESS_ACCOUNT_BANHAMMERED_BY_COMMERCE_DNR", 55, "business_account_banhammered_by_commerce_dnr");
        A0I = errorIdentifier56;
        ErrorIdentifier errorIdentifier57 = new ErrorIdentifier("BUSINESS_TWO_FAC_ENABLED", 56, "business_two_fac_enabled");
        A0J = errorIdentifier57;
        ErrorIdentifier errorIdentifier58 = new ErrorIdentifier("CURRENT_USER_NO_PERMISSION_TO_BOOST_MEDIA", 57, "current_user_no_permission_to_boost_media");
        A0R = errorIdentifier58;
        ErrorIdentifier errorIdentifier59 = new ErrorIdentifier("CURRENT_USER_NOT_MEDIA_OWNER", 58, "current_user_not_media_owner");
        A0Q = errorIdentifier59;
        ErrorIdentifier errorIdentifier60 = new ErrorIdentifier("GENERIC_ADS_TIER", 59, "generic_ads_tier");
        A0i = errorIdentifier60;
        ErrorIdentifier errorIdentifier61 = new ErrorIdentifier("LESS_PERSONALIZED_ADS_TIER", 60, "less_personalized_ads_tier");
        A0p = errorIdentifier61;
        ErrorIdentifier errorIdentifier62 = new ErrorIdentifier("NO_ACCESS_TO_AD_ACCOUNT", 61, "no_access_to_ad_account");
        A0t = errorIdentifier62;
        ErrorIdentifier errorIdentifier63 = new ErrorIdentifier("NO_DEFAULT_AD_ACCOUNT", 62, "no_default_ad_account");
        A0u = errorIdentifier63;
        ErrorIdentifier errorIdentifier64 = new ErrorIdentifier("NO_LINKED_PAGE", 63, "no_linked_page");
        A0v = errorIdentifier64;
        ErrorIdentifier errorIdentifier65 = new ErrorIdentifier("NOT_PAGE_ADVERTISER", 64, "not_page_advertiser");
        A0s = errorIdentifier65;
        ErrorIdentifier errorIdentifier66 = new ErrorIdentifier("PAGE_NOT_CONNECTED", 65, "page_not_connected");
        A0w = errorIdentifier66;
        ErrorIdentifier errorIdentifier67 = new ErrorIdentifier("PAGE_NOT_CREATED", 66, "page_not_created");
        A0x = errorIdentifier67;
        ErrorIdentifier errorIdentifier68 = new ErrorIdentifier("PAGE_NOT_OWNED", 67, "page_not_owned");
        A0y = errorIdentifier68;
        ErrorIdentifier errorIdentifier69 = new ErrorIdentifier("PAGE_NOT_PUBLISHED", 68, "page_not_published");
        A0z = errorIdentifier69;
        ErrorIdentifier[] errorIdentifierArr = new ErrorIdentifier[69];
        System.arraycopy(new ErrorIdentifier[]{errorIdentifier, errorIdentifier2, errorIdentifier3, errorIdentifier4, errorIdentifier5, errorIdentifier6, errorIdentifier7, errorIdentifier8, errorIdentifier9, errorIdentifier10, errorIdentifier11, errorIdentifier12, errorIdentifier13, errorIdentifier14, errorIdentifier15, errorIdentifier16, errorIdentifier17, errorIdentifier18, errorIdentifier19, errorIdentifier20, errorIdentifier21, errorIdentifier22, errorIdentifier23, errorIdentifier24, errorIdentifier25, errorIdentifier26, errorIdentifier27}, 0, errorIdentifierArr, 0, 27);
        System.arraycopy(new ErrorIdentifier[]{errorIdentifier28, errorIdentifier29, errorIdentifier30, errorIdentifier31, errorIdentifier32, errorIdentifier33, errorIdentifier34, errorIdentifier35, errorIdentifier36, errorIdentifier37, errorIdentifier38, errorIdentifier39, errorIdentifier40, errorIdentifier41, errorIdentifier42, errorIdentifier43, errorIdentifier44, errorIdentifier45, errorIdentifier46, errorIdentifier47, errorIdentifier48, errorIdentifier49, errorIdentifier50, errorIdentifier51, errorIdentifier52, errorIdentifier53, errorIdentifier54}, 0, errorIdentifierArr, 27, 27);
        System.arraycopy(new ErrorIdentifier[]{errorIdentifier55, errorIdentifier56, errorIdentifier57, errorIdentifier58, errorIdentifier59, errorIdentifier60, errorIdentifier61, errorIdentifier62, errorIdentifier63, errorIdentifier64, errorIdentifier65, errorIdentifier66, errorIdentifier67, errorIdentifier68, errorIdentifier69}, 0, errorIdentifierArr, 54, 15);
        A03 = errorIdentifierArr;
        A02 = AbstractC12190kN.A00(errorIdentifierArr);
        ErrorIdentifier[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (ErrorIdentifier errorIdentifier70 : values) {
            linkedHashMap.put(errorIdentifier70.A00, errorIdentifier70);
        }
        A01 = linkedHashMap;
        CREATOR = new C41854Ig8(72);
    }

    public static ErrorIdentifier valueOf(String str) {
        return (ErrorIdentifier) Enum.valueOf(ErrorIdentifier.class, str);
    }

    public static ErrorIdentifier[] values() {
        return (ErrorIdentifier[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ErrorIdentifier(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
