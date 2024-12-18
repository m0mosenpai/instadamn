package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BTm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25599BTm extends C17T implements InterfaceC84363pT {
    public List A00;

    @Override // X.InterfaceC84363pT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, BFE.A00(this));
    }

    @Override // X.InterfaceC84363pT
    public final List getItems() {
        List list = this.A00;
        if (list == null) {
            return A08(100526016, C27253C0t.class);
        }
        return list;
    }

    @Override // X.InterfaceC84363pT
    public final InterfaceC84363pT E9D(C1DY c1dy) {
        ArrayList arrayList;
        List<InterfaceC103524lS> items = getItems();
        if (items != null) {
            arrayList = AbstractC167017dG.A0q(items);
            for (InterfaceC103524lS interfaceC103524lS : items) {
                interfaceC103524lS.E9C(c1dy);
                arrayList.add(interfaceC103524lS);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC84363pT
    public final C84353pS EwM(C1DY c1dy) {
        ArrayList arrayList;
        List items = getItems();
        if (items != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(items, 10));
            Iterator it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC103524lS) it.next()).EwL(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C84353pS(arrayList);
    }

    @Override // X.InterfaceC84363pT
    public final C84353pS EwN(C1DV c1dv) {
        return EwM(AbstractC25235BEs.A0b(c1dv));
    }
}
