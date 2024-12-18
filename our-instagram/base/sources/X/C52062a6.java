package X;

import android.os.SystemClock;

/* renamed from: X.2a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52062a6 implements InterfaceC19960yQ {
    public static final C52062a6 A00 = new C52062a6();

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C138986Rf c138986Rf = (C138986Rf) obj;
        C51672Yp c51672Yp = C51652Yn.A02;
        if (c51672Yp != null) {
            C14360o3.A0B(c138986Rf, 0);
            if (c51672Yp.A02 == null) {
                long j = c138986Rf.A00;
                C1KO c1ko = c51672Yp.A06;
                long j2 = c1ko.A00;
                if (j > j2) {
                    c51672Yp.A02 = new C51792Zc((System.currentTimeMillis() - SystemClock.uptimeMillis()) + j2, c1ko.A01, c138986Rf.A04);
                }
            }
        }
        return C0eB.A00;
    }
}
