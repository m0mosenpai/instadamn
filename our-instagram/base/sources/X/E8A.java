package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class E8A extends C0T6 implements InterfaceC37269GbM {
    public final List A00;

    public E8A(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC37269GbM
    public final E8A F0s(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC37269GbM
    public final E8A F0t(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8A) && C14360o3.A0K(this.A00, ((E8A) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC37269GbM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryMentionRequestInfo", AbstractC33744EvW.A00(this));
    }

    @Override // X.InterfaceC37269GbM
    public final List BoI() {
        return this.A00;
    }

    @Override // X.InterfaceC37269GbM
    public final InterfaceC37269GbM EAL(C1DY c1dy) {
        return this;
    }
}
