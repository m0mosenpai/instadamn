package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Eh1 extends C17T implements InterfaceC37262GbF {
    @Override // X.InterfaceC37262GbF
    public final List BJ1() {
        return A0o(502611593, C33037Ehj.class);
    }

    @Override // X.InterfaceC37262GbF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33664EuE.A00(this));
    }

    @Override // X.InterfaceC37262GbF
    public final E7Z ErE() {
        List BJ1 = BJ1();
        ArrayList A0q = AbstractC167017dG.A0q(BJ1);
        Iterator it = BJ1.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC37273GbQ) it.next()).F2V());
        }
        return new E7Z(A0q);
    }
}
