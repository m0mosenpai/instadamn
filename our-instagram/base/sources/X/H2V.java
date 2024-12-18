package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2V extends C0T6 implements JM2 {
    public final BwPPostClickLandingExperineceType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Override // X.JM2
    public final H2V ErU() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2V) {
                H2V h2v = (H2V) obj;
                if (!C14360o3.A0K(this.A01, h2v.A01) || !C14360o3.A0K(this.A05, h2v.A05) || this.A00 != h2v.A00 || !C14360o3.A0K(this.A02, h2v.A02) || !C14360o3.A0K(this.A03, h2v.A03) || !C14360o3.A0K(this.A04, h2v.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM2
    public final String B8H() {
        return this.A01;
    }

    @Override // X.JM2
    public final List BEq() {
        return this.A05;
    }

    @Override // X.JM2
    public final BwPPostClickLandingExperineceType Beo() {
        return this.A00;
    }

    @Override // X.JM2
    public final String Bep() {
        return this.A02;
    }

    @Override // X.JM2
    public final String BgR() {
        return this.A03;
    }

    @Override // X.JM2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBuyWithPrimeInfo", AbstractC39788Hky.A00(this));
    }

    @Override // X.JM2
    public final String getSecondaryText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public H2V(BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A05 = list;
        this.A00 = bwPPostClickLandingExperineceType;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
