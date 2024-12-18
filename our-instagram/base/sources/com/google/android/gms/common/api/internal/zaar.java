package com.google.android.gms.common.api.internal;

import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.C0f9;
import X.C60664RGs;
import X.C64225T5a;
import X.T5W;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class zaar extends zac {
    public final WeakReference A00;

    public zaar(T5W t5w) {
        int A03 = C0f9.A03(-1157827430);
        this.A00 = AbstractC25225BEi.A16(t5w);
        C0f9.A0A(1919574501, A03);
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void FF0(zak zakVar) {
        int i;
        int A03 = C0f9.A03(1474510984);
        T5W t5w = (T5W) this.A00.get();
        if (t5w == null) {
            i = -1937852179;
        } else {
            C64225T5a c64225T5a = t5w.A0D;
            AbstractC166997dE.A1H(c64225T5a.A06, new C60664RGs(t5w, t5w, zakVar), 1);
            i = 579599609;
        }
        C0f9.A0A(i, A03);
    }
}
