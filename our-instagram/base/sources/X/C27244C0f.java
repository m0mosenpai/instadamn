package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C0f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27244C0f extends C17T implements InterfaceC88383wt {
    @Override // X.InterfaceC88383wt
    public final List BJ0() {
        return A08(-1598910135, HP3.class);
    }

    @Override // X.InterfaceC88383wt
    public final List BXH() {
        return A08(3387192, HP3.class);
    }

    @Override // X.InterfaceC88383wt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, BFU.A00(this));
    }

    @Override // X.InterfaceC88383wt
    public final C88373ws Etg() {
        ArrayList arrayList;
        List BJ0 = BJ0();
        ArrayList arrayList2 = null;
        if (BJ0 != null) {
            arrayList = AbstractC167007dF.A0i(BJ0);
            Iterator it = BJ0.iterator();
            while (it.hasNext()) {
                AbstractC25236BEt.A0v(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        List BXH = BXH();
        if (BXH != null) {
            arrayList2 = AbstractC167007dF.A0i(BXH);
            Iterator it2 = BXH.iterator();
            while (it2.hasNext()) {
                AbstractC25236BEt.A0v(arrayList2, it2);
            }
        }
        return new C88373ws(arrayList, arrayList2);
    }
}
