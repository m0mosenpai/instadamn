package X;

import java.util.List;

/* renamed from: X.Bfr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26063Bfr extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C26063Bfr(EnumC46199Kcb enumC46199Kcb, Integer num) {
        this.A00 = 1;
        this.A00 = 1;
        this.A02 = enumC46199Kcb;
        this.A01 = num;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A03 = null;
    }

    public final boolean equals(Object obj) {
        C26063Bfr c26063Bfr;
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C26063Bfr)) {
                        return false;
                    }
                    c26063Bfr = (C26063Bfr) obj;
                    if (c26063Bfr.A00 != 0 || !C14360o3.A0K(this.A02, c26063Bfr.A02) || this.A04 != c26063Bfr.A04 || this.A05 != c26063Bfr.A05 || !C14360o3.A0K(this.A01, c26063Bfr.A01)) {
                        return false;
                    }
                    z = this.A06;
                    z2 = c26063Bfr.A06;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C26063Bfr)) {
                        return false;
                    }
                    c26063Bfr = (C26063Bfr) obj;
                    if (c26063Bfr.A00 != 1 || this.A02 != c26063Bfr.A02 || this.A01 != c26063Bfr.A01 || this.A06 != c26063Bfr.A06 || this.A05 != c26063Bfr.A05) {
                        return false;
                    }
                    z = this.A04;
                    z2 = c26063Bfr.A04;
                    break;
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof C26063Bfr) {
                        C26063Bfr c26063Bfr2 = (C26063Bfr) obj;
                        if (c26063Bfr2.A00 != 2 || !C14360o3.A0K(this.A03, c26063Bfr2.A03) || !C14360o3.A0K(this.A02, c26063Bfr2.A02) || !C14360o3.A0K(this.A01, c26063Bfr2.A01) || this.A06 != c26063Bfr2.A06 || this.A05 != c26063Bfr2.A05 || this.A04 != c26063Bfr2.A04) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
        }
        if (z != z2 || !C14360o3.A0K(this.A03, c26063Bfr.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int A07;
        String str;
        switch (this.A00) {
            case 0:
                A0D = AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0G(this.A02))) + AbstractC167017dG.A0M(this.A01)) * 31);
                A07 = AbstractC25227BEk.A07(this.A03);
                break;
            case 1:
                int A0G = AbstractC166987dD.A0G(this.A02);
                int A0H = AbstractC166987dD.A0H(this.A01);
                if (1 != A0H) {
                    str = "DEFAULT";
                } else {
                    str = "REPLY_CONTROL";
                }
                A07 = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC25231BEo.A0H(str, A0H, A0G))));
                A0D = AbstractC167017dG.A0O(this.A03);
                break;
            default:
                A07 = AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)))));
                A0D = 1237;
                if (this.A04) {
                    A0D = 1231;
                    break;
                }
                break;
        }
        return A0D + A07;
    }

    public C26063Bfr(String str, List list, java.util.Set set, boolean z, boolean z2, boolean z3) {
        this.A00 = 2;
        this.A03 = str;
        this.A02 = list;
        this.A01 = set;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    public C26063Bfr(Boolean bool, String str, List list, boolean z, boolean z2) {
        this.A00 = 0;
        this.A02 = list;
        this.A04 = false;
        this.A05 = z;
        this.A01 = bool;
        this.A06 = z2;
        this.A03 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26063Bfr() {
        this(false, null, C16930sl.A00, false, false);
        this.A00 = 0;
    }
}
