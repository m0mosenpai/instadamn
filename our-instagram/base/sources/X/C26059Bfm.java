package X;

import com.instagram.wonderwall.model.WallInfo;
import java.util.List;

/* renamed from: X.Bfm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26059Bfm extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C26059Bfm(Long l, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = list;
        this.A02 = list2;
        this.A05 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A06 = z4;
        this.A04 = z5;
        this.A07 = z6;
        this.A01 = l;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26059Bfm) {
                    C26059Bfm c26059Bfm = (C26059Bfm) obj;
                    if (c26059Bfm.A00 != 1 || !C14360o3.A0K(this.A02, c26059Bfm.A02) || !C14360o3.A0K(this.A03, c26059Bfm.A03) || this.A09 != c26059Bfm.A09 || this.A06 != c26059Bfm.A06 || this.A07 != c26059Bfm.A07 || this.A08 != c26059Bfm.A08 || this.A04 != c26059Bfm.A04 || !C14360o3.A0K(this.A01, c26059Bfm.A01) || this.A05 != c26059Bfm.A05) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C26059Bfm)) {
                return false;
            }
            C26059Bfm c26059Bfm2 = (C26059Bfm) obj;
            if (c26059Bfm2.A00 != 0 || !C14360o3.A0K(this.A03, c26059Bfm2.A03) || !C14360o3.A0K(this.A02, c26059Bfm2.A02) || this.A05 != c26059Bfm2.A05 || this.A09 != c26059Bfm2.A09 || this.A08 != c26059Bfm2.A08 || this.A06 != c26059Bfm2.A06 || this.A04 != c26059Bfm2.A04 || this.A07 != c26059Bfm2.A07 || !C14360o3.A0K(this.A01, c26059Bfm2.A01)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int A0M;
        if (this.A00 != 0) {
            A0D = (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A09, (AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A03)) * 31))))) + AbstractC166997dE.A0I(this.A01)) * 31;
            A0M = 1237;
            if (this.A05) {
                A0M = 1231;
            }
        } else {
            A0D = AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03))))))));
            A0M = AbstractC167017dG.A0M(this.A01);
        }
        return A0D + A0M;
    }

    public C26059Bfm(C27915CSa c27915CSa, WallInfo wallInfo, C5Hc c5Hc, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = c5Hc;
        this.A03 = wallInfo;
        this.A09 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A04 = z5;
        this.A01 = c27915CSa;
        this.A05 = z6;
    }

    public C26059Bfm() {
        this((C27915CSa) null, (WallInfo) null, (C5Hc) C5HZ.A01, false, false, false, false, false, false);
    }
}
