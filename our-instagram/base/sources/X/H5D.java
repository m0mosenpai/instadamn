package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H5D extends C0T6 implements JM9 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Override // X.JM9
    public final H5D EzZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5D) {
                H5D h5d = (H5D) obj;
                if (!C14360o3.A0K(this.A01, h5d.A01) || !C14360o3.A0K(this.A05, h5d.A05) || !C14360o3.A0K(this.A02, h5d.A02) || !C14360o3.A0K(this.A00, h5d.A00) || !C14360o3.A0K(this.A03, h5d.A03) || !C14360o3.A0K(this.A04, h5d.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM9
    public final String AZE() {
        return this.A01;
    }

    @Override // X.JM9
    public final List Acq() {
        return this.A05;
    }

    @Override // X.JM9
    public final String Anz() {
        return this.A02;
    }

    @Override // X.JM9
    public final Integer Bmr() {
        return this.A00;
    }

    @Override // X.JM9
    public final String Bmu() {
        return this.A03;
    }

    @Override // X.JM9
    public final String C5f() {
        return this.A04;
    }

    @Override // X.JM9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShowreelPayload", AbstractC40246HtC.A00(this));
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public H5D(Integer num, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A05 = list;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
        this.A04 = str4;
    }
}
