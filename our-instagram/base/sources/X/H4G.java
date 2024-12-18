package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H4G extends C0T6 implements JL0 {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.JL0
    public final H4G Ewi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4G) {
                H4G h4g = (H4G) obj;
                if (!C14360o3.A0K(this.A00, h4g.A00) || !C14360o3.A0K(this.A01, h4g.A01) || !C14360o3.A0K(this.A02, h4g.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL0
    public final String AcQ() {
        return this.A00;
    }

    @Override // X.JL0
    public final String AyH() {
        return this.A01;
    }

    @Override // X.JL0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMicroProductDiscountTileDict", AbstractC40081Hq7.A00(this));
    }

    @Override // X.JL0
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public H4G(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
