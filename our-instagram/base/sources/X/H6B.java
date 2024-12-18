package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H6B extends C0T6 implements JKX {
    public final int A00;
    public final int A01;

    @Override // X.JKX
    public final H6B F2D() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6B) {
                H6B h6b = (H6B) obj;
                if (this.A00 != h6b.A00 || this.A01 != h6b.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    @Override // X.JKX
    public final int B1r() {
        return this.A00;
    }

    @Override // X.JKX
    public final int BzY() {
        return this.A01;
    }

    @Override // X.JKX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        B1r();
        A1I.put("end", Integer.valueOf(B1r()));
        BzY();
        return AbstractC37300Gc1.A05("XDTStoryTextAttributionBoldRange", AbstractC37301Gc2.A0r("start", Integer.valueOf(BzY()), A1I));
    }

    public H6B(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
