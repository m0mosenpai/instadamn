package X;

import java.util.List;

/* renamed from: X.MtH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51734MtH extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C51734MtH(boolean z) {
        this("", C16930sl.A00, 0, false, false, false, z);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51734MtH) {
                    C51734MtH c51734MtH = (C51734MtH) obj;
                    if (c51734MtH.A00 != 1 || !C14360o3.A0K(this.A01, c51734MtH.A01) || !C14360o3.A0K(this.A02, c51734MtH.A02) || this.A04 != c51734MtH.A04 || this.A05 != c51734MtH.A05 || this.A03 != c51734MtH.A03 || this.A06 != c51734MtH.A06) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51734MtH)) {
                return false;
            }
            C51734MtH c51734MtH2 = (C51734MtH) obj;
            if (c51734MtH2.A00 != 0 || this.A03 != c51734MtH2.A03 || this.A04 != c51734MtH2.A04 || this.A05 != c51734MtH2.A05 || !C14360o3.A0K(this.A01, c51734MtH2.A01) || this.A06 != c51734MtH2.A06 || !C14360o3.A0K(this.A02, c51734MtH2.A02)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int hashCode;
        if (this.A00 != 0) {
            A0D = AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31)));
            hashCode = 1237;
            if (this.A06) {
                hashCode = 1231;
            }
        } else {
            A0D = AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03)))));
            hashCode = this.A02.hashCode();
        }
        return A0D + hashCode;
    }

    public C51734MtH(String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A01 = list;
        this.A06 = z4;
        this.A02 = str;
    }

    public C51734MtH(String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = list;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A06 = z4;
    }

    public C51734MtH() {
        this(null, C16930sl.A00, false, false, false, false);
    }
}
