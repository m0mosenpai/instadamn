package X;

/* renamed from: X.1K0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1K0 {
    public int A00;
    public long A01;
    public final int A02;

    public final void A00(int i) {
        int i2 = this.A02;
        if (i >= i2) {
            this.A01 += i;
            this.A00++;
            AbstractC09800fd.A03("StallTracker.onDetectedST%d", Integer.valueOf(i2), -248855518);
            AbstractC09800fd.A00(370040885);
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new C1K0(this.A02, this.A00, this.A01);
    }

    public C1K0(int i, int i2, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = j;
    }
}
