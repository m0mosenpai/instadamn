package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXI extends C17T implements InterfaceC39501sV {
    @Override // X.InterfaceC39501sV
    public final List Aq7() {
        return A08(-930859336, HXH.class);
    }

    @Override // X.InterfaceC39501sV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37391GdX.A00(this));
    }

    @Override // X.InterfaceC39501sV
    public final String BxF() {
        return A0i(-902467928);
    }

    @Override // X.InterfaceC39501sV
    public final C39491sU F6d() {
        ArrayList arrayList;
        List Aq7 = Aq7();
        if (Aq7 != null) {
            arrayList = AbstractC167017dG.A0q(Aq7);
            Iterator it = Aq7.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC39481sT) it.next()).F6b());
            }
        } else {
            arrayList = null;
        }
        return new C39491sU(arrayList, A0i(-902467928));
    }
}
