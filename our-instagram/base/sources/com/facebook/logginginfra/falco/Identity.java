package com.facebook.logginginfra.falco;

import com.facebook.hyperthrift.HyperThriftBase;

/* loaded from: classes12.dex */
public final class Identity extends HyperThriftBase {
    public final AppScopedIdentity A03() {
        return (AppScopedIdentity) A00(1);
    }

    public final FacebookIdentity A04() {
        return (FacebookIdentity) A00(0);
    }
}
