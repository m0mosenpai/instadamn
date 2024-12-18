package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H59 extends C0T6 implements JLW {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.JLW
    public final H59 EzW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H59) {
                H59 h59 = (H59) obj;
                if (!C14360o3.A0K(this.A00, h59.A00) || !C14360o3.A0K(this.A01, h59.A01) || !C14360o3.A0K(this.A03, h59.A03) || !C14360o3.A0K(this.A02, h59.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLW
    public final String AYe() {
        return this.A00;
    }

    @Override // X.JLW
    public final String C3Z() {
        return this.A01;
    }

    @Override // X.JLW
    public final List C3r() {
        return this.A03;
    }

    @Override // X.JLW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingFeaturedProductMediaCTA", AbstractC40240Ht4.A00(this));
    }

    @Override // X.JLW
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public H59(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A02 = str3;
    }
}
