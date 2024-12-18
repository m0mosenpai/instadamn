package X;

/* renamed from: X.GzE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38673GzE extends C0T6 {
    public final boolean A00;
    public final VHi A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38673GzE) {
                C38673GzE c38673GzE = (C38673GzE) obj;
                if (this.A00 != c38673GzE.A00 || this.A01 != c38673GzE.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    public C38673GzE(VHi vHi, boolean z) {
        this.A00 = z;
        this.A01 = vHi;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RedirectResult(isFallback=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(295));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C38673GzE() {
        this(null, true);
    }
}
