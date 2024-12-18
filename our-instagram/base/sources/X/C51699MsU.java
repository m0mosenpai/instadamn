package X;

/* renamed from: X.MsU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51699MsU extends C0T6 {
    public Object A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    public C51699MsU(C56803PIu c56803PIu, String str, boolean z, boolean z2, boolean z3) {
        this.A05 = 1;
        C14360o3.A0B(str, 5);
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A00 = c56803PIu;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A05 != 0) {
            if (this != obj) {
                if (obj instanceof C51699MsU) {
                    C51699MsU c51699MsU = (C51699MsU) obj;
                    if (c51699MsU.A05 != 1 || this.A03 != c51699MsU.A03 || this.A02 != c51699MsU.A02 || this.A04 != c51699MsU.A04 || !C14360o3.A0K(this.A00, c51699MsU.A00) || !C14360o3.A0K(this.A01, c51699MsU.A01)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51699MsU)) {
                return false;
            }
            C51699MsU c51699MsU2 = (C51699MsU) obj;
            if (c51699MsU2.A05 != 0 || this.A02 != c51699MsU2.A02 || this.A03 != c51699MsU2.A03 || this.A00 != c51699MsU2.A00 || !C14360o3.A0K(this.A01, c51699MsU2.A01) || this.A04 != c51699MsU2.A04) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int i;
        if (this.A05 != 0) {
            int i2 = 1237;
            if (this.A03) {
                i2 = 1231;
            }
            A0K = (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A02, i2 * 31)) + AbstractC167017dG.A0M(this.A00)) * 31;
            i = this.A01.hashCode();
        } else {
            int i3 = 1237;
            if (this.A02) {
                i3 = 1231;
            }
            A0K = AbstractC166997dE.A0K(this.A01, (AbstractC167007dF.A0D(this.A03, i3 * 31) + AbstractC167017dG.A0M(this.A00)) * 31);
            i = 1237;
            if (this.A04) {
                i = 1231;
            }
        }
        return A0K + i;
    }

    public C51699MsU() {
        this.A05 = 0;
        this.A05 = 0;
        this.A02 = false;
        this.A03 = false;
        this.A00 = null;
        this.A01 = "";
        this.A04 = false;
    }
}
