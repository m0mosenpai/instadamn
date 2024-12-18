package X;

/* renamed from: X.3m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82383m1 {
    public Long A06;
    public String A07;
    public long A04 = 0;
    public long A05 = 0;
    public long A02 = 0;
    public long A08 = -1;
    public long A03 = -1;
    public int A00 = 0;
    public int A01 = 0;

    public static void A00(C82383m1 c82383m1, long j) {
        long j2 = c82383m1.A08;
        if (j2 >= 0) {
            long j3 = j - j2;
            c82383m1.A05 += j3;
            c82383m1.A04 = Math.max(c82383m1.A04, j3);
            c82383m1.A08 = -1L;
        }
    }

    public final long A01(InterfaceC57162jr interfaceC57162jr) {
        long j = this.A08;
        long j2 = this.A05;
        if (j >= 0) {
            return (j2 + interfaceC57162jr.BmE()) - j;
        }
        return j2;
    }

    public final void A02() {
        this.A04 = 0L;
        this.A05 = 0L;
        this.A02 = 0L;
    }

    public final void A03(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        float CGk = interfaceC57162jr.CGk(c59062n7);
        long j = this.A08;
        if (j < 0 && CGk >= 0.5f) {
            this.A08 = interfaceC57162jr.BmE();
        } else if (j >= 0 && CGk < 0.5f) {
            A00(this, interfaceC57162jr.BmE());
        }
        if (this.A03 < 0 && CGk >= 0.5f) {
            this.A03 = interfaceC57162jr.BmE();
        }
        this.A00 = interfaceC57162jr.BQL(c59062n7);
        this.A01 = interfaceC57162jr.BQM(c59062n7);
        this.A07 = C1QM.A00.A02.A00;
    }

    public final void A04(InterfaceC57162jr interfaceC57162jr) {
        long BmE = interfaceC57162jr.BmE();
        long j = this.A03;
        if (j > 0) {
            this.A02 = BmE - j;
            this.A03 = -1L;
        }
        A00(this, BmE);
    }
}
