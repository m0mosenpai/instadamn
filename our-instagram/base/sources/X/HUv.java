package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HUv extends C17T implements InterfaceC43515JKb {
    @Override // X.InterfaceC43515JKb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getTitle() != null) {
            AbstractC37300Gc1.A17(getTitle(), A1I);
        }
        if (getUrl() != null) {
            AbstractC37300Gc1.A13(getUrl(), A1I);
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.InterfaceC43515JKb
    public final H6T F2i() {
        return new H6T(A0S(), A0R());
    }

    @Override // X.InterfaceC43515JKb
    public final String getTitle() {
        return A0S();
    }

    @Override // X.InterfaceC43515JKb
    public final String getUrl() {
        return A0R();
    }
}
