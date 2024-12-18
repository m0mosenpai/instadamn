package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110154xk extends C0T6 implements InterfaceC110164xl {
    public final List A00;

    public C110154xk(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC110164xl
    public final C110154xk F4N() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C110154xk) && C14360o3.A0K(this.A00, ((C110154xk) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC110164xl
    public final List C6M() {
        return this.A00;
    }

    @Override // X.InterfaceC110164xl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateTimedTextsInfo", AbstractC40561Hyh.A00(this));
    }
}
