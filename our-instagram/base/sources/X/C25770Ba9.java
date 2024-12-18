package X;

/* renamed from: X.Ba9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25770Ba9 extends C2DC {
    public float A00 = 1.0f;
    public C5YV A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25770Ba9) {
                long j = this.A02;
                long j2 = ((C25770Ba9) obj).A02;
                long j3 = C1132359l.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C2DC
    public final void A04(InterfaceC1128857w interfaceC1128857w) {
        long j = this.A02;
        float f = this.A00;
        interfaceC1128857w.AR1(this.A01, C119815bf.A00, f, 3, j, 0L, AbstractC25228BEl.A0H(interfaceC1128857w));
    }

    @Override // X.C2DC
    public final boolean A05(float f) {
        this.A00 = f;
        return true;
    }

    @Override // X.C2DC
    public final boolean A06(C5YV c5yv) {
        this.A01 = c5yv;
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = C1132359l.A01;
        return AbstractC25228BEl.A03(j);
    }

    public C25770Ba9(long j) {
        this.A02 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ColorPainter(color=");
        return AbstractC167017dG.A0o(C1132359l.A06(this.A02), A1C);
    }

    @Override // X.C2DC
    public final long A03() {
        return 9205357640488583168L;
    }
}
