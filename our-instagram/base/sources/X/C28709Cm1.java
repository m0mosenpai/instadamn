package X;

/* renamed from: X.Cm1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28709Cm1 implements C5Y6 {
    public final long A00;
    public final C5Y6 A01;

    @Override // X.C5Y6
    /* renamed from: FDZ */
    public final C62F FDa(InterfaceC118485Xk interfaceC118485Xk) {
        return new C28715Cm7(this.A01.FDa(interfaceC118485Xk), this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C28709Cm1)) {
            return false;
        }
        C28709Cm1 c28709Cm1 = (C28709Cm1) obj;
        if (c28709Cm1.A00 != this.A00) {
            return false;
        }
        return AbstractC25231BEo.A1Z(c28709Cm1.A01, this.A01, false);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC25228BEl.A03(this.A00);
    }

    public C28709Cm1(C5Y6 c5y6, long j) {
        this.A01 = c5y6;
        this.A00 = j;
    }
}
