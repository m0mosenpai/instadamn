package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXK extends C17T implements InterfaceC38221qC {
    @Override // X.InterfaceC38221qC
    public final List AtO() {
        return A08(-1362760786, HXJ.class);
    }

    @Override // X.InterfaceC38221qC
    public final List BOJ() {
        return A08(-997533735, HXJ.class);
    }

    @Override // X.InterfaceC38221qC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37390GdW.A00(this));
    }

    @Override // X.InterfaceC38221qC
    public final List BTJ() {
        return A0n(-450145922);
    }

    @Override // X.InterfaceC38221qC
    public final C38211qB F6e() {
        ArrayList arrayList;
        List AtO = AtO();
        ArrayList arrayList2 = null;
        if (AtO != null) {
            arrayList = AbstractC167007dF.A0i(AtO);
            Iterator it = AtO.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC39521sX) it.next()).F6c());
            }
        } else {
            arrayList = null;
        }
        List BOJ = BOJ();
        if (BOJ != null) {
            arrayList2 = AbstractC167007dF.A0i(BOJ);
            Iterator it2 = BOJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC39521sX) it2.next()).F6c());
            }
        }
        return new C38211qB(arrayList, arrayList2, A0n(-450145922));
    }
}
