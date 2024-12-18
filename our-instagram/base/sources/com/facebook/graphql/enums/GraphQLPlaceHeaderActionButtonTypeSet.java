package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLPlaceHeaderActionButtonTypeSet {
    public static final HashSet A00 = AbstractC16830sb.A05("CHANGE_PIN_LOCATION", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "NOT_A_PLACE", "REPORT_QUESTION", "SUGGEST_EDITS", "VIEW_PAGE", "WRONG_PIN");

    public static final Set getSet() {
        return A00;
    }
}
