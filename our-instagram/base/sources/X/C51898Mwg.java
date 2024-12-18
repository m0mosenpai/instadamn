package X;

/* renamed from: X.Mwg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51898Mwg extends C0T6 implements InterfaceC57856PlM {
    public final float A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51898Mwg) {
                C51898Mwg c51898Mwg = (C51898Mwg) obj;
                if (this.A01 != c51898Mwg.A01 || Float.compare(this.A00, c51898Mwg.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + Float.floatToIntBits(this.A00);
    }

    public C51898Mwg(boolean z, float f) {
        this.A01 = z;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallBottomSheetViewModel(show=");
        A1C.append(this.A01);
        A1C.append(", translationY=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
