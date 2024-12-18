package com.google.android.play.core.review;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import android.app.PendingIntent;

/* loaded from: classes10.dex */
public final class zza extends ReviewInfo {
    public final PendingIntent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ReviewInfo) {
                zza zzaVar = (zza) ((ReviewInfo) obj);
                if (!this.A00.equals(zzaVar.A00) || this.A01 != zzaVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A00.hashCode() ^ 1000003) * 1000003;
        int i = 1231;
        if (true != this.A01) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.A00.toString();
        boolean z = this.A01;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ReviewInfo{pendingIntent=");
        A1C.append(obj);
        A1C.append(", isNoOp=");
        return AbstractC50523MSb.A0X(A1C, z);
    }

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.A00 = pendingIntent;
            this.A01 = z;
            return;
        }
        throw AbstractC166987dD.A15("Null pendingIntent");
    }
}
