package X;

import java.lang.ref.WeakReference;

/* renamed from: X.VsA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69607VsA {
    public VaZ A00;
    public VaZ A01;
    public WeakReference A02;
    public WeakReference A03;
    public final String A04;

    public final void A00(VaZ vaZ) {
        C66340UAd c66340UAd;
        C66340UAd c66340UAd2;
        WeakReference weakReference = this.A02;
        if (weakReference != null && (c66340UAd2 = (C66340UAd) weakReference.get()) != null) {
            c66340UAd2.A06(vaZ);
        } else {
            this.A00 = vaZ;
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 != null && (c66340UAd = (C66340UAd) weakReference2.get()) != null) {
            c66340UAd.A06(vaZ);
        } else {
            this.A01 = vaZ;
        }
    }

    public C69607VsA(String str) {
        this.A04 = str;
    }
}
