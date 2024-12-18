package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C0p extends C17T implements InterfaceC104904o2 {
    @Override // X.InterfaceC104904o2
    public final List AyF() {
        return A08(518602296, C27248C0l.class);
    }

    @Override // X.InterfaceC104904o2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDJ.A00(this));
    }

    @Override // X.InterfaceC104904o2
    public final String B9b() {
        return A0i(133840522);
    }

    @Override // X.InterfaceC104904o2
    public final C106004qE Evb() {
        ArrayList arrayList;
        List AyF = AyF();
        if (AyF != null) {
            arrayList = AbstractC167017dG.A0q(AyF);
            Iterator it = AyF.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC105994qD) it.next()).EuM());
            }
        } else {
            arrayList = null;
        }
        return new C106004qE(arrayList, A0i(133840522));
    }
}
