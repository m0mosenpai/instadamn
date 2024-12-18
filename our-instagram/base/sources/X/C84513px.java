package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84513px extends C0T6 implements InterfaceC84523py {
    public final List A00;

    public C84513px(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC84523py
    public final InterfaceC84523py EBB(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84523py
    public final C84513px F3h(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84523py
    public final C84513px F3i(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C84513px) && C14360o3.A0K(this.A00, ((C84513px) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC84523py
    public final List CIr() {
        return this.A00;
    }

    @Override // X.InterfaceC84523py
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserTagInfosDict", AbstractC37370GdC.A00(this));
    }
}
