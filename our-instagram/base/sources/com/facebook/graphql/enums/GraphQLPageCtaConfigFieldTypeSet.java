package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLPageCtaConfigFieldTypeSet {
    public static final HashSet A00 = AbstractC16830sb.A05("BUTTON_LINK", "CHECK_BOX", "DEEPLINK", "EMAIL_ADDRESS", "GROUP", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, PaymentDetailChangeTypes$Companion.PHONE_NUMBER, "SELECT", "TEXT", "TEXT_MULTILINE", "TEXT_MULTILINE_CHAR_LIMIT", "TEXT_WITH_CLEARBUTTON", "TEXT_WITH_ENTITIES", "URL", "WHATSAPP_NUMBER");

    public static final Set getSet() {
        return A00;
    }
}
