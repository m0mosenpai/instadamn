package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39183HMm extends C17T implements InterfaceC106394qt {
    @Override // X.InterfaceC106394qt
    public final List Bjh() {
        return A08(-1782234803, C39180HMi.class);
    }

    @Override // X.InterfaceC106394qt
    public final InterfaceC106354qp CCS() {
        return (InterfaceC106354qp) A05(1220821741, C39179HMh.class);
    }

    @Override // X.InterfaceC106394qt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39735Hk5.A00(this));
    }

    @Override // X.InterfaceC106394qt
    public final String CB2() {
        return A0i(2092431188);
    }

    @Override // X.InterfaceC106394qt
    public final C106384qs Eqh() {
        ArrayList arrayList;
        List Bjh = Bjh();
        C106344qo c106344qo = null;
        if (Bjh != null) {
            arrayList = AbstractC167017dG.A0q(Bjh);
            Iterator it = Bjh.iterator();
            while (it.hasNext()) {
                AbstractC37302Gc3.A1Z(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String A0i = A0i(2092431188);
        InterfaceC106354qp CCS = CCS();
        if (CCS != null) {
            c106344qo = CCS.Eqd();
        }
        return new C106384qs(c106344qo, A0i, arrayList);
    }
}
