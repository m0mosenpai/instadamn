package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HS2 extends C17T implements JL4 {
    @Override // X.JL4
    public final List Abm() {
        return A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    @Override // X.JL4
    public final List BJY() {
        return A08(1180716295, ImmutablePandoAndroidLink.class);
    }

    @Override // X.JL4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40173Hrl.A00(this));
    }

    @Override // X.JL4
    public final C38744H4j EyO() {
        ArrayList arrayList;
        List Abm = Abm();
        ArrayList arrayList2 = null;
        if (Abm != null) {
            arrayList = AbstractC167007dF.A0i(Abm);
            Iterator it = Abm.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        List BJY = BJY();
        if (BJY != null) {
            arrayList2 = AbstractC167007dF.A0i(BJY);
            Iterator it2 = BJY.iterator();
            while (it2.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList2, it2);
            }
        }
        return new C38744H4j(arrayList, arrayList2, A0j(1753008747));
    }

    @Override // X.JL4
    public final String getProductId() {
        return A0j(1753008747);
    }
}
