package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C0Y extends C17T implements C5HL {
    @Override // X.C5HL
    public final List B9u() {
        return A08(-798613960, C27245C0h.class);
    }

    @Override // X.C5HL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDB.A00(this));
    }

    @Override // X.C5HL
    public final C26125BhB Erw() {
        ArrayList arrayList;
        List B9u = B9u();
        if (B9u != null) {
            arrayList = AbstractC167017dG.A0q(B9u);
            Iterator it = B9u.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31129DmC) it.next()).Ett());
            }
        } else {
            arrayList = null;
        }
        return new C26125BhB(arrayList);
    }
}
