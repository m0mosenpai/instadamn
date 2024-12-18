package X;

/* loaded from: classes10.dex */
public final class Q0I extends Q0J {
    public final Q0E A00;
    public final C64517THk A01;
    public final long A02;
    public final EnumC58683Pzw A03;
    public final Runnable A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q0I) {
                Q0I q0i = (Q0I) obj;
                if (!C14360o3.A0K(this.A00, q0i.A00) || !C14360o3.A0K(this.A01, q0i.A01) || this.A02 != q0i.A02 || this.A03 != q0i.A03 || !C14360o3.A0K(this.A04, q0i.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC25236BEt.A01(this.A02, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC166997dE.A0I(this.A04);
    }

    public Q0I(Q0E q0e, EnumC58683Pzw enumC58683Pzw, C64517THk c64517THk, Runnable runnable, long j) {
        super(enumC58683Pzw, runnable, j);
        this.A00 = q0e;
        this.A01 = c64517THk;
        this.A02 = j;
        this.A03 = enumC58683Pzw;
        this.A04 = runnable;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CachedComponentQueryResponse(response=");
        A1C.append(this.A00);
        A1C.append(", resources=");
        A1C.append(this.A01);
        A1C.append(", responseTimestampMs=");
        A1C.append(this.A02);
        A1C.append(", queryPurpose=");
        A1C.append(this.A03);
        A1C.append(", cleanup=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
