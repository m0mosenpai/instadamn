package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H3v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38732H3v extends C0T6 implements InterfaceC104994oF {
    public final List A00;

    @Override // X.InterfaceC104994oF
    public final C38732H3v EvW() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38732H3v) && C14360o3.A0K(this.A00, ((C38732H3v) obj).A00));
    }

    @Override // X.InterfaceC104994oF
    public final List BWD() {
        return this.A00;
    }

    @Override // X.InterfaceC104994oF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGSmartTextOverlays", Hp4.A00(this));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38732H3v(List list) {
        this.A00 = list;
    }
}
