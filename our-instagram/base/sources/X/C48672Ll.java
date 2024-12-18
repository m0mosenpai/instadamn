package X;

import android.app.Activity;

/* renamed from: X.2Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48672Ll {
    public AnonymousClass195 A00;
    public final C12N A01;

    public C48672Ll(C12N c12n) {
        C14360o3.A0B(c12n, 1);
        this.A01 = c12n;
    }

    public final void A00(Activity activity, C07X c07x, InterfaceC57292k4 interfaceC57292k4, boolean z) {
        C12W AOT;
        C12N c12n = this.A01;
        if (z) {
            AOT = ((C12M) c12n).A04;
        } else {
            AOT = c12n.AOT(649326681, 3);
        }
        C57312k6 A00 = C07Y.A00(c07x);
        this.A00 = AbstractC23641Du.A03(C05F.A00, AOT, new C9DG(c07x, activity, interfaceC57292k4, null, 10), A00);
    }

    public C48672Ll() {
        this(C12L.A00);
    }
}
