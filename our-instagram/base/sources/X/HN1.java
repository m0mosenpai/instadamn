package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HN1 extends C17T implements InterfaceC43500JJm {
    @Override // X.InterfaceC43500JJm
    public final List Bgx() {
        return A0o(1178130893, HN2.class);
    }

    @Override // X.InterfaceC43500JJm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39754HkQ.A00(this));
    }

    @Override // X.InterfaceC43500JJm
    public final H2K Er2() {
        List Bgx = Bgx();
        ArrayList A0q = AbstractC167017dG.A0q(Bgx);
        Iterator it = Bgx.iterator();
        while (it.hasNext()) {
            A0q.add(((JK8) it.next()).Er3());
        }
        return new H2K(A0q);
    }
}
