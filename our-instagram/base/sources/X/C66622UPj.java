package X;

import java.util.List;

/* renamed from: X.UPj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66622UPj extends C0T6 {
    public final QIw A00;
    public final C50627MWo A01;
    public final E71 A02;
    public final UQ6 A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66622UPj) {
                C66622UPj c66622UPj = (C66622UPj) obj;
                if (this.A07 != c66622UPj.A07 || this.A06 != c66622UPj.A06 || !C14360o3.A0K(this.A00, c66622UPj.A00) || !C14360o3.A0K(this.A01, c66622UPj.A01) || this.A05 != c66622UPj.A05 || !C14360o3.A0K(this.A03, c66622UPj.A03) || !C14360o3.A0K(this.A02, c66622UPj.A02) || !C14360o3.A0K(this.A04, c66622UPj.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        C50627MWo c50627MWo = this.A01;
        Number number = (Number) c50627MWo.A01;
        if (number != null) {
            UPG upg = (UPG) AbstractC001800i.A0O((List) c50627MWo.A00, number.intValue());
            if (upg != null) {
                int i = upg.A00;
                if (Integer.valueOf(i) != null) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final C51752Mtb A01() {
        C50627MWo c50627MWo = this.A01;
        Number number = (Number) c50627MWo.A01;
        if (number == null) {
            return null;
        }
        UPG upg = (UPG) AbstractC001800i.A0O((List) c50627MWo.A00, number.intValue());
        if (upg == null) {
            return null;
        }
        return upg.A01;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = 0;
        int A0D = (((AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A06, i * 31)))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        String str = this.A04;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0D + i2;
    }

    public C66622UPj(QIw qIw, C50627MWo c50627MWo, E71 e71, UQ6 uq6, String str, boolean z, boolean z2, boolean z3) {
        this.A07 = z;
        this.A06 = z2;
        this.A00 = qIw;
        this.A01 = c50627MWo;
        this.A05 = z3;
        this.A03 = uq6;
        this.A02 = e71;
        this.A04 = str;
    }
}
