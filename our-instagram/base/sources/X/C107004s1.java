package X;

/* renamed from: X.4s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107004s1 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;

    public final C123465iL A00() {
        int i = this.A00;
        if (i > 0) {
            long j = i;
            return new C123465iL(this.A09 / j, this.A04 / j, this.A01 / j, this.A05 / j, this.A03 / j, this.A07 / j, this.A02 / j, this.A06 / j, this.A08 / j);
        }
        return null;
    }

    public final void A01(C123465iL c123465iL) {
        this.A00++;
        this.A08 += c123465iL.A0B;
        this.A09 += c123465iL.A0C;
        this.A04 += c123465iL.A03;
        this.A01 += c123465iL.A00;
        this.A05 += c123465iL.A04;
        this.A03 += c123465iL.A02;
        this.A07 += c123465iL.A0A;
        this.A02 += c123465iL.A01;
        this.A06 += c123465iL.A08;
    }
}
