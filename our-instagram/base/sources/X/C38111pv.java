package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38111pv extends C0T6 implements InterfaceC38121pw {
    public final List A00;

    @Override // X.InterfaceC38121pw
    public final C38111pv F5N(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38111pv) && C14360o3.A0K(this.A00, ((C38111pv) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.InterfaceC38121pw
    public final List B1N() {
        return this.A00;
    }

    @Override // X.InterfaceC38121pw
    public final InterfaceC38121pw EBc(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38121pw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTEmptyStoryStateMediaData", AbstractC40699I2f.A00(this));
    }

    public C38111pv(List list) {
        this.A00 = list;
    }
}
