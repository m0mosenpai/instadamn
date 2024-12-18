package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLMessengerAdsPartialAutomatedPrefillTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[32];
        System.arraycopy(new String[]{"STATE", "STREET_ADDRESS", "WORK_EMAIL", "WORK_PHONE", "ZIP_CODE"}, AbstractC31175DnJ.A1b(new String[]{"CITY", "COMPANY_NAME", "COUNTRY", "DATE_TIME", "DOB", PaymentDetailChangeTypes$Companion.EMAIL, "FIRST_NAME", "FULL_ADDRESS", "FULL_NAME", "GENDER", "JOB_TITLE", "LAST_NAME", "MARITAL_STATUS", "MILITARY_STATUS", "NATIONAL_ID_ARGENTINA", "NATIONAL_ID_BRAZIL", "NATIONAL_ID_CHILE", "NATIONAL_ID_COLOMBIA", "NATIONAL_ID_ECUADOR", "NATIONAL_ID_MEXICO", "NATIONAL_ID_PERU", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "PHONE", "POST_CODE", "PROVINCE", "RELATIONSHIP_STATUS", "SLIDER"}, strArr) ? 1 : 0, strArr, 27, 5);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
