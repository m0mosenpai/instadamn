package X;

/* loaded from: classes5.dex */
public final class CW9 {
    public final InterfaceC1124355v A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW9) {
                CW9 cw9 = (CW9) obj;
                if (!C14360o3.A0K(this.A01, cw9.A01) || !C14360o3.A0K(this.A00, cw9.A00) || this.A03 != cw9.A03 || this.A02 != cw9.A02 || this.A04 != cw9.A04 || !C14360o3.A0K(this.A05, cw9.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01))))) + AbstractC167017dG.A0O(this.A05);
    }

    public CW9(InterfaceC1124355v interfaceC1124355v, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A00 = interfaceC1124355v;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A05 = str2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PendingStateUpdate(key=");
        A1C.append(this.A01);
        A1C.append(", updater=");
        A1C.append(this.A00);
        A1C.append(", isLayoutState=");
        A1C.append(this.A03);
        A1C.append(", isAsync=");
        A1C.append(this.A02);
        A1C.append(", isLazy=");
        A1C.append(this.A04);
        A1C.append(", attribution=");
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
