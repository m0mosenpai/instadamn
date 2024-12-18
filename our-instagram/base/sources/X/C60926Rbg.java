package X;

/* renamed from: X.Rbg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60926Rbg extends Q0J {
    public final C64517THk A00;
    public final long A01;
    public final EnumC58683Pzw A02;

    public C60926Rbg(EnumC58683Pzw enumC58683Pzw, C64517THk c64517THk, long j) {
        super(enumC58683Pzw, null, j);
        this.A00 = c64517THk;
        this.A01 = j;
        this.A02 = enumC58683Pzw;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60926Rbg) {
                C60926Rbg c60926Rbg = (C60926Rbg) obj;
                if (!C14360o3.A0K(this.A00, c60926Rbg.A00) || this.A01 != c60926Rbg.A01 || this.A02 != c60926Rbg.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC25236BEt.A01(this.A01, AbstractC167017dG.A0M(this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CachedComponentQueryResource(resources=");
        A1C.append(this.A00);
        A1C.append(", responseTimestampMs=");
        A1C.append(this.A01);
        A1C.append(", queryPurpose=");
        A1C.append(this.A02);
        A1C.append(", cleanup=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
