package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6D extends C0T6 implements InterfaceC43513JJz {
    public final List A00;

    public H6D(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC43513JJz
    public final H6D F2E() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H6D) && C14360o3.A0K(this.A00, ((H6D) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43513JJz
    public final List AdQ() {
        return this.A00;
    }

    @Override // X.InterfaceC43513JJz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTextAttributions", AbstractC40340Huk.A00(this));
    }
}
