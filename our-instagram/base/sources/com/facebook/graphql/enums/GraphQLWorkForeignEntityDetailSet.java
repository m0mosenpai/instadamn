package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class GraphQLWorkForeignEntityDetailSet {
    public static final HashSet A00 = AbstractC16830sb.A05("EXTERNAL_ACCOUNT", "EXTERNAL_LIMITED_ACCOUNT", "HAS_GUESTS", "IS_EXTERNAL", "LIMITED_ACCOUNT", "LIMITED_GROUP", "MULTICOMPANY", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "ROOMS_GUEST", "RP4SMB_GUEST");

    public static final Set getSet() {
        return A00;
    }
}
