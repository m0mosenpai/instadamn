package com.facebook.graphql.enums;

import X.AbstractC167027dH;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class GraphQLWebAuthnAttestationConveyanceSet {
    public static final HashSet A00 = AbstractC167027dH.A0S("DIRECT", "INDIRECT", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);

    public static final Set getSet() {
        return A00;
    }
}
