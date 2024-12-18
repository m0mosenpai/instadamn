package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81173jm extends C0T6 implements InterfaceC81183jn {
    public final Boolean A00;
    public final List A01;

    public C81173jm(Boolean bool, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = bool;
        this.A01 = list;
    }

    @Override // X.InterfaceC81183jn
    public final C81173jm Ey0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81173jm) {
                C81173jm c81173jm = (C81173jm) obj;
                if (!C14360o3.A0K(this.A00, c81173jm.A00) || !C14360o3.A0K(this.A01, c81173jm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC81183jn
    public final Boolean BCU() {
        return this.A00;
    }

    @Override // X.InterfaceC81183jn
    public final List BdF() {
        return this.A01;
    }

    @Override // X.InterfaceC81183jn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPinnedChannelsInfoDict", AbstractC31217Do0.A00(this));
    }
}
