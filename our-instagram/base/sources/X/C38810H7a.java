package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H7a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38810H7a extends C0T6 implements JMY {
    public final C38321qM A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C38810H7a(C38321qM c38321qM, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(str4, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A05 = list;
        this.A00 = c38321qM;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // X.JMY
    public final C38810H7a F5L(C1DY c1dy) {
        return this;
    }

    @Override // X.JMY
    public final C38810H7a F5M(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38810H7a) {
                C38810H7a c38810H7a = (C38810H7a) obj;
                if (!C14360o3.A0K(this.A01, c38810H7a.A01) || !C14360o3.A0K(this.A02, c38810H7a.A02) || !C14360o3.A0K(this.A05, c38810H7a.A05) || !C14360o3.A0K(this.A00, c38810H7a.A00) || !C14360o3.A0K(this.A03, c38810H7a.A03) || !C14360o3.A0K(this.A04, c38810H7a.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMY
    public final String BDG() {
        return this.A01;
    }

    @Override // X.JMY
    public final String BGQ() {
        return this.A02;
    }

    @Override // X.JMY
    public final List BHh() {
        return this.A05;
    }

    @Override // X.JMY
    public final C38321qM BlZ() {
        return this.A00;
    }

    @Override // X.JMY
    public final String C3F() {
        return this.A03;
    }

    @Override // X.JMY
    public final String C5f() {
        return this.A04;
    }

    @Override // X.JMY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTEmptyStoryStateCardData", AbstractC40697I2d.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, ((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31);
    }

    @Override // X.JMY
    public final JMY EBb(C1DY c1dy) {
        return this;
    }
}
