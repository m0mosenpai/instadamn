package X;

/* renamed from: X.XpA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72854XpA {
    public int A00;
    public long A01;
    public C72500XfE A02;
    public C72500XfE A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public final synchronized void A00() {
        this.A01 = 0L;
        this.A00 = 0;
        this.A06 = false;
        this.A05 = false;
        this.A02 = null;
        this.A03 = null;
        this.A04 = true;
    }

    public final synchronized void A01(long j) {
        C72500XfE c72500XfE = this.A03;
        if ((c72500XfE != null || (c72500XfE = this.A02) != null) && this.A06) {
            c72500XfE.A00 = j;
            this.A06 = false;
            this.A01 += j - c72500XfE.A02;
        }
    }
}
