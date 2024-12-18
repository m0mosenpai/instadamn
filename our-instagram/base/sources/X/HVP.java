package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.ImmutablePandoIgShowreelCompositionAssetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HVP extends C17T implements InterfaceC43564JLy {
    @Override // X.InterfaceC43564JLy
    public final List Acq() {
        return A08(1587841910, ImmutablePandoIgShowreelCompositionAssetInfo.class);
    }

    @Override // X.InterfaceC43564JLy
    public final UrpRendererType Bmq() {
        return (UrpRendererType) A0M(242813238, JC7.A00);
    }

    @Override // X.InterfaceC43564JLy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40430HwL.A00(this));
    }

    @Override // X.InterfaceC43564JLy
    public final String BOt() {
        return A0i(-894921330);
    }

    @Override // X.InterfaceC43564JLy
    public final String Bmu() {
        return A0h(-1727004274);
    }

    @Override // X.InterfaceC43564JLy
    public final String C5f() {
        return A0i(1769642752);
    }

    @Override // X.InterfaceC43564JLy
    public final C38807H6x F3W() {
        ArrayList arrayList;
        List Acq = Acq();
        if (Acq != null) {
            arrayList = AbstractC167017dG.A0q(Acq);
            Iterator it = Acq.iterator();
            while (it.hasNext()) {
                arrayList.add(((IgShowreelCompositionAssetInfoIntf) it.next()).F6X());
            }
        } else {
            arrayList = null;
        }
        return new C38807H6x(Bmq(), A0i(-894921330), A0h(-1727004274), A0i(1769642752), arrayList);
    }
}
