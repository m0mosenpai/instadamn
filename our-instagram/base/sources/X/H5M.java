package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H5M extends C0T6 implements JMM {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.JMM
    public final H5M Ezz() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5M) {
                H5M h5m = (H5M) obj;
                if (!C14360o3.A0K(this.A00, h5m.A00) || !C14360o3.A0K(this.A01, h5m.A01) || !C14360o3.A0K(this.A02, h5m.A02) || !C14360o3.A0K(this.A03, h5m.A03) || !C14360o3.A0K(this.A04, h5m.A04) || !C14360o3.A0K(this.A05, h5m.A05) || !C14360o3.A0K(this.A06, h5m.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMM
    public final String AcD() {
        return this.A00;
    }

    @Override // X.JMM
    public final String AcG() {
        return this.A01;
    }

    @Override // X.JMM
    public final String BNL() {
        return this.A04;
    }

    @Override // X.JMM
    public final String Bfx() {
        return this.A06;
    }

    @Override // X.JMM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryAppAttributionDict", AbstractC40266HtW.A00(this));
    }

    @Override // X.JMM
    public final String getContentUrl() {
        return this.A02;
    }

    @Override // X.JMM
    public final String getId() {
        return this.A03;
    }

    @Override // X.JMM
    public final String getName() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public H5M(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }
}