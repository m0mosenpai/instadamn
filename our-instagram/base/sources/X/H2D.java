package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H2D extends C0T6 implements JMH {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.JMH
    public final H2D Eqk() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2D) {
                H2D h2d = (H2D) obj;
                if (!C14360o3.A0K(this.A00, h2d.A00) || !C14360o3.A0K(this.A01, h2d.A01) || !C14360o3.A0K(this.A02, h2d.A02) || !C14360o3.A0K(this.A03, h2d.A03) || !C14360o3.A0K(this.A04, h2d.A04) || !C14360o3.A0K(this.A05, h2d.A05) || !C14360o3.A0K(this.A06, h2d.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMH
    public final String BEj() {
        return this.A02;
    }

    @Override // X.JMH
    public final String BEk() {
        return this.A03;
    }

    @Override // X.JMH
    public final String Byf() {
        return this.A05;
    }

    @Override // X.JMH
    public final String CEq() {
        return this.A06;
    }

    @Override // X.JMH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAfiInterestData", AbstractC39737Hk7.A00(this));
    }

    @Override // X.JMH
    public final String getDisplayName() {
        return this.A00;
    }

    @Override // X.JMH
    public final String getEmoji() {
        return this.A01;
    }

    @Override // X.JMH
    public final String getName() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public H2D(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }
}
