package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3Vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74413Vx extends C0T6 implements InterfaceC74423Vy {
    public final List A00;

    @Override // X.InterfaceC74423Vy
    public final C74413Vx EwH(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC74423Vy
    public final C74413Vx EwI(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C74413Vx) && C14360o3.A0K(this.A00, ((C74413Vx) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.InterfaceC74423Vy
    public final List Boc() {
        return this.A00;
    }

    @Override // X.InterfaceC74423Vy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaHint", AbstractC40063Hpp.A00(this));
    }

    public C74413Vx(List list) {
        this.A00 = list;
    }
}
