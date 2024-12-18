package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81723kh extends C0T6 implements InterfaceC81733ki {
    public final int A00;
    public final List A01;

    public C81723kh(List list, int i) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
    }

    @Override // X.InterfaceC81733ki
    public final C81723kh EqZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81723kh) {
                C81723kh c81723kh = (C81723kh) obj;
                if (!C14360o3.A0K(this.A01, c81723kh.A01) || this.A00 != c81723kh.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    @Override // X.InterfaceC81733ki
    public final List B9F() {
        return this.A01;
    }

    @Override // X.InterfaceC81733ki
    public final int C9n() {
        return this.A00;
    }

    @Override // X.InterfaceC81733ki
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTActiveStandaloneFundraisers", AbstractC37375GdH.A00(this));
    }
}
