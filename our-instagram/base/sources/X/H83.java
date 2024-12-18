package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H83 extends C0T6 implements JK6 {
    public final List A00;

    @Override // X.JK6
    public final H83 F7D() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H83) && C14360o3.A0K(this.A00, ((H83) obj).A00));
    }

    @Override // X.JK6
    public final List B2z() {
        return this.A00;
    }

    @Override // X.JK6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAndAggregatorClientDict", I9Q.A00(this));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public H83(List list) {
        this.A00 = list;
    }
}
