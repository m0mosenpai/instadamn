package com.google.android.gms.fido.fido2;

import X.C0f9;
import X.C58411Pup;
import X.S2N;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;

/* loaded from: classes10.dex */
public final class zzf extends zzq {
    public final /* synthetic */ C58411Pup A00;

    public zzf(C58411Pup c58411Pup) {
        this.A00 = c58411Pup;
        C0f9.A0A(757084491, C0f9.A03(-1408985633));
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void FFx(PendingIntent pendingIntent, Status status) {
        int A03 = C0f9.A03(-855763818);
        S2N.A00(status, this.A00, pendingIntent);
        C0f9.A0A(1188374752, A03);
    }
}
