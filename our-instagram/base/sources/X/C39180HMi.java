package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39180HMi extends C17T implements InterfaceC106374qr {
    @Override // X.InterfaceC106374qr
    public final List Ac6() {
        return A0o(-847398795, C39179HMh.class);
    }

    @Override // X.InterfaceC106374qr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39731Hk1.A00(this));
    }

    @Override // X.InterfaceC106374qr
    public final String BjV() {
        return A0h(964289556);
    }

    @Override // X.InterfaceC106374qr
    public final String C3E() {
        return A0i(-2079578164);
    }

    @Override // X.InterfaceC106374qr
    public final C106364qq Eqe() {
        List Ac6 = Ac6();
        ArrayList A0q = AbstractC167017dG.A0q(Ac6);
        Iterator it = Ac6.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC106354qp) it.next()).Eqd());
        }
        return new C106364qq(A0h(964289556), A0i(-2079578164), A0P(), A0q);
    }

    @Override // X.InterfaceC106374qr
    public final String getText() {
        return A0P();
    }
}
