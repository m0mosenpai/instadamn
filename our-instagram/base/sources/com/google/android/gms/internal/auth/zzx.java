package com.google.android.gms.internal.auth;

import X.C0f9;
import X.C58411Pup;
import X.RGY;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes10.dex */
public final class zzx extends IStatusCallback.Stub {
    public final /* synthetic */ C58411Pup A00;

    public zzx(C58411Pup c58411Pup) {
        this.A00 = c58411Pup;
        C0f9.A0A(620593635, C0f9.A03(-1029619808));
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void Dh0(Status status) {
        int A03 = C0f9.A03(-825792969);
        RGY.A02(status, this.A00, null);
        C0f9.A0A(-1050853202, A03);
    }
}
