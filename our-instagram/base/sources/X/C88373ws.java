package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88373ws extends C0T6 implements InterfaceC88383wt {
    public final List A00;
    public final List A01;

    @Override // X.InterfaceC88383wt
    public final C88373ws Etg() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88373ws) {
                C88373ws c88373ws = (C88373ws) obj;
                if (!C14360o3.A0K(this.A00, c88373ws.A00) || !C14360o3.A0K(this.A01, c88373ws.A01)) {
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
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // X.InterfaceC88383wt
    public final List BJ0() {
        return this.A00;
    }

    @Override // X.InterfaceC88383wt
    public final List BXH() {
        return this.A01;
    }

    @Override // X.InterfaceC88383wt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFollowUpOptionsSet", BFU.A00(this));
    }

    public C88373ws(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
