package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWd extends C17T implements InterfaceC110874yz {
    @Override // X.InterfaceC110874yz
    public final List BKv() {
        return A08(523149226, HWc.class);
    }

    @Override // X.InterfaceC110874yz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I39.A00(this));
    }

    @Override // X.InterfaceC110874yz
    public final String BUT() {
        return A0i(-1669102142);
    }

    @Override // X.InterfaceC110874yz
    public final C110864yy F5m() {
        ArrayList arrayList;
        List BKv = BKv();
        if (BKv != null) {
            arrayList = AbstractC167017dG.A0q(BKv);
            Iterator it = BKv.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMQ) it.next()).F5l());
            }
        } else {
            arrayList = null;
        }
        return new C110864yy(arrayList, A0i(-1669102142));
    }
}
