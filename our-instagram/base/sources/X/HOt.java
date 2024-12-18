package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HOt extends C17T implements InterfaceC39001rZ {
    @Override // X.InterfaceC39001rZ
    public final List CIr() {
        return A0o(3365, HOs.class);
    }

    @Override // X.InterfaceC39001rZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37353Gcv.A00(this));
    }

    @Override // X.InterfaceC39001rZ
    public final C38991rY EtO() {
        List CIr = CIr();
        ArrayList A0q = AbstractC167017dG.A0q(CIr);
        Iterator it = CIr.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC43556JLq) it.next()).EtN());
        }
        return new C38991rY(A0q);
    }
}
