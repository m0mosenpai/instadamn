package X;

import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;

/* renamed from: X.Bfu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26066Bfu extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C26066Bfu(MUW muw, C5QE c5qe, C5QE c5qe2, C5QE c5qe3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = 0;
        c5qe = (i & 1) != 0 ? null : c5qe;
        c5qe2 = (i & 2) != 0 ? null : c5qe2;
        c5qe3 = (i & 4) != 0 ? null : c5qe3;
        boolean A1U = AbstractC25226BEj.A1U(i & 8, z);
        boolean A1U2 = AbstractC25226BEj.A1U(i & 16, z2);
        boolean A1U3 = AbstractC25226BEj.A1U(i & 32, z3);
        boolean A1U4 = AbstractC25226BEj.A1U(i & 64, z4);
        boolean A1U5 = AbstractC25226BEj.A1U(i & 256, z5);
        boolean z7 = (i & 512) == 0 ? z6 : false;
        MUW muw2 = (i & 1024) == 0 ? muw : null;
        this.A00 = 0;
        this.A03 = c5qe;
        this.A02 = c5qe2;
        this.A04 = c5qe3;
        this.A0B = A1U;
        this.A07 = A1U2;
        this.A0A = A1U3;
        this.A09 = A1U4;
        this.A01 = null;
        this.A08 = A1U5;
        this.A06 = z7;
        this.A05 = muw2;
    }

    public static /* synthetic */ C26066Bfu A00(C5C3 c5c3, C26066Bfu c26066Bfu, C27915CSa c27915CSa, WallPostItem wallPostItem, WallText wallText, int i, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C5C3 c5c32 = c5c3;
        WallText wallText2 = wallText;
        boolean z7 = z2;
        boolean z8 = z;
        C27915CSa c27915CSa2 = c27915CSa;
        WallPostItem wallPostItem2 = wallPostItem;
        WallText wallText3 = null;
        if ((i & 1) != 0) {
            wallPostItem2 = (WallPostItem) c26066Bfu.A02;
        }
        if ((i & 2) != 0) {
            wallText3 = (WallText) c26066Bfu.A03;
        }
        if ((i & 4) != 0) {
            z3 = c26066Bfu.A07;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            c27915CSa2 = (C27915CSa) c26066Bfu.A01;
        }
        if ((i & 16) != 0) {
            z8 = c26066Bfu.A0B;
        }
        if ((i & 32) != 0) {
            z4 = c26066Bfu.A08;
        } else {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z7 = c26066Bfu.A06;
        }
        if ((i & 128) != 0) {
            wallText2 = (WallText) c26066Bfu.A04;
        }
        if ((i & 256) != 0) {
            z5 = c26066Bfu.A0A;
        } else {
            z5 = false;
        }
        if ((i & 512) != 0) {
            z6 = c26066Bfu.A09;
        } else {
            z6 = false;
        }
        if ((i & 1024) != 0) {
            c5c32 = (C5C3) c26066Bfu.A05;
        }
        AbstractC167017dG.A1N(wallPostItem2, wallText3);
        AbstractC25229BEm.A1J(wallText2, 7, c5c32);
        return new C26066Bfu(c5c32, c27915CSa2, wallPostItem2, wallText3, wallText2, z3, z8, z4, z7, z5, z6);
    }

    public final boolean equals(Object obj) {
        C26066Bfu c26066Bfu;
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26066Bfu) {
                    c26066Bfu = (C26066Bfu) obj;
                    if (c26066Bfu.A00 == 1 && C14360o3.A0K(this.A02, c26066Bfu.A02) && C14360o3.A0K(this.A03, c26066Bfu.A03) && this.A07 == c26066Bfu.A07 && C14360o3.A0K(this.A01, c26066Bfu.A01) && this.A0B == c26066Bfu.A0B && this.A08 == c26066Bfu.A08 && this.A06 == c26066Bfu.A06 && C14360o3.A0K(this.A04, c26066Bfu.A04) && this.A0A == c26066Bfu.A0A) {
                        z = this.A09;
                        z2 = c26066Bfu.A09;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C26066Bfu)) {
                return false;
            }
            c26066Bfu = (C26066Bfu) obj;
            if (c26066Bfu.A00 != 0 || !C14360o3.A0K(this.A03, c26066Bfu.A03) || !C14360o3.A0K(this.A02, c26066Bfu.A02) || !C14360o3.A0K(this.A04, c26066Bfu.A04) || this.A0B != c26066Bfu.A0B || this.A07 != c26066Bfu.A07 || this.A0A != c26066Bfu.A0A || this.A09 != c26066Bfu.A09 || !C14360o3.A0K(this.A01, c26066Bfu.A01) || this.A08 != c26066Bfu.A08) {
                return false;
            }
            z = this.A06;
            z2 = c26066Bfu.A06;
        } else {
            return true;
        }
        if (z != z2 || !C14360o3.A0K(this.A05, c26066Bfu.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return AbstractC166987dD.A0I(this.A05, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02))) + AbstractC167017dG.A0M(this.A01)) * 31)))))));
        }
        return AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0B, ((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31)))) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC166997dE.A0I(this.A05);
    }

    public C26066Bfu(C5C3 c5c3, C27915CSa c27915CSa, WallPostItem wallPostItem, WallText wallText, WallText wallText2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = 1;
        this.A02 = wallPostItem;
        this.A03 = wallText;
        this.A07 = z;
        this.A01 = c27915CSa;
        this.A0B = z2;
        this.A08 = z3;
        this.A06 = z4;
        this.A04 = wallText2;
        this.A0A = z5;
        this.A09 = z6;
        this.A05 = c5c3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26066Bfu(WallPostItem wallPostItem, WallText wallText, WallText wallText2, boolean z, boolean z2, boolean z3) {
        this(AbstractC25227BEk.A0S(""), (C27915CSa) null, wallPostItem, wallText, wallText2, z, false, z2, true, z3, AbstractC25225BEi.A1a(wallText2, C28154Cb1.A00));
        this.A00 = 1;
    }
}
