package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShowreelNativeClientName;
import java.util.List;

/* loaded from: classes7.dex */
public final class H5B extends C0T6 implements C69N {
    public final ShowreelNativeClientName A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public H5B(ShowreelNativeClientName showreelNativeClientName, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        AbstractC25233BEq.A0x(1, str, showreelNativeClientName, str2);
        C14360o3.A0B(str4, 8);
        this.A03 = str;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = showreelNativeClientName;
        this.A04 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = num2;
    }

    @Override // X.C69N
    public final H5B EzX() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5B) {
                H5B h5b = (H5B) obj;
                if (!C14360o3.A0K(this.A03, h5b.A03) || !C14360o3.A0K(this.A07, h5b.A07) || !C14360o3.A0K(this.A08, h5b.A08) || this.A00 != h5b.A00 || !C14360o3.A0K(this.A04, h5b.A04) || !C14360o3.A0K(this.A01, h5b.A01) || !C14360o3.A0K(this.A05, h5b.A05) || !C14360o3.A0K(this.A06, h5b.A06) || !C14360o3.A0K(this.A02, h5b.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C69N
    public final String Abu() {
        return this.A03;
    }

    @Override // X.C69N
    public final List Acx() {
        return this.A07;
    }

    @Override // X.C69N
    public final List Acz() {
        return this.A08;
    }

    @Override // X.C69N
    public final ShowreelNativeClientName Any() {
        return this.A00;
    }

    @Override // X.C69N
    public final String Aqq() {
        return this.A04;
    }

    @Override // X.C69N
    public final Integer BDS() {
        return this.A01;
    }

    @Override // X.C69N
    public final String BOt() {
        return this.A05;
    }

    @Override // X.C69N
    public final String C5i() {
        return this.A06;
    }

    @Override // X.C69N
    public final Integer CHg() {
        return this.A02;
    }

    @Override // X.C69N
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShowreelNativeAnimation", Ht8.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A06, (((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A00, (((AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
