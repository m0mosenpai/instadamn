package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H4K extends C0T6 implements JMJ {
    public final int A00;
    public final JKE A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.JMJ
    public final H4K Ewv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4K) {
                H4K h4k = (H4K) obj;
                if (!C14360o3.A0K(this.A01, h4k.A01) || !C14360o3.A0K(this.A02, h4k.A02) || !C14360o3.A0K(this.A03, h4k.A03) || this.A00 != h4k.A00 || !C14360o3.A0K(this.A04, h4k.A04) || !C14360o3.A0K(this.A05, h4k.A05) || !C14360o3.A0K(this.A06, h4k.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMJ
    public final JKE ArR() {
        return this.A01;
    }

    @Override // X.JMJ
    public final String BVC() {
        return this.A02;
    }

    @Override // X.JMJ
    public final String BVH() {
        return this.A03;
    }

    @Override // X.JMJ
    public final int BVI() {
        return this.A00;
    }

    @Override // X.JMJ
    public final String BVK() {
        return this.A04;
    }

    @Override // X.JMJ
    public final String BVL() {
        return this.A05;
    }

    @Override // X.JMJ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMultiAdsInfo", AbstractC40093HqK.A00(this));
    }

    @Override // X.JMJ
    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public H4K(JKE jke, String str, String str2, String str3, String str4, String str5, int i) {
        this.A01 = jke;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
