package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TU9 implements Callable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public TU9(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("security_origin", this.A00);
        C26371Ps A0e = AbstractC58319PtB.A0e();
        A0e.A02(this.A01);
        A0e.A01(C05F.A01);
        A0e.A00 = c1Ee.A00(true);
        A0e.A05 = true;
        C1QW A00 = A0e.A00();
        C1QX A0J = MSY.A0J();
        A0J.A03 = C1Ef.OffScreen;
        A0J.A0A = "MetaCheckoutScript";
        return AbstractC58319PtB.A0d(A00, A0J);
    }
}
