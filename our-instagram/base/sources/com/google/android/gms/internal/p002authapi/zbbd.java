package com.google.android.gms.internal.p002authapi;

import X.C0f9;
import X.C58411Pup;
import X.S2N;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes10.dex */
public final class zbbd extends IStatusCallback.Stub {
    public final /* synthetic */ C58411Pup A00;

    public zbbd(C58411Pup c58411Pup) {
        this.A00 = c58411Pup;
        C0f9.A0A(2145761355, C0f9.A03(-718974564));
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void Dh0(Status status) {
        int A03 = C0f9.A03(-1397589357);
        S2N.A00(status, this.A00, null);
        C0f9.A0A(386645592, A03);
    }
}
