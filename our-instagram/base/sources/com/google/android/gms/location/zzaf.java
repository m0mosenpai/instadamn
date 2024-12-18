package com.google.android.gms.location;

import X.AbstractC166997dE;
import X.C0f9;
import X.C58411Pup;
import X.Rk3;
import X.S2O;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzah;

/* loaded from: classes10.dex */
public final class zzaf extends zzah {
    public final /* synthetic */ C58411Pup A00;

    public zzaf(C58411Pup c58411Pup) {
        this.A00 = c58411Pup;
        C0f9.A0A(605604755, C0f9.A03(-118217745));
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void A71() {
        C0f9.A0A(-335086217, C0f9.A03(1789207193));
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void FFf(zzac zzacVar) {
        int i;
        int A03 = C0f9.A03(92142001);
        Status status = zzacVar.A00;
        if (status == null) {
            this.A00.A02(new Rk3(new Status(8, "Got null status from location service")));
            i = 71105108;
        } else {
            int i2 = status.A00;
            C58411Pup c58411Pup = this.A00;
            if (i2 == 0) {
                c58411Pup.A01(AbstractC166997dE.A0b());
                i = -201117324;
            } else {
                c58411Pup.A02(S2O.A00(status));
                i = 1863563781;
            }
        }
        C0f9.A0A(i, A03);
    }
}
