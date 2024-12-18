package X;

/* loaded from: classes12.dex */
public final class XVU extends C0T6 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public XVU(String str, String str2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XVU) {
                XVU xvu = (XVU) obj;
                if (!C14360o3.A0K(this.A00, xvu.A00) || !C14360o3.A0K(this.A01, xvu.A01) || this.A03 != xvu.A03 || this.A04 != xvu.A04 || this.A02 != xvu.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (A0K + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }
}
