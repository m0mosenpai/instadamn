package X;

import java.util.concurrent.Callable;

/* renamed from: X.TTv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC64783TTv implements Callable {
    public final int A00;

    public CallableC64783TTv(int i) {
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.A00 != 0) {
            C26371Ps A0e = AbstractC58319PtB.A0e();
            A0e.A02("https://connect.facebook.net/en_US/iab.autofill.js");
            A0e.A01(C05F.A0N);
            A0e.A05 = true;
            C1QW A00 = A0e.A00();
            C1QX A0J = MSY.A0J();
            A0J.A03 = C1Ef.OffScreen;
            A0J.A0A = "AutofillScript";
            return AbstractC58319PtB.A0d(A00, A0J);
        }
        return null;
    }
}
