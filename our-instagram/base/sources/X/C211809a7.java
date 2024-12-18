package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.9a7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211809a7 extends C0T6 implements JK2 {
    public final List A00;

    public C211809a7(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.JK2
    public final C211809a7 F4M() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C211809a7) && C14360o3.A0K(this.A00, ((C211809a7) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.JK2
    public final List C0d() {
        return this.A00;
    }

    @Override // X.JK2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateTimedStickersInfo", AbstractC225859y4.A00(this));
    }
}
