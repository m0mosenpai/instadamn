package com.google.android.gms.internal.p002authapi;

import X.C0f9;
import X.InterfaceC65248Tge;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes10.dex */
public final class zbk extends zbd {
    public final InterfaceC65248Tge A00;

    public zbk(InterfaceC65248Tge interfaceC65248Tge) {
        int A03 = C0f9.A03(-904703812);
        this.A00 = interfaceC65248Tge;
        C0f9.A0A(1821734319, A03);
    }

    @Override // com.google.android.gms.internal.p002authapi.zbs
    public final void FFI(Status status) {
        int A03 = C0f9.A03(1445723329);
        ((BasePendingResult) this.A00).A06(status);
        C0f9.A0A(-795241570, A03);
    }
}
