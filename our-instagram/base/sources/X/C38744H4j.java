package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H4j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38744H4j extends C0T6 implements JL4 {
    public final String A00;
    public final List A01;
    public final List A02;

    @Override // X.JL4
    public final C38744H4j EyO() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38744H4j) {
                C38744H4j c38744H4j = (C38744H4j) obj;
                if (!C14360o3.A0K(this.A01, c38744H4j.A01) || !C14360o3.A0K(this.A02, c38744H4j.A02) || !C14360o3.A0K(this.A00, c38744H4j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL4
    public final List Abm() {
        return this.A01;
    }

    @Override // X.JL4
    public final List BJY() {
        return this.A02;
    }

    @Override // X.JL4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductPickerPageCTAInfo", AbstractC40173Hrl.A00(this));
    }

    @Override // X.JL4
    public final String getProductId() {
        return this.A00;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C38744H4j(List list, List list2, String str) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = str;
    }
}
