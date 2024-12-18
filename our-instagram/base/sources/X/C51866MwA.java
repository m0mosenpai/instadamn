package X;

/* renamed from: X.MwA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51866MwA extends C0T6 implements InterfaceC57855PlL {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51866MwA) {
                C51866MwA c51866MwA = (C51866MwA) obj;
                if (!C14360o3.A0K(this.A00, c51866MwA.A00) || this.A01 != c51866MwA.A01 || this.A04 != c51866MwA.A04 || this.A02 != c51866MwA.A02 || this.A03 != c51866MwA.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A01, AbstractC167017dG.A0O(this.A00) * 31 * 31))));
    }

    public C51866MwA(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = str;
        this.A01 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A03 = z4;
    }
}
