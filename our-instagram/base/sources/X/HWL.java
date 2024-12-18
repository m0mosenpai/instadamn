package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWL extends C17T implements InterfaceC38101pu {
    @Override // X.InterfaceC38101pu
    public final InterfaceC130575v2 AtL() {
        return (InterfaceC130575v2) A04(1424397876, HWK.class);
    }

    @Override // X.InterfaceC38101pu
    public final InterfaceC130575v2 B8t() {
        return (InterfaceC130575v2) A05(38056004, HWK.class);
    }

    @Override // X.InterfaceC38101pu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40702I2i.A00(this));
    }

    @Override // X.InterfaceC38101pu
    public final List AtH() {
        return A0l(1293906483);
    }

    @Override // X.InterfaceC38101pu
    public final String CDG() {
        return A0i(1239095321);
    }

    @Override // X.InterfaceC38101pu
    public final C38091pt F5P() {
        C130565v1 c130565v1;
        List A0l = A0l(1293906483);
        C130565v1 F5O = AtL().F5O();
        InterfaceC130575v2 B8t = B8t();
        if (B8t != null) {
            c130565v1 = B8t.F5O();
        } else {
            c130565v1 = null;
        }
        return new C38091pt(F5O, c130565v1, A0i(-900774058), A0i(1239095321), A0l);
    }

    @Override // X.InterfaceC38101pu
    public final String getMediaId() {
        return A0i(-900774058);
    }
}
