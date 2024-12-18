package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.Grp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38246Grp extends C0T6 implements InterfaceC43506JJs {
    public final List A00;

    public C38246Grp(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC43506JJs
    public final C38246Grp Eud() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38246Grp) && C14360o3.A0K(this.A00, ((C38246Grp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43506JJs
    public final List AiQ() {
        return this.A00;
    }

    @Override // X.InterfaceC43506JJs
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGConsiderAndBrowseOptions", AbstractC39976HoE.A00(this));
    }
}
