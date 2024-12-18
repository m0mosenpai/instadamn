package com.facebook.msys.util;

import X.C2NJ;
import X.InterfaceC49122Nj;

/* loaded from: classes3.dex */
public final class McfReferenceHolder implements InterfaceC49122Nj {
    public long nativeReference = 0;

    @Override // X.InterfaceC49122Nj
    public long getNativeReference() {
        return this.nativeReference;
    }

    static {
        C2NJ.A00();
    }

    private void setNativeReference(long j) {
        this.nativeReference = j;
    }
}
