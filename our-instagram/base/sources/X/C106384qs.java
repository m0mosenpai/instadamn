package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106384qs extends C0T6 implements InterfaceC106394qt {
    public final InterfaceC106354qp A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC106394qt
    public final C106384qs Eqh() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106384qs) {
                C106384qs c106384qs = (C106384qs) obj;
                if (!C14360o3.A0K(this.A02, c106384qs.A02) || !C14360o3.A0K(this.A01, c106384qs.A01) || !C14360o3.A0K(this.A00, c106384qs.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A02;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC106354qp interfaceC106354qp = this.A00;
        return hashCode2 + (interfaceC106354qp != null ? interfaceC106354qp.hashCode() : 0);
    }

    @Override // X.InterfaceC106394qt
    public final List Bjh() {
        return this.A02;
    }

    @Override // X.InterfaceC106394qt
    public final String CB2() {
        return this.A01;
    }

    @Override // X.InterfaceC106394qt
    public final InterfaceC106354qp CCS() {
        return this.A00;
    }

    @Override // X.InterfaceC106394qt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiFeedIniInfo", AbstractC39735Hk5.A00(this));
    }

    public C106384qs(InterfaceC106354qp interfaceC106354qp, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = interfaceC106354qp;
    }
}
