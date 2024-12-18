package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class GraphQLWorkUserAvailabilityStatusTypeSet {
    public static final HashSet A00 = AbstractC16830sb.A05(MessageAvailabilityResponseId$Companion.AVAILABLE, "BUSY", "DO_NOT_DISTURB", "EMOJI_STATUS", "FOCUS", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "SPORADIC", "TENTATIVE");

    public static final Set getSet() {
        return A00;
    }
}
