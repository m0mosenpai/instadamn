package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLFXDSIconTypeSet {
    public static final HashSet A00 = AbstractC16830sb.A05("ACCOUNT", "AC_SHARE", "CARD", "INFO", "LINK", "LOGIN", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "USER");

    public static final Set getSet() {
        return A00;
    }
}
