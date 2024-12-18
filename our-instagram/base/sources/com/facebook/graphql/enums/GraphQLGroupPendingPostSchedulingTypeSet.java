package com.facebook.graphql.enums;

import X.AbstractC167027dH;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class GraphQLGroupPendingPostSchedulingTypeSet {
    public static final HashSet A00 = AbstractC167027dH.A0T("DAILY", "HOURLY", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "WEEKLY");

    public static final Set getSet() {
        return A00;
    }
}
