package X;

/* renamed from: X.TWi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64842TWi implements InterfaceC65677Tr7 {
    public int A00;
    public long A01;
    public C63304ShA A02;
    public boolean A03;
    public final TWX A04;
    public final InterfaceC65701TsN A05;

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.A03 = true;
    }

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        C63304ShA c63304ShA;
        C63304ShA c63304ShA2;
        if (j >= 0) {
            if (!this.A03) {
                C63304ShA c63304ShA3 = this.A02;
                if (c63304ShA3 == null || (c63304ShA3 == (c63304ShA2 = this.A04.A01) && this.A00 == c63304ShA2.A01)) {
                    if (j == 0) {
                        return 0L;
                    }
                    if (!this.A05.EIz(this.A01 + 1)) {
                        return -1L;
                    }
                    if (this.A02 == null && (c63304ShA = this.A04.A01) != null) {
                        this.A02 = c63304ShA;
                        this.A00 = c63304ShA.A01;
                    }
                    TWX twx2 = this.A04;
                    long j2 = twx2.A00;
                    long j3 = this.A01;
                    long min = Math.min(j, j2 - j3);
                    twx2.A0H(twx, j3, min);
                    this.A01 += min;
                    return min;
                }
                throw AbstractC166987dD.A14("Peek source is invalid because upstream source was used");
            }
            throw AbstractC58321PtD.A0k();
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A05.Eq9();
    }

    public C64842TWi(InterfaceC65701TsN interfaceC65701TsN) {
        int i;
        this.A05 = interfaceC65701TsN;
        TWX AEK = interfaceC65701TsN.AEK();
        this.A04 = AEK;
        C63304ShA c63304ShA = AEK.A01;
        this.A02 = c63304ShA;
        if (c63304ShA != null) {
            i = c63304ShA.A01;
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
