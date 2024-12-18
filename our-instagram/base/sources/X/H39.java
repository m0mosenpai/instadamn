package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H39 extends C0T6 implements InterfaceC43533JKt {
    public final String A00;
    public final List A01;
    public final List A02;

    @Override // X.InterfaceC43533JKt
    public final H39 EtA() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H39) {
                H39 h39 = (H39) obj;
                if (!C14360o3.A0K(this.A01, h39.A01) || !C14360o3.A0K(this.A00, h39.A00) || !C14360o3.A0K(this.A02, h39.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43533JKt
    public final List Abm() {
        return this.A01;
    }

    @Override // X.InterfaceC43533JKt
    public final String B01() {
        return this.A00;
    }

    @Override // X.InterfaceC43533JKt
    public final List BJY() {
        return this.A02;
    }

    @Override // X.InterfaceC43533JKt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTDynamicAdsLinks", AbstractC39906Hmt.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public H39(List list, List list2, String str) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = list2;
    }
}
