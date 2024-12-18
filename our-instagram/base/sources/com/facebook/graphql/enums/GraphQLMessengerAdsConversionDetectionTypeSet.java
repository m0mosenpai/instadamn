package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class GraphQLMessengerAdsConversionDetectionTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[35];
        System.arraycopy(new String[]{"MARK_AS_LEAD", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "PURCHASE_OPTIMIZATION_THREAD_UPSELL", "SAVED_REPLIES_UPSELL", "SELLER_CREATE_INVOICE", "SELLER_ONBOARD", "SHIPPOP_UPSELL", "SUGGEST_AS_YOU_TYPE"}, AbstractC31175DnJ.A1b(new String[]{"ADS_EXTENSION_BANNER", "ADS_INSIGHTS_MARK_AS_ORDER", "APPOINTMENT", "APPOINTMENT_DEPRECATED", "AUTOMATED_RESPONSE_UPSELL", "BUSINESS_PURCHASE", "BUSINESS_PURCHASE_DEPRECATED", "BUYER_INFORMATION", "CONFIRM_ORDER", "CONFIRM_ORDER_AFTER_FOLLOWUP", "CONFIRM_ORDER_DEPRECATED", "CONFIRM_ORDER_INTENT", "CONFIRM_SHIPPED_ORDER", "CONSUMER_QUESTION", "CONVERSATION_FEEDBACK_LEAD_QUALITY", "CONVERSATION_FEEDBACK_SELLER_SENTIMENT", "CTM_CALL", "CTM_THREAD_UPSELL", "CTS_THREAD_UPSELL", "CTX_AD_DUPLICATION_UPSELL", "GENERIC", "INCOMPLETE_LEAD", "INSTANT_REPLIES", "INSTANT_REPLIES_DEPRECATED", "JOBS_CREATOR_FEEDBACK", "LEAD_QUALITY_SIGNAL", "LWI"}, strArr) ? 1 : 0, strArr, 27, 8);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
