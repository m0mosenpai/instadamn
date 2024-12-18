package X;

/* renamed from: X.Cm3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28711Cm3 implements C5Y5 {
    public final int A00;
    public final long A01;
    public final InterfaceC31139Dme A02;
    public final Integer A03;

    @Override // X.C5Y6
    /* renamed from: FDZ */
    public final /* bridge */ /* synthetic */ C62F FDa(InterfaceC118485Xk interfaceC118485Xk) {
        return new C28714Cm6(this.A02.FDa(interfaceC118485Xk), this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C28711Cm3)) {
            return false;
        }
        C28711Cm3 c28711Cm3 = (C28711Cm3) obj;
        if (c28711Cm3.A00 != this.A00 || !C14360o3.A0K(c28711Cm3.A02, this.A02) || c28711Cm3.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A02, this.A00 * 31) - 1532807697) * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public C28711Cm3(InterfaceC31139Dme interfaceC31139Dme, Integer num, int i, long j) {
        this.A00 = i;
        this.A02 = interfaceC31139Dme;
        this.A03 = num;
        this.A01 = j;
    }
}
