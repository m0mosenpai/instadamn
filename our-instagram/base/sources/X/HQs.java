package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HQs extends C17T implements InterfaceC74423Vy {
    @Override // X.InterfaceC74423Vy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40063Hpp.A00(this));
    }

    @Override // X.InterfaceC74423Vy
    public final List Boc() {
        return A08(-1983070683, C39242HQz.class);
    }

    @Override // X.InterfaceC74423Vy
    public final C74413Vx EwH(C1DY c1dy) {
        ArrayList arrayList;
        List Boc = Boc();
        if (Boc != null) {
            arrayList = AbstractC167017dG.A0q(Boc);
            Iterator it = Boc.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC74403Vw) it.next()).EwU(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C74413Vx(arrayList);
    }

    @Override // X.InterfaceC74423Vy
    public final C74413Vx EwI(C1DV c1dv) {
        return EwH(AbstractC37304Gc5.A09(c1dv));
    }
}
