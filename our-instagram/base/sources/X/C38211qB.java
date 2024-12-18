package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38211qB extends C0T6 implements InterfaceC38221qC {
    public final List A00;
    public final List A01;
    public final List A02;

    @Override // X.InterfaceC38221qC
    public final C38211qB F6e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38211qB) {
                C38211qB c38211qB = (C38211qB) obj;
                if (!C14360o3.A0K(this.A00, c38211qB.A00) || !C14360o3.A0K(this.A01, c38211qB.A01) || !C14360o3.A0K(this.A02, c38211qB.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A00;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.A01;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A02;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // X.InterfaceC38221qC
    public final List AtO() {
        return this.A00;
    }

    @Override // X.InterfaceC38221qC
    public final List BOJ() {
        return this.A01;
    }

    @Override // X.InterfaceC38221qC
    public final List BTJ() {
        return this.A02;
    }

    @Override // X.InterfaceC38221qC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientInvalidationRules", AbstractC37390GdW.A00(this));
    }

    public C38211qB(List list, List list2, List list3) {
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
    }
}
