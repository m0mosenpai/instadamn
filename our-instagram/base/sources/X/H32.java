package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H32 extends C0T6 implements JLN {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.JLN
    public final H32 Et1() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H32) {
                H32 h32 = (H32) obj;
                if (!C14360o3.A0K(this.A01, h32.A01) || !C14360o3.A0K(this.A02, h32.A02) || !C14360o3.A0K(this.A03, h32.A03) || !C14360o3.A0K(this.A00, h32.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLN
    public final String B4c() {
        return this.A01;
    }

    @Override // X.JLN
    public final String B4d() {
        return this.A02;
    }

    @Override // X.JLN
    public final String C70() {
        return this.A03;
    }

    @Override // X.JLN
    public final Boolean CCY() {
        return this.A00;
    }

    @Override // X.JLN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCrosspostMetadataDict", AbstractC39889Hmc.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H32(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = bool;
    }
}
