package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3pS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84353pS extends C0T6 implements InterfaceC84363pT {
    public final List A00;

    @Override // X.InterfaceC84363pT
    public final InterfaceC84363pT E9D(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84363pT
    public final C84353pS EwM(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84363pT
    public final C84353pS EwN(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C84353pS) && C14360o3.A0K(this.A00, ((C84353pS) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.InterfaceC84363pT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaNotesResponse", BFE.A00(this));
    }

    @Override // X.InterfaceC84363pT
    public final List getItems() {
        return this.A00;
    }

    public C84353pS(List list) {
        this.A00 = list;
    }
}
