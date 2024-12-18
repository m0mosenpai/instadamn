package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HVo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39291HVo extends C17T implements InterfaceC110164xl {
    @Override // X.InterfaceC110164xl
    public final List C6M() {
        return A0o(1975397629, C39292HVp.class);
    }

    @Override // X.InterfaceC110164xl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40561Hyh.A00(this));
    }

    @Override // X.InterfaceC110164xl
    public final C110154xk F4N() {
        List C6M = C6M();
        ArrayList A0q = AbstractC167017dG.A0q(C6M);
        Iterator it = C6M.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC93104Fm) it.next()).F4O());
        }
        return new C110154xk(A0q);
    }
}
