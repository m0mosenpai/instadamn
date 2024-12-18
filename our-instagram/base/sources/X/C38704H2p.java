package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H2p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38704H2p extends C0T6 implements InterfaceC43505JJr {
    public final List A00;

    public C38704H2p(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC43505JJr
    public final C38704H2p EsF() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38704H2p) && C14360o3.A0K(this.A00, ((C38704H2p) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43505JJr
    public final List CFe() {
        return this.A00;
    }

    @Override // X.InterfaceC43505JJr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsTemplatesReusableMediaAssetInfo", AbstractC39830Hle.A00(this));
    }
}
