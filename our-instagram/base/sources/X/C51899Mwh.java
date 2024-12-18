package X;

/* renamed from: X.Mwh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51899Mwh extends C0T6 implements InterfaceC57856PlM {
    public final Boolean A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51899Mwh) {
                C51899Mwh c51899Mwh = (C51899Mwh) obj;
                if (this.A03 != c51899Mwh.A03 || !C14360o3.A0K(this.A01, c51899Mwh.A01) || this.A02 != c51899Mwh.A02 || !C14360o3.A0K(this.A00, c51899Mwh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, (AbstractC25225BEi.A08(this.A03) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C51899Mwh(Boolean bool, String str, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = str;
        this.A02 = z2;
        this.A00 = bool;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallArEffectsViewModel(shouldShowInstructions=");
        A1C.append(this.A03);
        A1C.append(", instructionText=");
        A1C.append(this.A01);
        A1C.append(", shouldAutoDismiss=");
        A1C.append(this.A02);
        A1C.append(", showArDeliveryDebugOverlay=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
