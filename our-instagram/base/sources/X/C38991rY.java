package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38991rY extends C0T6 implements InterfaceC39001rZ {
    public final List A00;

    public C38991rY(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC39001rZ
    public final C38991rY EtO() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38991rY) && C14360o3.A0K(this.A00, ((C38991rY) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC39001rZ
    public final List CIr() {
        return this.A00;
    }

    @Override // X.InterfaceC39001rZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBUserTagInfosDict", AbstractC37353Gcv.A00(this));
    }
}
