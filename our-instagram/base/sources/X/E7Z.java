package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class E7Z extends C0T6 implements InterfaceC37262GbF {
    public final List A00;

    public E7Z(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC37262GbF
    public final E7Z ErE() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E7Z) && C14360o3.A0K(this.A00, ((E7Z) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC37262GbF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBioInterestsResponse", AbstractC33664EuE.A00(this));
    }

    @Override // X.InterfaceC37262GbF
    public final List BJ1() {
        return this.A00;
    }
}
