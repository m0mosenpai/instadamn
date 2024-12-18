package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2G extends C0T6 implements C5FT {
    public final JK7 A00;
    public final AfiInterestsRecoStyle A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    @Override // X.C5FT
    public final H2G Eqn() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2G) {
                H2G h2g = (H2G) obj;
                if (!C14360o3.A0K(this.A04, h2g.A04) || !C14360o3.A0K(this.A02, h2g.A02) || !C14360o3.A0K(this.A07, h2g.A07) || !C14360o3.A0K(this.A03, h2g.A03) || !C14360o3.A0K(this.A00, h2g.A00) || this.A01 != h2g.A01 || !C14360o3.A0K(this.A05, h2g.A05) || !C14360o3.A0K(this.A06, h2g.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5FT
    public final String B30() {
        return this.A04;
    }

    @Override // X.C5FT
    public final Integer B33() {
        return this.A02;
    }

    @Override // X.C5FT
    public final List BJ1() {
        return this.A07;
    }

    @Override // X.C5FT
    public final Integer BY1() {
        return this.A03;
    }

    @Override // X.C5FT
    public final JK7 Bf6() {
        return this.A00;
    }

    @Override // X.C5FT
    public final AfiInterestsRecoStyle C33() {
        return this.A01;
    }

    @Override // X.C5FT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAfiInterestsRecoInfo", AbstractC39740HkC.A00(this));
    }

    @Override // X.C5FT
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // X.C5FT
    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public H2G(JK7 jk7, AfiInterestsRecoStyle afiInterestsRecoStyle, Integer num, Integer num2, String str, String str2, String str3, List list) {
        this.A04 = str;
        this.A02 = num;
        this.A07 = list;
        this.A03 = num2;
        this.A00 = jk7;
        this.A01 = afiInterestsRecoStyle;
        this.A05 = str2;
        this.A06 = str3;
    }
}
