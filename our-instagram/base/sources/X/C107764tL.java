package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107764tL extends C0T6 implements InterfaceC107774tM {
    public final List A00;

    @Override // X.InterfaceC107774tM
    public final C107764tL EuA() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C107764tL) && C14360o3.A0K(this.A00, ((C107764tL) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.InterfaceC107774tM
    public final List AZh() {
        return this.A00;
    }

    @Override // X.InterfaceC107774tM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHighlightsInfoDict", BFN.A00(this));
    }

    public C107764tL(List list) {
        this.A00 = list;
    }
}
