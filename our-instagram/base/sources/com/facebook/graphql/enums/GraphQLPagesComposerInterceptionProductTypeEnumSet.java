package com.facebook.graphql.enums;

import X.AbstractC31175DnJ;
import X.AbstractC72048XLo;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes12.dex */
public final class GraphQLPagesComposerInterceptionProductTypeEnumSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[32];
        A00 = AbstractC72048XLo.A0N(new String[]{"SELL_MESSAGE", "SERVICE", "VOLUNTEERING", "WHATSAPP_DEEPLINK_PAGE", "WHATSAPP_PAGE"}, strArr, AbstractC31175DnJ.A1b(new String[]{"BRANDAWARENESS", "BRANDED_CONTENT", "BRANDTAGGING", "CALL_NOW", "EVENT", "FOODDRINK", "FUNDRAISER_DONATE_BUTTON", "INSIGHTS_PHOTO_UPSELL", "JOB", "JOB_GENERIC_LINK", "JOB_PARTNER_LINK", "LDP", "MARKETPLACE_JOBS", "MARKETPLACE_MOTORS", "MARKETPLACE_REAL_ESTATE", "MESSAGEPAGE", "MESSAGE_BUTTON", "MOVIE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, PriceTableAnnotation$Companion.OFFER, "PAGES_INTEGRITY_FAKE_NEWS", "PAGES_INTEGRITY_UNPUBLISHED_CONTENT", "PRODUCT_TAGGING_NUX", "QPC", "SALESPROMO", "SCHEDULE_POST_TIME", "SELL"}, strArr) ? 1 : 0, 27, 5);
    }

    public static final Set getSet() {
        return A00;
    }
}
