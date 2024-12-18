package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TU7 implements Callable {
    public final int A00;
    public final String A01;

    public TU7(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1QW A00;
        C1QX c1qx;
        String str;
        switch (this.A00) {
            case 0:
                return this.A01;
            case 1:
                String str2 = this.A01;
                C26371Ps A0e = AbstractC58319PtB.A0e();
                A0e.A01(C05F.A0N);
                A0e.A02(str2);
                A0e.A05 = false;
                A00 = A0e.A00();
                c1qx = new C1QX();
                c1qx.A04 = EnumC23341Bw.Other;
                c1qx.A03 = C1Ef.OffScreen;
                c1qx.A07 = C05F.A01;
                str = "carrier_signal";
                c1qx.A0A = str;
                return AbstractC58319PtB.A0d(A00, c1qx);
            default:
                String str3 = this.A01;
                C26371Ps A0e2 = AbstractC58319PtB.A0e();
                A0e2.A01(C05F.A0N);
                A0e2.A02(str3);
                A0e2.A05 = false;
                A00 = A0e2.A00();
                c1qx = new C1QX();
                c1qx.A04 = EnumC23341Bw.Other;
                c1qx.A03 = C1Ef.OffScreen;
                c1qx.A07 = C05F.A01;
                str = "zbd_ping";
                c1qx.A0A = str;
                return AbstractC58319PtB.A0d(A00, c1qx);
        }
    }
}
