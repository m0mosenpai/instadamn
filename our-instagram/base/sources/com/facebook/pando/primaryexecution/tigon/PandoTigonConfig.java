package com.facebook.pando.primaryexecution.tigon;

import X.C14360o3;
import X.C25101B8x;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PandoTigonConfig {
    public final boolean enableUnsetFieldRemoval;
    public final boolean failNetworkOnZeroTimeout;
    public final InterfaceC16660sJ headers;
    public final InterfaceC16820sZ requestUrl;
    public final boolean shouldGzipCompressBody;

    public /* synthetic */ PandoTigonConfig(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C25101B8x.A00 : interfaceC16660sJ, (i & 2) != 0 ? null : interfaceC16820sZ, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? z3 : false);
    }

    public final Map getHeaders(String str) {
        C14360o3.A0B(str, 0);
        return (Map) this.headers.invoke(str);
    }

    public final boolean getEnableUnsetFieldRemoval() {
        return this.enableUnsetFieldRemoval;
    }

    public final boolean getFailNetworkOnZeroTimeout() {
        return this.failNetworkOnZeroTimeout;
    }

    public final String getRequestUrl() {
        InterfaceC16820sZ interfaceC16820sZ = this.requestUrl;
        if (interfaceC16820sZ != null) {
            return (String) interfaceC16820sZ.invoke();
        }
        return null;
    }

    public final boolean getShouldGzipCompressBody() {
        return this.shouldGzipCompressBody;
    }

    public PandoTigonConfig(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.headers = interfaceC16660sJ;
        this.requestUrl = interfaceC16820sZ;
        this.failNetworkOnZeroTimeout = z;
        this.enableUnsetFieldRemoval = z2;
        this.shouldGzipCompressBody = z3;
    }

    public PandoTigonConfig() {
        this(C25101B8x.A00, null, false, false, false);
    }
}
