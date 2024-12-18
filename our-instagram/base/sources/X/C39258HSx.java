package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.ImmutablePandoIgShowreelCompositionAssetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HSx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39258HSx extends C17T implements JM9 {
    @Override // X.JM9
    public final List Acq() {
        return A08(1587841910, ImmutablePandoIgShowreelCompositionAssetInfo.class);
    }

    @Override // X.JM9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40246HtC.A00(this));
    }

    @Override // X.JM9
    public final String AZE() {
        return A0i(92655287);
    }

    @Override // X.JM9
    public final String Anz() {
        return A0i(-173873537);
    }

    @Override // X.JM9
    public final Integer Bmr() {
        return getOptionalIntValueByHashCode(242813238);
    }

    @Override // X.JM9
    public final String Bmu() {
        return A0i(-1727004274);
    }

    @Override // X.JM9
    public final String C5f() {
        return A0i(1769642752);
    }

    @Override // X.JM9
    public final H5D EzZ() {
        ArrayList arrayList;
        String A0i = A0i(92655287);
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
        return new H5D(getOptionalIntValueByHashCode(242813238), A0i, A0i(-173873537), A0i(-1727004274), A0i(1769642752), arrayList);
    }
}
