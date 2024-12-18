package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HVR extends C17T implements InterfaceC43522JKi {
    @Override // X.InterfaceC43522JKi
    public final List B13() {
        return A08(654519859, HVS.class);
    }

    @Override // X.InterfaceC43522JKi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40434HwP.A00(this));
    }

    @Override // X.InterfaceC43522JKi
    public final String BTv() {
        return A0j(-1193720462);
    }

    @Override // X.InterfaceC43522JKi
    public final C38808H6y F3b() {
        ArrayList arrayList;
        List B13 = B13();
        if (B13 != null) {
            arrayList = AbstractC167017dG.A0q(B13);
            Iterator it = B13.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43544JLe) it.next()).F3c());
            }
        } else {
            arrayList = null;
        }
        return new C38808H6y(arrayList, A0j(-1193720462));
    }
}
