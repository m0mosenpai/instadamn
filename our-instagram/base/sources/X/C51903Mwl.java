package X;

/* renamed from: X.Mwl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51903Mwl extends C0T6 implements InterfaceC57856PlM {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51903Mwl) {
                C51903Mwl c51903Mwl = (C51903Mwl) obj;
                if (this.A00 != c51903Mwl.A00 || this.A01 != c51903Mwl.A01 || this.A03 != c51903Mwl.A03 || this.A02 != c51903Mwl.A02 || this.A04 != c51903Mwl.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A00)))));
    }

    public C51903Mwl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A04 = z5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallScreenViewModel(detectCallTouchInteractions=");
        A1C.append(this.A00);
        A1C.append(", detectCoWatchTouchInteractions=");
        A1C.append(this.A01);
        A1C.append(", detectRootTouchInteractions=");
        A1C.append(this.A03);
        A1C.append(", detectCoWatchVerticalSwipeInterations=");
        A1C.append(this.A02);
        A1C.append(", shouldLogPinchToZoomEndEvent=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }

    public C51903Mwl() {
        this(true, false, false, false, false);
    }
}
