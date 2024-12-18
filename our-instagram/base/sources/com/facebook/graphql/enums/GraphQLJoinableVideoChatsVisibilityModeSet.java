package com.facebook.graphql.enums;

import X.AbstractC167027dH;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class GraphQLJoinableVideoChatsVisibilityModeSet {
    public static final HashSet A00 = AbstractC167027dH.A0T("ALL_FRIENDS", "FRIENDS_AND_CUSTOM", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "WHITELISTED_PARTICIPANTS");

    public static final Set getSet() {
        return A00;
    }
}
